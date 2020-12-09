$(function () {
    //每3秒一次刷新
    setTimeout(function () {
        $.get("message_list",function (data) {
            let table = $("table");

            for(i in data) {
                let message = data[i];

                let html = "<tr></tr><td>"+message.id+"</td>" +
                    "<td>"+message.who+"</td>" +
                    "<td>"+message.when+"</td>" +
                    "<td>"+message.what+"</td>" +
                    "</tr>";

                table.append(html);
            }
        });
    },3000)
});