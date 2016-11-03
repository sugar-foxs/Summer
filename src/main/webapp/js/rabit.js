/**
 * Created by xin on 16-11-1.
 */
var test = document.getElementById("test"),
    imgUrl = "/img/rabbit-big.png",
    pos = ["0px -854px", "-174px -852px", "-349px -852px", "-524px -852px", "-698px -852px", "-873px -848px"];
(function (ele, pos, imgUrl) {
    var img = new Image(),
        index = 0,
        len = pos.length;
    img.src = imgUrl;
    img.onload =()=> {
        ele.style.background = "url(" + imgUrl + ") no-repeat";
        ele.style.backgroundPosition = pos[len - 1 - index];
        run();
    };
    function run () {
        setInterval(() => {
            ele.style.backgroundPosition = pos[index++ % len];
    }, 80)
    }
})(test, pos, imgUrl);