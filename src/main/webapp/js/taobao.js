/**
 * Created by gch on 16-7-26.
 */
function displaySubMenu(li){
    var subMenu=li.getElementsByTagName("ul")[0];
    subMenu.style.display="block";
}
function hideSubMenu(li){
    var subMenu=li.getElementsByTagName("ul")[0];
    subMenu.style.display="none";
}
//        window.onload=function(){
//        	var Lis=document.getElementByTagName("li");
//
//    		for(i=0;i<Lis.length;i++){
//    			Lis[i].onmouseover=function(){
//    				this.className="lihover";
//    			}
//
//    		Lis.onmouseout=function(){
//    			this.className="";
//    		}
//        }
//     }