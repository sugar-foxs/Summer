/**
 * Created by xin on 16-10-31.
 */
// var oAd = document.getElementById('ad');
// var oAdcon = document.getElementById('adcon');
// var h=0;
// var step = 5;
// var maxH = oAdcon.height;
// function adDown() {
//     oAd.style.height = h +'px';
//     oAd.style.display = 'block';
//     if (h<maxH){
//         h += step;
//         setTimeout(adDown,1);
//     }else {
//         setTimeout(adUp,3000);
//     }
// }
// function adUp() {
//     if (h>0){
//         h -=step;
//         oAd.style.height = h+'px';
//         setTimeout(adUp,1);
//     }
// }
// setTimeout(adDown,3000);
    var oAd = document.getElementById('ad');
    var oAdcon = document.getElementById('adcon');
    var oAdcur = document.getElementById('adcur');
    var oAdclose = document.getElementById('close');
    var maxH = oAdcon.height;
    var minH = oAdcur.height;
    var h = 0;
    var step = 5;
    function adDown() {
        if (h<maxH){
            h += step;
            setTimeout(adDown,1);
        }else {
            setTimeout(adUp,3000);
        }
        oAd.style.display = "block";
        oAd.height = h+"px";
    }
    function adUp() {
        oAd.height = h+"px";
        if (h>minH){
            h -=step;
            setTimeout(adUp,1);
        }else {
            oAdcon.style.display = "none";
            oAdclose.style.display = "block";
        }
    }
    oAdclose.onclick = function () {
        oAd.style.display = "none";
    };
    setTimeout(adDown,3000);