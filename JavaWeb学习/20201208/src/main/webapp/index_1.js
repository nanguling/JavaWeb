window.onload = function() {
    document.getElementById("two").onclick = function () {
        if (document.getElementById("one").innerHTML == "薇姐") {
            document.getElementById("one").innerHTML = "薇妹";
        }else {
            document.getElementById("one").innerHTML = "薇姐";
        }
    }
    $(function fun1() {
        $("#one").on("mouseover",function () {
            $("#one").html("薇妹");
        });
        $("#one").on("mouseout",function () {
            $("#one").html("薇姐");
        });
    });
}