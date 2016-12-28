/**
 * Created by gch on 16-7-25.
 */
var page=1;

function a_onmouseover(id,id2)
{
    var bookStoreDiv = document.getElementById(id);
    bookStoreDiv.style.display="block";
    var button = document.getElementById(id2);
    button.style.backgroundColor="white";
}

function a_onmouseout(id,id2)
{
    var bookStoreDiv = document.getElementById(id);
    bookStoreDiv.style.display="none";
    var button = document.getElementById(id2);
    button.style.backgroundColor="whitesmoke";
}
function getbook() {
    $.ajax({
        url:'/book/findall.do',
        type:"GET",
        data:{
            page:page
        },
        dataType: 'json',
        timeout: 1000,
        cache: false,
        success: succFunction //成功执行方法
    });
    function succFunction(tt) {
        if(tt!=""){
            var data = eval(tt);
            var divObj = $("<div></div>");
            // 附上模板
            divObj.setTemplateElement("template");
            // 给模板加载数据
            divObj.processTemplate(data);
            divObj.appendTo($("#result"));
            document.getElementById("loading").style.display="block";
        }else{
            document.getElementById("loading").style.display="none";
            document.getElementById("span1").style.display="block";
        }
    }
}
$(document).ready(function(){
    getbook();
    window.onscroll=function(){
        var height=getClientHeight();
        var theight=getScrollTop();
        var rheight=getScrollHeight();
        var bheight=rheight-theight-height;
        if(bheight==0){
            page++;
            getbook();
        }
    }
});
window.onload = function () {
        var Lis = document.getElementsByTagName("li");
        for (i = 0; i < Lis.length; i++) {
            Lis[i].onmouseover = function () {
                this.className = "lihover";
            }

            Lis[i].onmouseout = function () {
                this.className = "";
            }
        }

};
function show() {
    page++;
    getbook();
}
//取窗口可视范围的高度
function getClientHeight(){
    var clientHeight=0;
    if(document.body.clientHeight&&document.documentElement.clientHeight){
        var clientHeight=(document.body.clientHeight<document.documentElement.clientHeight)?document.body.clientHeight:document.documentElement.clientHeight;
    }else{
        var clientHeight=(document.body.clientHeight>document.documentElement.clientHeight)?document.body.clientHeight:document.documentElement.clientHeight;
    }
    return clientHeight;
}
//取窗口滚动条高度
function getScrollTop(){
    var scrollTop=0;
    if(document.documentElement&&document.documentElement.scrollTop){
        scrollTop=document.documentElement.scrollTop;
    }else if(document.body){
        scrollTop=document.body.scrollTop;
    }
    return scrollTop;
}
//取文档内容实际高度
function getScrollHeight(){
    return Math.max(document.body.scrollHeight,document.documentElement.scrollHeight);
}

