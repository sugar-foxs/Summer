/**
 * Created by gch on 16-11-3.
 */
$(function() {
       // document.getElementById("main").textContent = getCookie("cxh_shop");
    
    var value = getCookie(getCookie("customer")+"_cart");
    getBooks(value);
})

function getCookie(cookieName){
   var cookieContent = '';
   var cookieAry = document.cookie.split("; ");
   for(var i=0;i<cookieAry.length;i++){
       var temp = cookieAry[i].split("=");
       if(temp[0] == cookieName){
           cookieContent = decodeURIComponent(temp[1]);
       }
   }
   return cookieContent;
}
function getBooks(cookieValue) {
    $("#main").append("<p>"+cookieValue+"</p>");
    // var yData = [];//Y轴数据
    // var xData = [];//X轴数据
    // var data =cookieValue;
    // $(data.rows).each(function(i){
    //
    //     var obj = data.rows[i];
    //     yData.push(obj.key); //动态取值
    //     alert(obj.key);
    //     xData.push(obj.value); //动态取值
    //     alert(obj.value);
    //
    // });
    // var books = cookieValue.split("#");
    // var fatherObj = $("#main");
    // for(var i=0;i<books.length;i++){
    //     var bookItem = books[i].split("&");
    //     var bookId = bookItem[0];
    //     var bookName = bookItem[1];
    //     var bookPrice = bookItem[4];
    //     var bookCover = bookItem[5];
    //     var counts = bookItem[6];
    //
    //     var table = $("<table style='width: 100%'></table>");
    //     var divObj = $("<div style='border: 1px solid gray'></div>");
    //     var title = $("<p>店铺：天猫超市</p>");
    //     var tr1 = $("<tr></tr>");
    //
    //
    //    
    //     var selectObj = $("<td style='width: 5%'><input type='checkbox' /></td>");
    //     var coverObj = $('<td style="width: 9%"><img style="width: 80px;height: 80px;" src="/img/'+bookCover+'"></td>');
    //     var nameObj = $("<td style='width: 36%'>"+bookName+"</td>");
    //     var priceObj = $("<td style='width: 25%'>"+"￥"+bookPrice+"</td>");
    //     var countObj = $("<td style='width: 25%'></td>");
    //
    //     var inputObj = $("<input id='"+bookId+"' style='width: 50px' value='" +counts+ "'/>");
    //     var subButton = $("<button onclick='subnum()' >-</button>");
    //     var addButton = $("<button onclick='addnum()' >+</button>");
    //     subButton.appendTo(countObj);
    //     inputObj.appendTo(countObj);
    //     addButton.appendTo(countObj);
    //
    //     selectObj.appendTo(tr1);
    //
    //     coverObj.appendTo(tr1);
    //     nameObj.appendTo(tr1);
    //     priceObj.appendTo(tr1);
    //     countObj.appendTo(tr1);
    //
    //     tr1.appendTo(table);
    //
    //     table.appendTo(divObj);
    //     title.appendTo(fatherObj);
    //     divObj.appendTo(fatherObj);

}
function addnum() {

    $(this).parent().find('input').value++;
}

function subnum() {
    $(this).parent().find('input').value--;
    if( $(this).parent().find('input').value<1){
        $(this).parent().find('input').value=1;
    }
}