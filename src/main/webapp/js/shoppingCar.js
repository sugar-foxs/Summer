/**
 * Created by gch on 16-11-3.
 */
window.onload=function () {
    getbooks();
}

function getbooks() {
    $.ajax({
        url:'/shopCart/getAllBooks.do?',
        type:"GET",
        dataType: 'json',
        timeout: 1000,
        cache: false,
        beforeSend: LoadFunction, //加载执行方法
        error: erryFunction,  //错误执行方法
        success: succFunction //成功执行方法
    })
    function LoadFunction() {
        // $("#result").html('加载中...');
    }
    function erryFunction() {
        // alert("error");
    }
    function succFunction(data) {
             // var data = eval(tt);
            // var divObj = $("<div></div>");
            // // 附上模板
            // divObj.setTemplateElement("template");
            // // 给模板加载数据
            // divObj.processTemplate(data);
            // divObj.appendTo($("#result"));
        for (var p in data) {
            if (data.hasOwnProperty(p)) {
                var value = data[p];
                alert('' + p + ' ' + value);
            }
        }
    };
}