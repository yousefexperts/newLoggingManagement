/**
 * Created by morak on 7/28/16.
 */

var GunlukEmirUtils = {
    stompClient: null,
    setConnected: function (connected) {
        document.getElementById('connect').disabled = connected;
        document.getElementById('disconnect').disabled = !connected;
    },
    connect: function () {
        var socket = new SockJS('/bipwebapp/ws/gunlukemir');
        stompClient = Stomp.over(socket);
        // stompClient.debug = null;
        stompClient.connect({}, function (frame) {
            // GunlukEmirUtils.setConnected(true);
            console.log('Connected: ' + frame);
            stompClient.subscribe('/topic/gunlukemir-client-stream', function (marketEvent) {
            	if (marketEvent.body === "{msg:'#'}")
                    return;
                GunlukEmirUtils.showRespose(marketEvent.body);
            });
        });
    },
    disconnect: function () {
        if (stompClient != null) {
            stompClient.disconnect();
        }
        GunlukEmirUtils.setConnected(false);
        console.log("Disconnected");
    },
    showRespose: function (marketEventData) {
        var jsonParse = JSON.parse(marketEventData);
        var type = jsonParse.transactType;
        var marketEvent = jsonParse.marketEvent;
        if (type == "add") {
            var tableSelect = marketEvent.opType == 1 ? 'stocks-table-bid' : 'stocks-table-ask';
            var theTemplateScript = $("#stock-tr-template").html();
            var theTemplate = Handlebars.compile(theTemplateScript);
            var theCompiledHtml = theTemplate(marketEvent);
            $(theCompiledHtml).hide().insertBefore('table#' + tableSelect + ' > tbody > tr:first').fadeIn();
        } else if (type == "remove") {
            $('tr#' + marketEvent.idNative).remove();
        } else if (type=="match"){
            var matchEvent = jsonParse.matchEvent;
            var matchOutput = jsonParse.matchOutput;
	        $('tr#' + marketEvent.idNative + ' td.amountClass').text(marketEvent.matchAmount);
	        $('tr#' + matchEvent.idNative + ' td.amountClass').text(matchEvent.matchAmount);
	        var islem = marketEvent.opType == 1 ? 'Alış' : 'Satış';
	        var islemMatch = matchEvent.opType == 1 ? 'Alış' : 'Satış';
	        $('<tr id="' + marketEvent.idNative + 'M' + '"><td>' + islem + '</td><td>' + marketEvent.idNative + '</td><td>' + marketEvent.accountId + '</td><td>' + matchOutput.symbol + '</td><td>' + marketEvent.amount + '</td><td>' 
	        	+ marketEvent.matchAmount + '</td><td>' + marketEvent.price + '</td><td>' + matchOutput.lastMatchPrice + '</td><td>' + matchOutput.lastMatchAmount + '</td><td>'
	            + matchOutput.lastMatchTime + '</td></tr>').insertBefore('table#matchs-table > tbody > tr:first');
	        $('tr#' + matchEvent.idNative + ' td.amountClass').text(matchEvent.matchAmount);
	        $('<tr id="' + matchEvent.idNative + 'M' + '"><td>' + islemMatch + '</td><td>' + matchEvent.idNative + '</td><td>' + matchEvent.accountId + '</td><td>' + matchOutput.symbol + '</td><td>' + matchEvent.amount + '</td><td>' 
	        	+ matchEvent.matchAmount + '</td><td>' + matchEvent.price + '</td><td>' + matchOutput.lastMatchPrice + '</td><td>' + matchOutput.lastMatchAmount + '</td><td>'
	            + matchOutput.lastMatchTime + '</td></tr>').insertBefore('table#matchs-table > tbody > tr:first');
        }
            
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
    }
};

$(document).ready(function () {
    GunlukEmirUtils.connect();
    GunlukEmirUtils.applySlimScrollToContainer("div.stocks-table-bid-panel-body", '500px');
    GunlukEmirUtils.applySlimScrollToContainer("div.stocks-table-ask-panel-body", '500px');

});