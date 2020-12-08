$(function fun() {
    setInterval(function () {
        $.get("two",function (count) {
            $("#content").html(count)
        })
    },5000)
});

