/**
 * Created by gch on 16-11-3.
 */
$(function() {
       document.getElementById("main").innerText=getCookie("gch_shop");
})

function getCookie(cookieName){
   var cookieContent = '';
   var cookieAry = document.cookie.split("; ");//得到Cookie数组
   for(var i=0;i<cookieAry.length;i++){
       var temp = cookieAry[i].split("=");
       if(temp[0] == cookieName){
           cookieContent = decodeURIComponent(temp[1]);
       }
   }
   return cookieContent;
}
function getBooks(cookieValue) {
    var books = cookieValue.split("#");
    var fatherObj = $("#main");
    for(var i=0;i<books.length;i++){
        var bookItem = books[i].split("&");
        var bookName = bookItem[1];
        var bookAuthor = bookItem[2];
        var bookYear = bookItem[3];
        var bookPrice = bookItem[4];
        var bookCover = bookItem[5];
        
        fatherObj.append(bookName);
    }
}
