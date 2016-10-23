$(function(){
    getjson();
});

function createXmlHttpRequest(){
    if(window.ActiveXObject){ //如果是IE浏览器
        return new ActiveXObject("Microsoft.XMLHTTP");
    }else if(window.XMLHttpRequest){ //非IE浏览器
        return new XMLHttpRequest();
    }
}


function deletecmd(id){
    var xmlHttpRequest = createXmlHttpRequest();
    xmlHttpRequest.open("POST","/customer/delete.do?customerId="+id,true);//需要改
    xmlHttpRequest.send(null);
}

function getjson(){
    $.ajax({
        url:'/customer/findall.do',//需要添加
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
        $("#list").html('');
        var jsonData = eval(tt);
        var fatherObj = $("#list");
        $.each(jsonData, function (index,item) {
            //循环获取数据
            // var customerAddress = item.customerAddress;
            var customerEmail = item.customerEmail;
            var customerId = item.customerId;
            var customerName = item.customerName;
            var customerPassword = item.customerPassword;
            var customerPhone = item.customerPhone;


            var lineObj = $("<tr style='border: 1px solid skyblue'></tr>")

            // var customerAddressObj = $("<td style='display: none'></td>")
            // customerAddressObj.html(customerAddress);

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


            var deletebutton = $("<td><button>"+"删除"+"</button></td>")
            deletebutton.click(function(event){

                    deletecmd(customerId);
                    setTimeout(getjson(),1000);

            })


            // customerAddressObj.appendTo(lineObj);
            customerEmailObj.appendTo(lineObj);
            customerIdObj.appendTo(lineObj);
            customerNameObj.appendTo(lineObj);
            customerPasswordObj.appendTo(lineObj);
            customerPhoneObj.appendTo(lineObj);
            deletebutton.appendTo(lineObj);


            lineObj.appendTo(fatherObj);



        })


    }
}