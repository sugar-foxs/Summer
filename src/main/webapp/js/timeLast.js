/**
 * Created by xin on 16-11-2.
 */
function FreshTime()
{
    var endtime=new Date("2016/11/2,15:20:12");//结束时间
    var nowtime = new Date();//当前时间
    var lefttime=parseInt((endtime.getTime()-nowtime.getTime())/1000);
    d=parseInt(lefttime/3600/24);
    h=parseInt((lefttime/3600)%24);
    m=parseInt((lefttime/60)%60);
    s=parseInt(lefttime%60);
    document.getElementById("LeftTime").innerHTML=d+"天"+h+"小时"+m+"分"+s+"秒";
    if(lefttime<=0){
        document.getElementById("LeftTime").innerHTML="团购已结束";
        clearInterval(sh);
    }
}
FreshTime();
var sh;
sh=setInterval(FreshTime,1000);