jQuery(document).ready(function () {

    $('div#content-div').on("click", "button#send-jms-message", function (e) {
        $.ajax({
            type: 'POST',
            url: restBaseUrl + "/send-jms-message",
            contentType: 'application/json',
            success: function (retData) {
                console.log("Success: " + retData);
            },
            error: function (xhr, status, error) {
                console.log("Error occured,status:" + status + ", error:" + error);
            }
        });
    });

});
