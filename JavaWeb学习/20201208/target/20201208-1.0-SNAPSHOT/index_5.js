$(function fun() {
    let ol = $("#content");
    $("button").on("click",function () {
        $.get("test.txt",function (data) {
            ol.append("<li>" + data + "</li>")
        });
    });
});