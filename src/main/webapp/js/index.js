$(document).ready(function () {
    $("#form-login").submit(function (event) {
        event.preventDefault();
        authenticateUser();
    });
});

function authenticateUser() {
    let username = $("#username").val();
    let password = $("#password").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUserLogin",
        data: $.param({
            username: username,
            password: password
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let username = parsedResult['username'];
                document.location.href = "home.html?username=" + username;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}