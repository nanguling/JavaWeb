$(function fun() {
    setInterval(function () {
        $.get("one",function (count) {
            $("#content").html(count)
        })
    },5000)
});

