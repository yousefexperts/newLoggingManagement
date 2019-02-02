/**
 * Created by morak on 7/28/16.
 */

var BoardUtils = {
    stompClient: null,
    setConnected: function (connected) {
        document.getElementById('connect').disabled = connected;
        document.getElementById('disconnect').disabled = !connected;
    },
    connect: function () {
        var socket = new SockJS('/bipwebapp/ws/board');
        stompClient = Stomp.over(socket);
        // stompClient.debug = null;
        stompClient.connect({}, function (frame) {
            // BoardUtils.setConnected(true);
            console.log('Connected: ' + frame);
            stompClient.subscribe('/topic/board-client-stream', function (marketEvent) {
                if (marketEvent.body === "{msg:'#'}")
                    return;
                BoardUtils.showRespose(marketEvent.body);
            });
        });
    },
    disconnect: function () {
        if (stompClient != null) {
            stompClient.disconnect();
        }
        BoardUtils.setConnected(false);
        console.log("Disconnected");
    },
    showRespose: function (marketEventData) {
        var jsonParse = JSON.parse(marketEventData);
        var type = jsonParse.transactType;

        if (type == "portfoy") {
            var portfoyData = jsonParse.portfoyData;
            var matchState = jsonParse.matchState;
            var renk = "";
            var htmlSelect = $('tr#' + portfoyData.symbol);
            htmlSelect.find('td#lastMatchPrice').text(portfoyData.lastMatchPrice == null ? '' : portfoyData.lastMatchPrice);
            htmlSelect.find('td.bestBidPrice').text(portfoyData.bestBidPrice == null ? '' : portfoyData.bestBidPrice);
            htmlSelect.find('td.bestAskPrice').text(portfoyData.bestAskPrice == null ? '' : portfoyData.bestAskPrice);
            htmlSelect.find('td#perPriceChange').removeClass("highlighted-deep").removeClass("nonhighlighted-deep").addClass(portfoyData.perPriceClass);
            htmlSelect.find('td#perPriceChange').text(portfoyData.perPriceChange == null ? '' : portfoyData.perPriceChange);
            htmlSelect.find('td.closePrice').text(portfoyData.closePrice == null ? '' : portfoyData.closePrice);
            if (matchState == "match") {
                var img = $('<img id="' + portfoyData.symbol + 'I">'); //Equivalent: $(document.createElement('img'))
                if (portfoyData.lastTransaction == 1) {
                    renk = "nonhighlighted";
                    img.attr('src', "/bipwebapp/static/image/icon-img-up.png");
                } else if (portfoyData.lastTransaction == 2) {
                    renk = "highlighted";
                    img.attr('src', "/bipwebapp/static/image/icon-img-down.png");
                }
                htmlSelect.find('td#symbol').addClass(renk).delay(300).queue(function (next) {
                    $(this).removeClass(renk);
                    next();
                });
                htmlSelect.find('td.lastTransaction').text("");
                htmlSelect.find('td.lastTransaction').append(img);
            }
            var lenghtOpen = $("div#" + portfoyData.symbol + "-modal");
            if (lenghtOpen.length > 0){
                BoardUtils.getSymbolOnlyDeepMap(portfoyData.symbol);
                if (matchState == "match") {
                    var matchOutput = jsonParse.matchOutput;
                    var theTemplateScript = $("#symbol-deep-static-template").html();
                    var theTemplate = Handlebars.compile(theTemplateScript);
                    var theCompiledHtml = theTemplate({"outputMap": matchOutput});
                    $(theCompiledHtml).hide().insertBefore('table#' + portfoyData.symbol + 'table-symbol-match > tbody > tr:first').fadeIn();

                    var symbolDetail = jsonParse.symbolDetail;
                    var theTemplateScript1 = $("#symbol-detail-template").html();
                    var theTemplateDetail = Handlebars.compile(theTemplateScript1);
                    var theTemplateHtmlDetail = theTemplateDetail({
                        "symbolDetailMap": symbolDetail
                    });
                    $("div#" + matchOutput.symbol + "-modal div.main_containerd").html($(theTemplateHtmlDetail));
                }
            }
        }
    },
    sendBidOrder: function (symbolName) {
        if ($('input#' + symbolName + 'bestBidPrice').val() == '' || $('input#' + symbolName + 'bestBidLot').val() == '') {
        	bootbox.alert({
    		    message: 'Alış fiyat ve lot zorunlu alanlardır!!',
    		    closeButton: true,
    		    size:'small'
    		});
            return;
        }
        var message = '<b>Ürün:</b> '+symbolName +'<br/> <b>Fiyat:</b> '+ $('input#' + symbolName + 'bestBidPrice').val() 
        	+ '<br/> <b>Lot:</b> '+$('input#' + symbolName + 'bestBidLot').val()+ ' <br/> <b>İşlem:</b> Alış';
        bootbox.confirm({
            title: "Aşağıdaki emiri onaylıyor musunuz?",
            message: message,
            buttons: {
                cancel: {
                    label: '<i class="fa fa-times"></i> İptal'
                },
                confirm: {
                    label: '<i class="fa fa-check"></i> Onay'
                }
            },
            callback: function (result) {
            	if (result){
                    $.ajax({
                        type: 'POST',
                        url: restBaseUrl + "/send-manual-order",
                        data: JSON.stringify({
                            symbol: symbolName,
                            price: $('input#' + symbolName + 'bestBidPrice').val(),
                            amount: $('input#' + symbolName + 'bestBidLot').val(),
                            opType: 1
                        }),
                        dataType: 'json',
                        contentType: 'application/json',
                        success: function (retData) {
                            console.log(retData);
                            if (typeof(retData.failMessage)!="undefined" && retData.failMessage!=null){
        	                	bootbox.alert({
        	            		    message: retData.failMessage,
        	            		    closeButton: true,
        	            		    size: 'medium'
        	            		});
        	                } else {
	                            var lenghtOpen = $("div#" + symbolName + "-modal");
	                            if (lenghtOpen.length > 0){
	                                BoardUtils.getSymbolOnlyPriceChangeMap(symbolName, "refreshBoardBid", $('input#' + symbolName + 'bestBidPrice').val());
	                            }
        	                }
                        },
                        error: function (xhr, status, error) {
                            console.log("Error occured,status:" + status + ",error:" + error);
                            BoardUtils.checkSessionTimeout(xhr);
                        }
                    });
            	}            	
        	}
    	});
    },
    sendAskOrder: function (symbolName) {
        if ($('input#' + symbolName + 'bestAskPrice').val() == '' || $('input#' + symbolName + 'bestAskLot').val() == '') {
        	bootbox.alert({
    		    message: 'Satış fiyat ve lot zorunlu alanlardır!!',
    		    closeButton: true,
    		    size: 'medium'
    		});
            return;
        }
        var message = '<b>Ürün:</b> '+symbolName +'<br/> <b>Fiyat:</b> '+ $('input#' + symbolName + 'bestAskPrice').val() 
        	+ '<br/> <b>Lot:</b> '+$('input#' + symbolName + 'bestAskLot').val()+ ' <br/> <b>İşlem:</b> Satış';
        bootbox.confirm({
            title: "Aşağıdaki emiri onaylıyor musunuz?",
            message: message,
            buttons: {
                cancel: {
                    label: '<i class="fa fa-times"></i> İptal'
                },
                confirm: {
                    label: '<i class="fa fa-check"></i> Onay'
                }
            },
            callback: function (result) {
            	if (result){
            		 $.ajax({
            	            type: 'POST',
            	            url: restBaseUrl + "/send-manual-order",
            	            data: JSON.stringify({
            	                symbol: symbolName,
            	                price: $('input#' + symbolName + 'bestAskPrice').val(),
            	                amount: $('input#' + symbolName + 'bestAskLot').val(),
            	                opType: 2
            	            }),
            	            dataType: 'json',
            	            contentType: 'application/json',
            	            success: function (retData) {
            	                console.log(retData);
            	                if (typeof(retData.failMessage)!="undefined" && retData.failMessage!=null){
            	                	bootbox.alert({
            	            		    message: retData.failMessage,
            	            		    closeButton: true,
            	            		    size: 'medium'
            	            		});
            	                } else {
	            	                var lenghtOpen = $("div#" + symbolName + "-modal");
	            	                if (lenghtOpen.length > 0){
	            	                    BoardUtils.getSymbolOnlyPriceChangeMap(symbolName, "refreshBoardAsk", $('input#' + symbolName + 'bestAskPrice').val());
	            	                }
            	                }
            	            },
            	            error: function (xhr, status, error) {
            	                console.log("Error occured,status:" + status + ",error:" + error);
            	                BoardUtils.checkSessionTimeout(xhr);
            	            }
            	        });
            	}
            }
        });
       
    },
    createJqUiDialog: function (buttonId) {
        try {
            var isOpen = $("div#" + buttonId + "-modal").dialog("isOpen");
            if (typeof(isOpen) === "boolean" && isOpen) {
            	bootbox.alert({
        		    message: 'Ürüne ait açık derinlik ekranı bulunmaktadır!!',
        		    closeButton: true,
        		    size:'medium'
        		});
                return;
            }
        } catch (ex) {
            console.log(ex);
        }

        var theTemplateScript = $("#dynamic-dialog-template").html();
        var theTemplate = Handlebars.compile(theTemplateScript);
        var theCompiledHtml = theTemplate({'buttonId': buttonId});
        $(theCompiledHtml).insertAfter('#' + buttonId);

        var appendTo = '#' + buttonId;
        $("div#" + buttonId + "-modal").dialog({
            appendTo: appendTo,
            width: 400,
            height: 620,
            minWidth: 400,
            minHeight: 620,
            maxHeight: 620,
            hide: {effect: 'highlight', color: '#fcfcfc', duration: 150},
            show: {effect: 'highlight', color: '#f5f5f5'},
            open: function (event, ui) {
                $(this).css('overflow', 'hidden');
            },
            resizeStop: function( event, ui ) {
            	$(this).css('width', 'auto');
            	$(this).css('height', 'auto');
            	$("div.ui-dialog").css('height', 'auto');
            },
            close: function (event, ui) {
                $(this).remove();
            }
        });
    },
    createBootboxDialog: function (buttonId) {
        try {
        	var lenghtOpen = $("div#" + buttonId + "-modal");
            if (lenghtOpen.length>0){
            	bootbox.alert({
        		    message: 'Ürüne ait açık derinlik ekranı bulunmaktadır!!',
        		    closeButton: true,
        		    size:'medium'
        		});
                return;
            }
        } catch (ex) {
            console.log(ex);
        }

        var theTemplateScript = $("#dynamic-dialog-template").html();
        var theTemplate = Handlebars.compile(theTemplateScript);
        var theCompiledHtml = theTemplate({'buttonId': buttonId});

        var appendTo = '#' + buttonId ;   
    	var dialog = bootbox.dialog({
		    message: $(theCompiledHtml),
		    closeButton: true,
            size: "medium",
		    title: buttonId,
            appendTo: buttonId
		});
    },
    getSymbolDeepMap: function (symbol) {
        $.ajax({
            type: 'POST',
            url: restBaseUrl + "/get-symbol-deep-map",
            data: JSON.stringify({
                symbol: symbol
            }),
            dataType: 'json',
            contentType: 'application/json',
            success: function (retData) {
                var width = $(window).width();
                if (width < 1224) {
                	BoardUtils.createBootboxDialog(symbol);
                } else {
                	BoardUtils.createJqUiDialog(symbol);
                }
                var theTemplateScript = $("#symbol-detail-template").html();
                var theTemplateScript1 = $("#symbol-deep-template1").html();
                var theTemplateScript2 = $("#symbol-deep-template2").html();
                var theTemplateScript3 = $("#symbol-deep-template3").html();
                var theTemplateDetail = Handlebars.compile(theTemplateScript);
                var theTemplate1 = Handlebars.compile(theTemplateScript1);
                var theTemplate2 = Handlebars.compile(theTemplateScript2);
                var theTemplate3 = Handlebars.compile(theTemplateScript3);

                var symbolMatchMap = retData.symbolMatchMap;
                var symbolBidDeepMap = retData.symbolBidDeepMap;
                var symbolAskDeepMap = retData.symbolAskDeepMap;
                var symbolPortfolioMap = retData.symbolPortfolioMap;
                var symbolDetailMap = retData.symbolDetailMap;

                var theTemplateHtmlDetail = theTemplateDetail({
                    "symbolDetailMap": symbolDetailMap
                });

                var theCompiledHtml1 = theTemplate1({
                    "symbolDeepMapBid": symbolBidDeepMap, "symbolDeepMapAsk": symbolAskDeepMap, "symbol": symbol
                });

                var theCompiledHtml2 = theTemplate2({
                    "symbol": symbol, "bestAskPrice": symbolPortfolioMap.bestAskPrice, "bestBidPrice": symbolPortfolioMap.bestBidPrice
                });

                var theCompiledHtml3 = theTemplate3({
                    "symbol": symbol, "allOutputMap": symbolMatchMap
                });

                $("div#" + symbol + "-modal").html($(
                    "<div class='main_containerd' id='main_containerd'>" + theTemplateHtmlDetail + "</div>" +
                    "<div class='main-containera' id='main-containera'>" + theCompiledHtml1 + "</div>" +
                    "<div class='main-containerb' id='main-containerb'>" + theCompiledHtml2 + "</div>" +
                    "<div class='main-containerc' id='main-containerc'>" + theCompiledHtml3 + "</div>"));

                
                
                var bestBidLot = $("input#" + symbol + "bestBidLot");
                var bestAskLot = $("input#" + symbol + "bestAskLot");
                bestBidLot.keyup(function (event) {
                    if (event.keyCode == 13) {
                        BoardUtils.sendBidOrder(symbol);
                    }
                });
                bestAskLot.keyup(function (event) {
                    if (event.keyCode == 13) {
                        BoardUtils.sendAskOrder(symbol);
                    }
                });
                bestBidLot.inputmask({mask: "9", repeat: 10, greedy: !1});
                bestAskLot.inputmask({mask: "9", repeat: 10, greedy: !1});
	            $("input#" + symbol + "bestBidPrice").inputmask({ alias : "currency", prefix: '', digits: 4, autoGroup: !0, groupSeparator: "."});//digitsOptional: !1, clearMaskOnLostFocus: !1
	            $("input#" + symbol + "bestAskPrice").inputmask({ alias : "currency", prefix: '', digits: 4, autoGroup: !0, groupSeparator: "."});
                
	            $("table#table-bid-deep" +symbol + " tr").on('dblclick', function (e) {
                    var sumOrderAmount = $(this).find("td#sumOrderAmount").text().trim();
                    var price = $(this).find("td#price").text().trim();
                    $("input#" + symbol + "bestBidLot").val(sumOrderAmount);
                    $("input#" + symbol + "bestBidPrice").val(price);
                });
                
                $("table#table-ask-deep" +symbol + " tr").on('dblclick', function (e) {
                    var sumOrderAmount = $(this).find("td#sumOrderAmount").text().trim();
                    var price = $(this).find("td#price").text().trim();
                    $("input#" + symbol + "bestAskLot").val(sumOrderAmount);
                    $("input#" + symbol + "bestAskPrice").val(price);
                });
	            BoardUtils.applySlimScrollToContainer("div#dataTables_scrollBody", '150px');
            },
            error: function (xhr, status, error) {
                console.log("Error occured,status:" + status + ",error:" + error);
                BoardUtils.checkSessionTimeout(xhr);
            }
        });
    },
    getSymbolOnlyPriceChangeMap: function (symbol, durum, price) {
        $.ajax({
            type: 'POST',
            url: restBaseUrl + "/get-symbol-price-deep-map",
            data: JSON.stringify({
                symbol: symbol
            }),
            dataType: 'json',
            contentType: 'application/json',
            success: function (retData) {
                var theTemplateScript2 = $("#symbol-deep-template2").html();
                var theTemplate2 = Handlebars.compile(theTemplateScript2);
                var symbolPortfolioMap = retData.symbolPortfolioMap;

                var theCompiledHtml2 = theTemplate2({
                    "symbol": symbol, "bestAskPrice": symbolPortfolioMap.bestAskPrice, "bestBidPrice": symbolPortfolioMap.bestBidPrice
                });

                $("div#" + symbol + "-modal div.main-containerb").html($(theCompiledHtml2));
                if (durum == "refreshBoardAsk") {
                    if ($("#" + symbol + "bestAskPrice").val() == "")
                        $("#" + symbol + "bestAskPrice").val(price);
                    $("#" + symbol + "bestAskLot").focus();
                } else if (durum == "refreshBoardBid") {
                    $("#" + symbol + "bestBidLot").focus();
                    if ($("#" + symbol + "bestBidPrice").val() == "")
                        $("#" + symbol + "bestBidPrice").val(price);
                }
                var bestBidLot = $("input#" + symbol + "bestBidLot");
                var bestAskLot = $("input#" + symbol + "bestAskLot");
                bestBidLot.keyup(function (event) {
                    if (event.keyCode == 13) {
                        BoardUtils.sendBidOrder(symbol);
                    }
                });
                bestAskLot.keyup(function (event) {
                    if (event.keyCode == 13) {
                        BoardUtils.sendAskOrder(symbol);
                    }
                });

                bestBidLot.inputmask({mask: "9", repeat: 10, greedy: !1});
                bestAskLot.inputmask({mask: "9", repeat: 10, greedy: !1});
	            $("input#" + symbol + "bestBidPrice").inputmask({ alias : "currency", prefix: '', digits: 4, autoGroup: !0, groupSeparator: "."});
	            $("input#" + symbol + "bestAskPrice").inputmask({ alias : "currency", prefix: '', digits: 4, autoGroup: !0, groupSeparator: "."});
                BoardUtils.applySlimScrollToContainer("div#dataTables_scrollBody", '150px');
            },
            error: function (xhr, status, error) {
                console.log("Error occured,status:" + status + ",error:" + error);
                BoardUtils.checkSessionTimeout(xhr);
            }
        });
    },
    getSymbolOnlyDeepMap: function (symbol) {
        $.ajax({
            type: 'POST',
            url: restBaseUrl + "/get-symbol-only-deep-map",
            data: JSON.stringify({
                symbol: symbol
            }),
            dataType: 'json',
            contentType: 'application/json',
            success: function (retData) {
                var symbolBidDeepMap = retData.symbolBidDeepMap;
                var symbolAskDeepMap = retData.symbolAskDeepMap;
                var theTemplateScript1 = $("#symbol-deep-template1").html();
                var theTemplate1 = Handlebars.compile(theTemplateScript1);
                var theCompiledHtml1 = theTemplate1({
                    "symbolDeepMapBid": symbolBidDeepMap, "symbolDeepMapAsk": symbolAskDeepMap, "symbol": symbol
                });
                $("div#" + symbol + "-modal div.main-containera").html($(theCompiledHtml1));
                
	            $("table#table-bid-deep" + symbol + " tr").on('dblclick', function (e) {
                    var sumOrderAmount = $(this).find("td#sumOrderAmount").text().trim();
                    var price = $(this).find("td#price").text().trim();
                    $("input#" + symbol + "bestBidLot").val(sumOrderAmount);
                    $("input#" + symbol + "bestBidPrice").val(price);
                });
                
                $("table#table-ask-deep" + symbol + " tr").on('dblclick', function (e) {
                    var sumOrderAmount = $(this).find("td#sumOrderAmount").text().trim();
                    var price = $(this).find("td#price").text().trim();
                    $("input#" + symbol + "bestAskLot").val(sumOrderAmount);
                    $("input#" + symbol + "bestAskPrice").val(price);
                });
            },
            error: function (xhr, status, error) {
                console.log("Error occured,status:" + status + ",error:" + error);
                BoardUtils.checkSessionTimeout(xhr);
            }
        });
    },
    applySlimScrollToContainer: function (selector, height) {
        $(selector).slimScroll({
            height: height,
            size: '7px',
            alwaysVisible: true,
            allowPageScroll: true,
            railVisible: true
            // allowPageScroll: false
        });
    },
    checkSessionTimeout: function (xhr) {
        if (xhr.status == 403)
            window.location = loginUrl;
    }
};

Handlebars.registerHelper('formatCurrency', function (value) {
    if (value == null)
        return null;
    return value.toString().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,");
});


$(document).ready(function () {
    BoardUtils.connect();

    // large screen modals
    $(".dialog").dialog({
        autoOpen: false,
        maxWidth: 400,
        minWidth: 400,
        minHeight: 400,
        hide: {effect: 'highlight', color: '#fcfcfc', duration: 150},
        show: {effect: 'highlight', color: '#f5f5f5'},
        open: function (event, ui) {
            $('#myDialogId').css('overflow', 'hidden');
        }
    });

    $("table#stocks-table-porfolio tr").on('dblclick', function (e) {
        var symbol = $(this).find("td#symbol").text().trim();
        BoardUtils.getSymbolDeepMap(symbol);
    });

    BoardUtils.applySlimScrollToContainer("div.matchs-table-panel-body", '500px');

});