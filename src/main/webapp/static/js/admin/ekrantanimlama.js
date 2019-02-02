var MenuUtil = function () {

    var contextualMenuSample = function (menuAsTree) {
        $("#jstree").jstree({
            "plugins": ["contextmenu", "state", "types", "core", "themes"],
            "core": {
                "themes": {
                    "responsive": true
                },
                // so that create works
                'check_callback': true,
                'data': menuAsTree,
                "multiple": false,
                "animation": 150
            },
            "types": {
                "default": {
                    "icon": "fa fa-folder icon-state-warning icon-lg"
                },
                "file": {
                    "icon": "fa fa-file icon-state-warning icon-lg"
                }
            },
            "contextmenu": {
                items: {
                    "create": {
                        "label": "Ekle",
                        "action": function (data) {
                            var node = MenuUtil.getNode(data), tree = $('#jstree').jstree(), newNodeId = Math.floor((Math.random() * 1000) + 1);
                            tree.create_node(node.id, {
                                "id": newNodeId,
                                "parentId": node.id,
                                "text": "Yeni Menü",
                                "order": 0,
                                "active": true,
                                "page": true
                            }, "first", function () {
                                MenuUtil.addMenuItem(tree.get_node(newNodeId).original, newNodeId);
                                console.log("done..");
                            });
                        },
                    },
                    "Delete": {
                        "label": "Sil",
                        "action": function (data) {
                            var node = MenuUtil.getNode(data);
                            MenuUtil.deleteMenuItem(node);
                        }
                    }
                }
            }
        });
    }

    return {
        getNode: function (data) {
            var inst = $.jstree.reference(data.reference);
            return inst.get_node(data.reference);
        },
        init: function () {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/menu/load-menu-tree",
                contentType: 'application/json',
                success: function (retData) {
                    contextualMenuSample(retData.menuAsTree);
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ", error:" + error);
                }
            });
        },
        refreshData: function (newData, nodeToSelect) {
            var $tree = $('#jstree');
            $tree.jstree(true).settings.core.data = newData;
            $tree.jstree(true).refresh();
            // TODO need a refresh callback??
            $tree.jstree('deselect_all');
            $tree.jstree("select_node", nodeToSelect);
        },
        addMenuItem: function (node, nodeToSelect) {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/menu/add-menu-item",
                contentType: 'application/json',
                data: JSON.stringify(node),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.failMessage) {
                        swal("Menu eklemede hata!!", "Detay: " + retData.failMessage, "error");
                    } else {
                        MenuUtil.refreshData(retData.menuAsTree, nodeToSelect);
                    }
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ", error:" + error);
                }
            });
        },
        updateMenuItem: function () {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/menu/update-menu-item",
                contentType: 'application/json',
                data: JSON.stringify({
                    id: $('input#menu-id').val(),
                    parentId: $('input#parent-id').val(),
                    text: $('input#menu-text').val(),
                    order: $('input#menu-order').val(),
                    bipPage: {
                        pageUrl: $('input#page-url').val(),
                    },
                    iconClass: $('input#icon-class').val()
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.failMessage) {
                        swal("Menu güncellemede hata!!", "Detay: " + retData.failMessage, "error");
                    } else {
                        toastr.success('Menu item başarıyla güncellendi..');
                        MenuUtil.refreshData(retData.menuAsTree);
                    }
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ", error:" + error);
                }
            });
        },
        deleteMenuItem: function (node) {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/menu/delete-menu-item",
                contentType: 'application/json',
                data: JSON.stringify({
                    id: node.id
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.failMessage) {
                        swal("Menu silmede hata!!", "Detay: " + retData.failMessage, "error");
                    } else {
                        toastr.success('Menu item başarıyla silindi..');
                        MenuUtil.refreshData(retData.menuAsTree);
                    }
                },
                error: function (xhr, status, error) {
                    console.log("Error occured,status:" + status + ", error:" + error);
                }
            });
        }
    };

}();

jQuery(document).ready(function () {
    MenuUtil.init();

    $('#jstree').on("select_node.jstree", function (e, data) {
        var theTemplateScript = $("#menu-edit-form-template").html();
        var theTemplate = Handlebars.compile(theTemplateScript);
        var theCompiledHtml = theTemplate(data.node.original);
        $('form#menu-edit-form').html($(theCompiledHtml));
    });

    // TODO bind an event handler for delete context menu
    $('form#menu-edit-form').on("click", "button#update-menu-item", function (e) {
        e.preventDefault();
        MenuUtil.updateMenuItem();
    });

});