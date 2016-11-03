<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-25
  Time: 下午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script type="text/javascript" src="../js/angular.min.js"></script>
    <script type="text/javascript" src="../js/magnify.js"></script>
    <script type="text/javascript" src="../js/compare.js"></script>
    <link href="../css/bootstrap.css" rel="stylesheet"/>
    <link href="../css/compare.css" rel="stylesheet"/>
    <link rel="stylesheet" href="../css/topAd.css"/>
    <link rel="stylesheet" href="../css/magnify.css"/>
    <link rel="stylesheet" href="../css/cart.css"/>
    <title>Title</title>
</head>
<body>
    <div id="ad">
        <img src="../img/ad.png" id="adcon" width="960" height="385"/>
        <img src="../img/cur.png" id="adcur" width="960" height="68"/>
        <span id="close">X</span>
    </div>
    <div class="container">
        <div class="row">
        <ul class="nav navbar-nav navbar-right">
            <li><a href="../jsps/login.jsp">Hi,<%=request.getAttribute("username") %>[退出]</a></li>
            <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle" role="button" id="drop4">我的当当
                <b class="caret"></b>
                </a>
                <ul aria-labelledby="drop4" role="menu" class="dropdown-menu" id="menu1">
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">我的订单</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">购物车</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">我的评论</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">我的收藏</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">积分抵现</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">电子书架</a> </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle" role="button" id="drop5">企业采购
                    <b class="caret"></b>
                </a>
                <ul aria-labelledby="drop5" role="menu" class="dropdown-menu" id="menu2">
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">大宗采购</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">礼品卡采购</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">礼品卡激活</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">礼品卡使用</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">3c数码团购</a> </li>
                </ul>
                </li>
            <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle" role="button" id="drop6">客户服务
                    <b class="caret"></b>
                </a>
                <ul aria-labelledby="drop6" role="menu" class="dropdown-menu" id="menu3">
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">帮助中心</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">自助退换货</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">自助发票</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">联系客服</a> </li>
                    <li role="presentation"><a href="#" tabindex="-1" role="menuitem">我要投诉</a> </li>
                </ul>
            </li>
        </ul>
        </div>

        <br>
        <br>

        <div class="row">
            <div class="col-lg-7 col-lg-offset-2">
                <div class="input-group">
                    <input type="text" class="form-control input-lg">
                    <span class="input-group-btn">
                        <button type="button" class="btn btn-default btn-lg dropdown-toggle" data-toggle="dropdown">全部分类<span class="caret"></span></button>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
                            <li><a href="#" tabindex="-1">全部分类</a> </li>
                            <li><a href="#" tabindex="-1">图书</a> </li>
                            <li><a href="#" tabindex="-1">数字商品</a> </li>
                        </ul>
                    </span>
                    <span class="input-group-btn"><button class="btn btn-danger btn-lg" type="button"><span class="glyphicon glyphicon-search"></span> 搜索</button></span>
                </div>
            </div>
        </div>
        <br>
        <div class="row">
            <div class="col-md-2">
                <div class="btn-group">
                    <ul class="dropdown-menu">
                        <li><a href="#" tabindex="-1">图书</a></li>
                        <li><a href="#" tabindex="-1">运动户外</a></li>
                        <li><a href="#" tabindex="-1">电脑办公</a></li>
                        <li><a href="#" tabindex="-1">家用电器</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-10">
                <div class="col-md-1">电子书</div>
                <div class="col-md-1">图书</div>
                <div class="col-md-1">原创文学</div>
                <div class="col-md-1">运动户外</div>
                <div class="col-md-1">服装</div>
                <div class="col-md-1">家具</div>
                <div class="col-md-1">创意文具</div>
                <div class="col-md-1">特产</div>
                <div class="col-md-1">海外购</div>
                <div class="col-md-1">电器城</div>
                <div class="col-md-1">原创文学</div>
                <div class="col-md-1">VIP折上折</div>
            </div>
           </div>
        </div>
        <div id="magnify">
            <div id="small-box">
                <div id="mark"></div>
                <div id="float-box"></div>
                <img src="../img/macbook-small.jpg"/>
            </div>
            <div id="big-box">
                <img src="../img/macbook-big.jpg"/>
            </div>
            <div id="time">
                距离抢购结束还剩 <span id="LeftTime"></span>哦～<br/><br/>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="#0" class="btn btn-success add-button"data-price="3669.00" data-proid="1"
                   data-proname="苹果电脑" data-proimg="../img/macbook-big.jpg"> 添加到购物车</a>
            </div>
        </div><br/><br/><br/><br><br><br><br/>

    <%--其他需要加入购物车打商品--%>
    <div class="container">
        <fieldset>
        <legend><h3>猜您可能喜欢</h3></legend>
        <div class="row main">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-3 col-xs-6 pro text-center">
                        <div class="selectProduct">
                            <div class="selectProduct" data-title="华为P9" data-id="华为P9" data-size="5.2&quot;"  data-weight="144 g" data-os="Android 6.0" data-processor="海思麒麟955 2.5GHz(8核)" data-battery="3000mAH">
                                <a class="btn-floating light-grey addButtonCircular addToCompare">+</a>
                                <img src="../img/huawei_p9.jpg" class="imgFill productImg">
                            <h4>华为 P9</h4>
                            <a href="#0" class="btn btn-success add-button" data-price="3669.00" data-proid="1" data-proname="华为P9" data-proimg="../img/huawei_p9.jpg">添加到购物车</a></div>
                        </div>
                    </div>
                    <div class="col-md-3 col-xs-6 pro text-center">
                        <div class="selectProduct">
                            <div class="selectProduct" data-title="GalaxyS7" data-id="三星 Galaxy S7" data-size="5.1&quot;" data-weight="152 g" data-os="Android 6.0" data-processor="高通骁龙820 2.15GHz(4核)" data-battery="3000mAH">
                                <a class="btn-floating light-grey addButtonCircular addToCompare">+</a>
                            <img src="../img/Galaxy_s7.jpg" class="imgFill productImg">
                            <h4>Galaxy S7</h4>
                            <a href="#0" class="btn btn-success add-button" data-price="3559.99" data-proid="2" data-proname="Galaxy S7" data-proimg="../img/Galaxy_s7.jpg">添加到购物车</a></div>
                        </div>
                    </div>
                    <div class="col-md-3 col-xs-6 pro text-center">
                        <div class="selectProduct">
                            <div class="selectProduct" data-title="iPhone6" data-id="iPhone 6" data-size="4.7&quot;" data-weight="129 g" data-os="iOS 8" data-processor="苹果A8+M8运动协处理器 1.4GHz(64位双核)" data-battery="1810mAH">
                                <a class="btn-floating light-grey addButtonCircular addToCompare">+</a>
                            <img src="../img/iphone6.jpg" class="imgFill productImg">
                            <h4>iPhone 6</h4>
                            <a href="#0" class="btn btn-success add-button" data-price="3559.00" data-proid="3" data-proname="iPhone 6" data-proimg="../img/iphone6.jpg">添加到购物车</a></div>
                        </div>
                    </div>
                    <div class="col-md-3 col-xs-6 pro text-center">
                        <div class="selectProduct">
                            <div class="selectProduct" data-title="iPhoneSE" data-id="iPhone SE" data-size="4.0&quot;" data-weight="113 g" data-os="iOS 9" data-processor="苹果A9+M9运动协处理器 1.85GHz" data-battery="1624mAH">
                                <a class="btn-floating light-grey addButtonCircular addToCompare">+</a>
                            <img src="../img/iphone_se.jpg" class="imgFill productImg">
                            <h4>iPhone SE</h4>
                            <a href="#0" class="btn btn-success add-button" data-price="3449.99" data-proid="4" data-proname="iPhone SE" data-proimg="../img/iphone_se.jpg">添加到购物车</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </fieldset>
    </div>
    <%--开始对比--%>
    <div class="row">
        <div class="col-md-12 comparePanle">
            <div class="row">
                <div class="col-md-9">
                    <h4>对比中的产品</h4>
                </div>
                <div class="col-md-3">
                    &nbsp;
                    <button class="btn btn-default cmprBtn" disabled>开始对比</button>
                </div>
            </div>
            <div class="comparePan"></div>
        </div>
    </div>
    <!--end of preview panel-->

    <!-- comparision popup-->
    <div id="id01" class="animate-zoom modal modPos">
        <div class="modal-title">
            <a onclick="document.getElementById('id01').style.display='none'" class="modal-closebtn">&times;</a>
        </div>
        <div class="row contentPop"></div>
    </div>
    <%--购物车结算--%>
    <div class="cd-cart-container empty">
        <a href="#0" class="cd-cart-trigger">
            购物车
            <ul class="count"> <!-- cart items count -->
                <li>0</li>
                <li>0</li>
            </ul> <!-- .count -->
        </a>

        <div class="cd-cart">
            <div class="wrapper">
                <header>
                    <h2>购物车</h2>
                    <span class="undo">已删除 <a href="#0">恢复</a></span>
                </header>

                <div class="body">
                    <ul>
                        <!-- products added to the cart will be inserted here using JavaScript -->
                    </ul>
                </div>

                <footer>
                    <a href="../jsps/carSettle.jsp" class="checkout"><em>结算 - ￥<span>0</span></em></a>
                </footer>
            </div>
        </div> <!-- .cd-cart -->
    </div>
    <script type="text/javascript" src="../js/topAd.js"></script>
    <script type="text/javascript" src="../js/timeLast.js"></script>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/cart.js"></script>
</body>
</html>
