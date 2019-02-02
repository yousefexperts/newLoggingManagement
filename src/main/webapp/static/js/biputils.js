/*
 * common utitlity functions to be used
 * by both admin and board pages
 *
 * */

var BipUtils = {

    prepareActiveMenu: function () {
        var currentPage = location.pathname.split('/').pop();
        var $liList = $('ul a[href="' + currentPage + '"]').parents('li');
        $liList.each(function (index, item) {
            $(item).addClass('active').addClass('open');
        });
    }

}

$(document).ready(function () {
    BipUtils.prepareActiveMenu();
});