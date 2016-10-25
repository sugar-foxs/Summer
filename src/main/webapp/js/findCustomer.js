/**
 * Created by xin on 16-10-23.
 */

function butOnclick(){
    getjson();
}

function createXmlHttpRequest(){
    if(window.ActiveXObject){ //如果是IE浏览器
        return new ActiveXObject("Microsoft.XMLHTTP");
    }else if(window.XMLHttpRequest){ //非IE浏览器
        return new XMLHttpRequest();
    }
}

function getjson(){
    $.ajax({
        url:'/customer/findcustomerbyid.do?customerid='+$('#customerid').val(),//需要添加
        type:"GET",
        dataType: 'json',
        timeout: 1000,
        cache: false,
        beforeSend: LoadFunction, //加载执行方法
        error: erryFunction,  //错误执行方法
        success: succFunction //成功执行方法
    })
    function LoadFunction() {
        $("#list").html('加载中...');
    }
    function erryFunction() {
        alert("error");
    }
    // tt有什么用？
    function succFunction(tt) {
        $('#list').html('');
        var jsonData = eval(tt);
        var fatherObj = $("#list");
        $.each(jsonData, function (index,item) {
            //循环获取数据
            var customerEmail = item.customerEmail;
            var customerId = item.customerId;
            var customerName = item.customerName;
            var customerPassword = item.customerPassword;
            var customerPhone = item.customerPhone;
            var lineObj = $("<tr style='border: 1px solid skyblue'></tr>")

            var customerEmailObj = $("<td></td>")
            customerEmailObj.html(customerEmail);

            var customerIdObj=$("<td></td>")
            customerIdObj.html(customerId);

            var customerNameObj=$("<td></td>")
            customerNameObj.html(customerName);

            var customerPasswordObj=$("<td></td>")
            customerPasswordObj.html(customerPassword);

            var customerPhoneObj=$("<td></td>")
            customerPhoneObj.html(customerPhone);

            customerEmailObj.appendTo(lineObj);
            customerIdObj.appendTo(lineObj);
            customerNameObj.appendTo(lineObj);
            customerPasswordObj.appendTo(lineObj);
            customerPhoneObj.appendTo(lineObj);
            lineObj.appendTo(fatherObj);
        })


    }
}