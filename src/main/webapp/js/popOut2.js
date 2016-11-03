/**
 * Created by xin on 16-10-31.
 */
window.onload = function () {
    var TipBox = document.getElementById("tipCon");
    var closeBtn = document.getElementById("closeBtn");
    closeBtn.onclick = function () {
        TipBox.style.display = 'none';
        TipBox.remove();
    }
};