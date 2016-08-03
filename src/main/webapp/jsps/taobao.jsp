<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
		<meta http-equiv="content-type" content="text/html charset=utf-8" >
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>首页</title>
		<%--<link href="../css/bootstrap.css" rel="stylesheet" />--%>
		<%--<script src="../js/jquery-1.9.1.js"></script>--%>
		<%--<script src="../js/bootstrap.js"></script>--%>

		<link href="../css/taobao.css" rel="stylesheet" />
		<script src="../js/taobao.js"></script>


    </head>
    <body>
    <div class="nav">
		<div >
    		<ul>
    		<li onmouseover="displaySubMenu(this)" onmouseout="hideSubMenu(this)"><a href="mytaobao">我的淘宝</a>
				<ul>
					<li><a href="#">已买到的宝贝</a></li>
					<li><a href="#">我的足迹</a></li>
				</ul>
		   	</li>

    		<li><a href="shoppingcar.html">购物车</a></li>
    		<li onmouseover="displaySubMenu(this)" onmouseout="hideSubMenu(this)"><a href="favorite">收藏夹</a>
    		<ul>
    			<li><a href="#">收藏的宝贝</a></li>
    			<li><a href="#">收藏的店铺</a></li>
    		</ul>
    		</li>
    		<li><a href="classify.html">商品分类</a></li>
    		<li onmouseover="displaySubMenu(this)" onmouseout="hideSubMenu(this)"><a href="seller">卖家中心</a>
				<ul>
					<li><a href="#">免费开店</a></li>
					<li><a href="#">已卖出的宝贝</a></li>
					<li><a href="#">出售中的宝贝</a></li>
					<li><a href="#">卖家服务市场</a></li>
					<li><a href="#">卖家培训中心</a></li>
					<li><a href="#">体检中心</a></li>
				</ul>
    		</li>
    		<li onmouseover="displaySubMenu(this)" onmouseout="hideSubMenu(this)"><a href="service">联系客服</a>
				<ul>
					<li><a href="#">买家客服</a></li>
					<li><a href="#">卖家客服</a></li>
				</ul>
				
    		</li>
    		<li><a href="navigation">网站导航</a></li>
    		</ul>
    		</div>
    	</div>
   
    	<div class="box">
    		<div class="header">
    			<div class="logo">
    				<img src="/img/taobao.jpg" height="100" width="200">
    			</div>
    			<div class="search">
    				<input type="text" class="txt" placeholder="请输入关键字">
    				<input type="button" class="btn" value="搜索">
    			</div>
    			<ul class="topmenu">
    				<div class="toptitle">
    				主题市场
    				</div>
    				<li><a href="#">图书、音像、数字商品</a></li>
    					<div class="submenu" id='div1'>
    						<div class="leftdiv">
    							<dl>
    								<dt><a href="#">电子书</a></dt>
    								<dd>
    									<a href="#">免费</a><a href="#">小说</a><a href="#">励志与成功</a><a href="#">婚恋/两性</a><a href="#">文学</a><a href="#">经管</a><a href="#">畅读VIP</a>
    								</dd>
    							</dl>
    						</div>
                    	</div>
            		</li>
            <li><a href="#">美妆/洗护</a></li>
            <li><a href="#">女装/男装装/男装/男装/男</a></li>
            <li><a href="#">美妆/洗护</a></li>
            <li><a href="#">童装/玩具</a></li>
            <li><a href="#">鞋靴/箱包装/男装/男</a></li>
            <li><a href="#">珠宝/眼镜</a></li>
            <li><a href="#">美食/生鲜装/男装/男</a></li>
            <li><a href="#">家用电器v装/男装/男</a></li>
            <li><a href="#">鲜花/宠物</a></li>
             
             
             

    					<!-- <a href="#">女装/男装</a>
    					</li>
    					<li class="two">
    					<a href="#">鞋靴/箱包</a>
    					</li>
    					<li class="three">
    					<a href="#">童装/玩具</a>
    					</li>
    					<li class="four">
    					<a href="#">家电/数码</a>
    					</li>
    					<li class="five">
    					<a href="#">美妆/洗护</a>
    					</li>
    					<li class="six">
    					<a href="#">珠宝/眼镜</a>
    					</li>
    					<li class="seven">
    					<a href="#">运动/户外</a>
    					</li>
    					<li class="eight">
    					<a href="#">美食/生鲜</a>
    					</li>
    					<li class="nine">
    					<a href="#">鲜花/宠物</a>
    					</li> -->
    			
    			</ul>
    		</div>
    	</div>
   </body>
</html>