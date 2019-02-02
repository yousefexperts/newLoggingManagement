var Login = function () {

    var handleLogin = function () {
        $('.login-form').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            rules: {
                username: {
                    required: true
                },
                password: {
                    required: true
                },
                remember: {
                    required: false
                }
            },
            messages: {
                username: {
                    required: "Username is required."
                },
                password: {
                    required: "Password is required."
                }
            },
            invalidHandler: function (event, validator) { //display error alert on form submit
                $('.alert-danger', $('.login-form')).show();
            },
            highlight: function (element) { // hightlight error inputs
                $(element)
                    .closest('.form-group').addClass('has-error'); // set error class to the control group
            },
            success: function (label) {
                label.closest('.form-group').removeClass('has-error');
                label.remove();
            },
            errorPlacement: function (error, element) {
                error.insertAfter(element.closest('.input-icon'));
            },
            submitHandler: function (form) {
                form.submit(); // form validation success, call ajax form submit
            }
        });

        $('.login-form input').keypress(function (e) {
            if (e.which == 13) {
                if ($('.login-form').validate().form()) {
                    $('.login-form').submit(); //form validation success, call ajax form submit
                }
                return false;
            }
        });
    }

    var handleForgetPassword = function () {
        $('.forget-form').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            ignore: "",
            rules: {
                email: {
                    required: true,
                    email: true
                }
            },
            messages: {
                email: {
                    required: "Email is required."
                }
            },
            invalidHandler: function (event, validator) { //display error alert on form submit
            },
            highlight: function (element) { // hightlight error inputs
                $(element).closest('.form-group').addClass('has-error'); // set error class to the control group
            },
            success: function (label) {
                label.closest('.form-group').removeClass('has-error');
                label.remove();
            },
            errorPlacement: function (error, element) {
                error.insertAfter(element.closest('.input-icon'));
            },
            submitHandler: function (form) {
                form.submit();
            }
        });

        //$('.forget-form input').keypress(function (e) {
        //    if (e.which == 13) {
        //        if ($('.forget-form').validate().form()) {
        //            $('.forget-form').submit();
        //        }
        //        return false;
        //    }
        //});

        jQuery('#forget-password').click(function () {
            jQuery('.login-form').hide();
            jQuery('.forget-form').show();
        });

        jQuery('#back-btn').click(function () {
            jQuery('.login-form').show();
            jQuery('.forget-form').hide();
        });

    }

    var handleRegister = function () {
        function format(state) {
            if (!state.id) {
                return state.text;
            }
            var $state = $(
                '<span><img src="../assets/global/img/flags/' + state.element.value.toLowerCase() + '.png" class="img-flag" /> ' + state.text + '</span>'
            );
            return $state;
        }

        $('.register-form').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            ignore: "",
            rules: {

                fullname: {
                    required: true
                },
                email: {
                    required: true,
                    email: true
                },
                address: {
                    required: true
                },
                city: {
                    required: true
                },
                country: {
                    required: true
                },

                username: {
                    required: true
                },
                password: {
                    required: true
                },
                rpassword: {
                    equalTo: "#register_password"
                },

                tnc: {
                    required: true
                }
            },
            messages: { // custom messages for radio buttons and checkboxes
                tnc: {
                    required: "Please accept TNC first."
                }
            },
            invalidHandler: function (event, validator) { //display error alert on form submit
            },
            highlight: function (element) { // hightlight error inputs
                $(element).closest('.form-group').addClass('has-error'); // set error class to the control group
            },

            success: function (label) {
                label.closest('.form-group').removeClass('has-error');
                label.remove();
            },
            errorPlacement: function (error, element) {
                if (element.attr("name") == "tnc") { // insert checkbox errors after the container                  
                    error.insertAfter($('#register_tnc_error'));
                } else if (element.closest('.input-icon').size() === 1) {
                    error.insertAfter(element.closest('.input-icon'));
                } else {
                    error.insertAfter(element);
                }
            },
            submitHandler: function (form) {
                Login.createAccount();
            }
        });

        $('button#register-submit-btn').keypress(function (e) {
            if (e.which == 13) {
                if ($('.register-form').validate().form()) {
                    Login.createAccount();
                }
                return false;
            }
        });

        jQuery('#register-btn').click(function () {
            jQuery('.login-form').hide();
            jQuery('.register-form').show();
        });

        jQuery('#register-back-btn').click(function () {
            jQuery('.login-form').show();
            jQuery('.register-form').hide();
        });
    }

    return {
        //main function to initiate the module
        init: function () {
            handleLogin();
            handleForgetPassword();
            handleRegister();
        },
        createAccount: function () {
            $.ajax({
                type: 'POST',
                url: restBaseUrl + "/account/create-account",
                data: JSON.stringify({
                    nameSurname: $('form.register-form input[name=fullname]').val(),
                    email: $('form.register-form input[name=email]').val(),
                    username: $('form.register-form input[name=username]').val(),
                    password: $('form.register-form input[name=password]').val()
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: function (retData) {
                    if (retData.successMessage) {
                        swal({
                                title: "Hesap başarıyla yaratıldı!!",
                                text: "Giriş yapmak için tıklayınız",
                                type: "success",
                                showCancelButton: false,
                                confirmButtonClass: "btn-info",
                                confirmButtonText: "OK",
                                closeOnConfirm: true,
                                closeOnCancel: true
                            },
                            function (isConfirm) {
                                if (isConfirm) {
                                    window.location.href = 'login';
                                } else {
                                    console.log("Stay here..");
                                }
                            });
                    } else {
                        swal("Hesap oluşturmada hata!!", "Detay: " + retData.failMessage, "error");
                    }
                    console.log(retData);
                },
                error: function (xhr, status, error) {
                    swal("Hesap oluşturmada hata!!", "Detay: " + error, "error");
                    console.log("Error occured,status:" + status + ",error:" + error);
                }
            });
        }
    };
}();

jQuery(document).ready(function () {
    Login.init();
});