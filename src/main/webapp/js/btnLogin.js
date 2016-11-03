/**
 * Created by xin on 16-10-31.
 */
window.onload = function(){
    var oBtn = document.getElementById("btnLogin");
    oBtn.onclick = function () {
        openNew();
        return false;
    }
}
function openNew() {
    var sWidth = document.body.scrollWidth;
    var sHeight = document.body.scrollHeight;
    var wHeight = document.documentElement.clientHeight;
    var oMask = document.createElement("div");
    oMask.id = "mask";
    oMask.style.height = sHeight + "px";
    oMask.style.width = sWidth + "px";
    document.body.appendChild(oMask);
    var oLogin = document.createElement("div");
    oLogin.id = "login";
    oLogin.innerHTML = "<div class = 'loginCon'><div id='close'>点击关闭 </div></div>";
    document.body.appendChild(oLogin);
    var dHeight = oLogin.offsetHeight;
    var dWidth = oLogin.offsetWidth;
    oLogin.style.left = sWidth/2 - dWidth/2 +"px";
    oLogin.style.top = wHeight/2 - dHeight/2 +"px";
    var oClose = document.getElementById("close");
    oClose.onclick = oMask.onclick = function () {
        document.body.removeChild(oLogin);
        document.body.removeChild(oMask);
    };
};