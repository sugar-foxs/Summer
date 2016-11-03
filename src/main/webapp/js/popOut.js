/**
 * Created by xin on 16-10-31.
 */
window.onload=function () {
    var TipBox = document.getElementById("tipCon");
    var clickMe = document.getElementById("clickMe");
    var showPic = document.getElementById("showPic");
    var closeBtn = document.getElementById("closeBtn");
    var word= document.getElementById("word");
    clickMe.onmouseover = function () {
        showPic.style.display = 'block';
        closeBtn.style.display = 'block';
        word.remove();
    };
    clickMe.onclick = function () {
        showPic.style.display = 'none';
        closeBtn.style.display = 'none';
        word.html("猜猜我有啥？");
    }
}