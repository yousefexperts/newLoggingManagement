/**
 * Created by morak on 7/28/16.
 */

var AlSatUtils = {
    stompClient: null,
    setConnected: function (connected) {
        document.getElementById('connect').disabled = connected;
        document.getElementById('disconnect').disabled = !connected;
    },
    sendManualOrder: function () {
        if ($('input#price').val() == '' || $('input#amount').val() == '') {
            alert('Fiyat ve lot zorunlu alanlardır!!');
            return;
        }
        $.ajax({
            type: 'POST',
            url: restBaseUrl + "/send-manual-order",
            data: JSON.stringify({
                symbol: $('select#select-stock').val(),
                price: $('input#price').val(),
                amount: $('input#amount').val(),
                opType: $('input[name=opType]:checked').val()
            }),
            dataType: 'json',
            contentType: 'application/json',
            success: function (retData) {
                console.log(retData);
            },
            error: function (xhr, status, error) {
                console.log("Error occured,status:" + status + ",error:" + error);
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
    }
};

$(document).ready(function () {
    AlSatUtils.applySlimScrollToContainer("div.matchs-table-panel-body", '500px');

});