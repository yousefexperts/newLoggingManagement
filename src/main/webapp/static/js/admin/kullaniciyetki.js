var userTable, boardPagesTable, adminPagesTable;

var KullaniciYetkiUtil = function () {
    return {
        createUserTable: function (selector, selectStyle) {
            return $(selector).DataTable(
                {
                    select: {
                        style: selectStyle
                    }
                }
            );
        },
        createAuthorityTable: function (selector, selectStyle) {
            return $(selector).DataTable(
                {
                    select: {
                        style: selectStyle
                    },
                    "columnDefs": [
                        {
                            "render": function (data, type, row) {
                                var isReadable = row[3] ? 'checked' : '', isReadWriteable = row[4] ? 'checked' : '';
                                var content = '<label class="mt-checkbox mt-checkbox-outline"><input class="read-only" type="checkbox"'
                                    + isReadable + '> Salt Okuma<span>' +
                                    '</span></label><br><label class="mt-checkbox mt-checkbox-outline"><input class="rw" type="checkbox"'
                                    + isReadWriteable + '> Okuma / Yazma<span></span></label>';
                                return content;
                            },
                            "targets": 3
                        }
                    ]
                }
            );
        },
        init: function () {
            userTable = this.createUserTable('table#kullanici-table', 'single');
            boardPagesTable = this.createAuthorityTable('table#board-pages-table', 'api');
            adminPagesTable = this.createAuthorityTable('table#admin-pages-table', 'api');
        },
        drawPageAuthoritiesTables: function (retData) {
            // board pages
            boardPagesTable.clear();
            $.each(retData.boardPagesList, function (index, item) {
                boardPagesTable.row.add([
                        item.id,
                        item.pageName,
                        item.pageUrl,
                        item.readable,
                        item.readWriteable
                    ]
                );
            });
            boardPagesTable.draw();
            //admin pages
            adminPagesTable.clear();
            $.each(retData.adminPagesList, function (index, item) {
                adminPagesTable.row.add([
                        item.id,
                        item.pageName,
                        item.pageUrl,
                        item.readable,
                        item.readWriteable
                    ]
                );
            });
            adminPagesTable.draw();
            // refresh ui
            $('div#board-pages-table_wrapper,div#admin-pages-table_wrapper').hide().fadeIn(350);
        },
        getPageAuthoritiesOfUser: function (userId) {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/menu/get-page-authorities-of-user",
                contentType: 'application/json',
                data: JSON.stringify({
                    id: userId
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.failMessage) {
                        swal("Menu yetkileri alınamadı!!", "Detay: " + retData.failMessage, "error");
                    } else {
                        KullaniciYetkiUtil.drawPageAuthoritiesTables(retData);
                    }
                },
                error: function (xhr, status, error) {
                    console.log("Error occured, status:" + status + ", error:" + error);
                    if (xhr.status == 403)
                        window.location = loginUrl;
                }
            });
        },
        populatePageAuthArr: function (tableSelector, pageAuthArr) {
            $(tableSelector).each(function (index, item) {
                var $tr = $(this);
                if ($tr.find('td.dataTables_empty').length == 0) {
                    var authWrapper = {
                        pageId: $tr.find('td:first').text(),
                        kullaniciId: selectedUser[0],
                        readable: $tr.find('input.read-only:checked').length > 0,
                        readWriteable: $tr.find('input.rw:checked').length > 0
                    };
                    pageAuthArr.push(authWrapper);
                }
            });
        },
        updateAccountDetails: function (kullanici) {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/account/update-account-details",
                data: JSON.stringify(kullanici),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.successMessage) {
                        toastr.success('Hesap başarıyla güncellendi..');
                    } else {
                        toastr.error('Hesap güncelleme başarısız!!');
                    }
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ",error:" + error);
                    if (xhr.status == 403)
                        window.location = loginUrl;
                }
            });
        },
        selectedUser: null
    };

}();

jQuery(document).ready(function () {
    KullaniciYetkiUtil.init();

    userTable.on('select', function (e, dt, type, indexes) {
        if (type === 'row') {
            var data = userTable.rows(indexes).data();
            KullaniciYetkiUtil.selectedUser = data[0];
            KullaniciYetkiUtil.getPageAuthoritiesOfUser(KullaniciYetkiUtil.selectedUser[0]);
        }
    });

    $("button#save-auth-changes").on('click', function (e) {
        var selectedData = userTable.rows('.selected').data();
        if (selectedData != undefined && selectedData.length > 0) {
            selectedUser = selectedData[0];
            var pageAuthArr = [];
            KullaniciYetkiUtil.populatePageAuthArr('table#board-pages-table tbody tr', pageAuthArr);
            KullaniciYetkiUtil.populatePageAuthArr('table#admin-pages-table tbody tr', pageAuthArr);

            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/menu/save-page-authorities-of-user",
                data: JSON.stringify(pageAuthArr),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    KullaniciYetkiUtil.drawPageAuthoritiesTables(retData);
                    toastr.success('Yetkiler başarıyla güncellendi..')
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ",error:" + error);
                    if (xhr.status == 403)
                        window.location = loginUrl;
                }
            });
        } else {
            console.log("No user selected..");
        }
    });

    $('div.portlet-body').on('click', 'table tbody tr input[type="checkbox"]', function (e) {
        var $this = $(this);
        if ($this.hasClass('read-only')) {
            $this.parents('td').find('input.rw').attr('checked', false);
        } else {
            $this.parents('td').find('input.read-only').attr('checked', false);
        }
    });

    $('div.portlet-body').on('click', "table#kullanici-table ul.dropdown-menu li", function (e) {
        var $this = $(this);
        if ($this.hasClass('edit-user')) {

            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/account/get-account-details",
                data: JSON.stringify({username: KullaniciYetkiUtil.selectedUser[4]}),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.failMessage) {
                        swal("Hesap detayları alınamadı!!", "Detay: " + retData.failMessage, "error");
                    } else {
                        var theTemplateScript = $("#edit-user-template").html();
                        var theTemplate = Handlebars.compile(theTemplateScript);
                        var theCompiledHtml = theTemplate(retData.bipKullanici);

                        bootbox.confirm({
                            title: "Kullanici Güncelleme",
                            message: theCompiledHtml,
                            buttons: {
                                confirm: {
                                    label: 'Kaydet',
                                    className: 'btn-success'
                                },
                                cancel: {
                                    label: 'İptal',
                                    className: 'btn-danger'
                                }
                            },
                            callback: function (result) {
                                if (result) {
                                    console.log('Saved..');
                                    KullaniciYetkiUtil.updateAccountDetails(
                                        {
                                            id: parseInt($('input#user-id').val()),
                                            accountEnabled: $('input.accountEnabled').prop('checked') ? 1 : 0,
                                            accountNonExpired: $('input.accountNonExpired').prop('checked') ? 1 : 0,
                                            credentialsNonExpired: $('input.credentialsNonExpired').prop('checked') ? 1 : 0,
                                            accountNonLocked: $('input.accountNonLocked').prop('checked') ? 1 : 0,
                                            isAdmin: $('input.isAdmin').prop('checked') ? 1 : 0
                                        }
                                    );
                                } else {
                                    console.log('Discarded..');
                                }
                            }
                        });
                    }
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ",error:" + error);
                    if (xhr.status == 403)
                        window.location = loginUrl;
                }
            });
        }
    });


});
