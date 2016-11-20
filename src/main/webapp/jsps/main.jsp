<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="../css/bootstrap.css" rel="stylesheet" />
    <script src="../js/jquery-1.9.1.js"></script>
    <script src="../js/bootstrap.js"></script>
    <link href="../css/main.css" rel="stylesheet" />
    <script  type="text/javascript" src="../js/jquery-jtemplates.js"></script>
    <script src="../js/main.js"></script>

</head>
<body>
<div class="row" style="background-color: whitesmoke;height: 36px;min-width: 800px;">
    <div class="col-xs-4 col-xs-offset-2">
        <c:choose>
            <c:when test="${customer.customerName==null}">
                <a href="/jsps/login.jsp">
                    <span style="color: darkorange">
                        亲，请登录&nbsp;
                    </span>
                </a>
                <%--<a href="#">--%>
                    <%--<span style="color: #999999" onmouseover="this.style.color='darkorange'" onmouseout="this.style.color='#999999'">--%>
                    <%--免费注册&nbsp;&nbsp;--%>
                    <%--</span>--%>
                <%--</a>--%>
            </c:when>
            <c:otherwise>
                <div class="dropdown" style="float: left">
                    <button type="button" class="btn dropdown-toggle" id="dropdownMenu1"
                            data-toggle="dropdown">
                            ${customer.customerName}<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu1" aria-labelledby="dropdownMenu1">
                        <li role="presentation">
                            <a role="menuitem" tabindex="-1" href="#">choubuyaolian</a>
                        </li>
                        <li role="presentation">
                            <a role="menuitem" tabindex="-1" href="#">shabi</a>
                        </li>
                    </ul>
                    <b>您好！</b>
                    <a href="/logout.do">退出</a>
                </div>
            </c:otherwise>
        </c:choose>
    </div>

    <div class="col-xs-4" >
        <ul class="summer_head_ul">
            <li><a href="/shopCart/tocar.do">购物车</a></li>
            <li><a>我的订单</a></li>
        </ul>

    </div>
</div>
<%--<div class="search">--%>

<%--</div>--%>
<div class="classify">

    <ul class="topmenu">
        <div class="toptitle">
            全部商品分类
        </div>
        <li><a href="#">图书、音像、数字商品</a>
            <%--<span></span>--%>
            <%--<b><a href="#">文学</a> <a href="#">经管</a>--%>
            <%--<a href="#">畅读VIP</a></b>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">电子书</a></dt>
                        <dd>
                            <a href="#">免费</a> <a href="#">小说</a> <a href="#">励志与成功</a> <a href="#">婚恋/两性</a>
                            <a href="#">文学</a> <a href="#">经管</a> <a href="#">畅读VIP</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">数字音乐</a></dt>
                        <dd>
                            <a href="#">通俗流行</a> <a href="#">古典音乐</a> <a href="#">摇滚说唱</a> <a href="#">爵士蓝调</a>
                            <a href="#">乡村民谣</a> <a href="#">有声读物</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">音像</a></dt>
                        <dd>
                            <a href="#">音乐</a> <a href="#">影视</a> <a href="#">教育音像</a> <a href="#">游戏</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">文艺</a></dt>
                        <dd>
                            <a href="#">小说</a> <a href="#">文学</a> <a href="#">青春文学</a> <a href="#">传记</a> <a
                                href="#">艺术</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">人文社科</a></dt>
                        <dd>
                            <a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a href="#">国学/古籍</a>
                            <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">经管励志</a></dt>
                        <dd>
                            <a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a href="#">励志与成功</a>
                        </dd>
                    </dl>
                    <dl class="fore7">
                        <dt><a href="#">生活</a></dt>
                        <dd>
                            <a href="#">家教与育儿</a> <a href="#">旅游/地图</a> <a href="#">烹饪/美食</a> <a href="#">时尚/美妆</a>
                            <a href="#">家居</a> <a href="#">婚恋与两性</a> <a href="#">娱乐/休闲</a> <a href="#">健身与保健</a>
                            <a href="#">动漫/幽默</a> <a href="#">体育/运动</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">科技</a></dt>
                        <dd>
                            <a href="#">科普</a> <a href="#">IT</a> <a href="#">建筑</a> <a href="#">医学</a> <a href="#">
                            工业技术</a> <a href="#">电子/通信</a> <a href="#">农林</a> <a href="#">科学与自然</a>
                        </dd>
                    </dl>
                </div>
            </div>
        </li>
        <li><a href="#">家用电器</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">大 家 电</a></dt>
                        <dd>
                            <a href="#">平板电视</a> <a href="#">空调</a> <a href="#">冰箱</a> <a href="#">洗衣机</a> <a
                                href="#">家庭影院</a> <a href="#">DVD</a> <a href="#">迷你音响</a> <a href="#">烟机/灶具</a>
                            <a href="#">热水器</a> <a href="#">消毒柜/洗碗机</a> <a href="#">酒柜/冷柜</a> <a href="#">家电配件</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">生活电器</a></dt>
                        <dd>
                            <a href="#">电风扇</a> <a href="#">冷风扇</a> <a href="#">净化器</a> <a href="#">饮水机</a>
                            <a href="#">净水设备</a> <a href="#">挂烫机/熨斗</a> <a href="#">吸尘器</a> <a href="#">电话机</a>
                            <a href="#">插座</a> <a href="#">收录/音机</a> <a href="#">清洁机</a> <a href="#">加湿器</a>
                            <a href="#">除湿/干衣机</a> <a href="#">取暖电器</a> <a href="#">其它生活电器</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">厨房电器</a></dt>
                        <dd>
                            <a href="#">电压力锅</a> <a href="#">电饭煲</a> <a href="#">豆浆机</a> <a href="#">面包机</a>
                            <a href="#">咖啡机</a> <a href="#">微波炉</a> <a href="#">料理/榨汁机</a> <a href="#">电烤箱</a>
                            <a href="#">电磁炉</a> <a href="#">电饼铛/烧烤盘</a> <a href="#">煮蛋器</a> <a href="#">酸奶机</a>
                            <a href="#">电水壶/热水瓶</a> <a href="#">电炖锅</a> <a href="#">多用途锅</a> <a href="#">果蔬解毒机</a>
                            <a href="#">其它厨房电器</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">个护健康</a></dt>
                        <dd>
                            <a href="#">剃须刀</a> <a href="#">剃/脱毛器</a> <a href="#">口腔护理</a> <a href="#">电吹风</a>
                            <a href="#">美容</a> <a href="#">美发</a> <a href="#">按摩器</a> <a href="#">按摩椅</a> <a
                                href="#">足浴盆</a> <a href="#">血压计</a> <a href="#">健康秤/厨房秤</a> <a href="#">血糖仪</a>
                            <a href="#">体温计</a> <a href="#">计步器/脂肪检测仪</a> <a href="#">其它健康电器</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">五金家装</a></dt>
                        <dd>
                            <a href="#">电动工具</a> <a href="#">手动工具</a> <a href="#">仪器仪表</a> <a href="#">浴霸/排气扇</a>
                            <a href="#">灯具</a> <a href="#">LED灯</a> <a href="#">洁身器</a> <a href="#">水槽</a> <a
                                href="#">龙头</a> <a href="#">淋浴花洒</a> <a href="#">厨卫五金</a> <a href="#">家具五金</a>
                            <a href="#">门铃</a> <a href="#">电气开关</a> <a href="#">插座</a> <a href="#">电工电料</a>
                            <a href="#">监控安防</a> <a href="#">电线/线缆</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">手机、数码</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">手机通讯</a></dt>
                        <dd>
                            <a href="#">手机</a> <a href="#">对讲机</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">京东通信</a></dt>
                        <dd>
                            <a href="#">选号中心</a> <a href="#">自助服务</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">运营商</a></dt>
                        <dd>
                            <a href="#">购机送费</a> <a href="#">0元购机</a> <a href="#">选号入网</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">手机配件</a></dt>
                        <dd>
                            <a href="#">电池</a> <a href="#">蓝牙耳机</a> <a href="#">充电器/数据线</a> <a href="#">手机耳机</a>
                            <a href="#">贴膜</a> <a href="#">存储卡</a> <a href="#">保护套</a> <a href="#">车载</a> <a
                                href="#">iPhone配件</a> <a href="#">创意配件</a> <a href="#">便携/无线音箱</a> <a href="#">手机饰品</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">摄影摄像</a></dt>
                        <dd>
                            <a href="#">数码相机</a> <a href="#">单电/微单相机</a> <a href="#">单反相机</a> <a href="#">拍立得</a>
                            <a href="#">运动相机</a> <a href="#">摄像机</a> <a href="#">镜头</a> <a href="#">户外器材</a>
                            <a href="#">摄影器材</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">数码配件</a></dt>
                        <dd>
                            <a href="#">存储卡</a> <a href="#">读卡器</a> <a href="#">滤镜</a> <a href="#">闪光灯/手柄</a>
                            <a href="#">相机包</a> <a href="#">三脚架/云台</a> <a href="#">相机清洁</a> <a href="#">相机贴膜</a>
                            <a href="#">机身附件</a> <a href="#">镜头附件</a> <a href="#">电池/充电器</a> <a href="#">移动电源</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">时尚影音</a></dt>
                        <dd>
                            <a href="#">耳机/耳麦</a> <a href="#">音箱/音响</a> <a href="#">麦克风</a> <a href="#">MP3/MP4</a>
                            <a href="#">数码相框</a> <a href="#">专业音频</a> <a href="#">苹果周边</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">电脑、办公</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">电脑配件</a></dt>
                        <dd>
                            <a href="#">CPU</a> <a href="#">主板</a> <a href="#">显卡</a> <a href="#">硬盘</a> <a href="#">
                            SSD固态硬盘</a> <a href="#">内存</a> <a href="#">机箱</a> <a href="#">电源</a> <a href="#">显示器</a>
                            <a href="#">刻录机/光驱</a> <a href="#">声卡/扩展卡</a> <a href="#">散热器</a> <a href="#">装机配件</a>
                            <a href="#">组装电脑</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">外设产品</a></dt>
                        <dd>
                            <a href="#">鼠标</a> <a href="#">键盘</a> <a href="#">游戏设备</a> <a href="#">U盘</a> <a
                                href="#">移动硬盘</a> <a href="#">鼠标垫</a> <a href="#">摄像头</a> <a href="#">线缆</a>
                            <a href="#">电玩</a> <a href="#">手写板</a> <a href="#">外置盒</a> <a href="#">电脑工具</a>
                            <a href="#">电脑清洁</a> <a href="#">UPS</a> <a href="#">插座</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">网络产品</a></dt>
                        <dd>
                            <a href="#">路由器</a> <a href="#">网卡</a> <a href="#">交换机</a> <a href="#">网络存储</a>
                            <a href="#">4G/3G上网</a> <a href="#">网络盒子</a> <a href="#">网络配件</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">办公打印</a></dt>
                        <dd>
                            <a href="#">打印机</a> <a href="#">一体机</a> <a href="#">投影机</a> <a href="#">投影配件</a>
                            <a href="#">传真机</a> <a href="#">复合机</a> <a href="#">碎纸机</a> <a href="#">扫描仪</a>
                            <a href="#">墨盒</a> <a href="#">硒鼓</a> <a href="#">墨粉</a> <a href="#">色带</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">办公文仪</a></dt>
                        <dd>
                            <a href="#">办公文具</a> <a href="#">文件管理</a> <a href="#">笔类</a> <a href="#">纸类</a>
                            <a href="#">本册/便签</a> <a href="#">学生文具</a> <a href="#">财务用品</a> <a href="#">计算器</a>
                            <a href="#">激光笔</a> <a href="#">白板/封装</a> <a href="#">考勤机</a> <a href="#">刻录碟片/附件</a>
                            <a href="#">点钞机</a> <a href="#">支付设备/POS机</a> <a href="#">安防监控</a> <a href="#">呼叫/会议设备</a>
                            <a href="#">保险柜</a> <a href="#">办公家具</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">服务产品</a></dt>
                        <dd>
                            <a href="#">上门服务</a> <a href="#">远程服务</a> <a href="#">电脑软件</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">家居、家具、家装、厨具</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">厨具</a></dt>
                        <dd>
                            <a href="#">烹饪锅具</a> <a href="#">刀剪菜板</a> <a href="#">厨房配件</a> <a href="#">水具酒具</a>
                            <a href="#">餐具</a> <a href="#">茶具/咖啡具</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">家装建材</a></dt>
                        <dd>
                            <a href="#">灯饰照明</a> <a href="#">厨房卫浴</a> <a href="#">五金工具</a> <a href="#">电工电料</a>
                            <a href="#">墙地面材料</a> <a href="#">装饰材料</a> <a href="#">装修服务</a> <a href="#">吸顶灯</a>
                            <a href="#">淋浴花洒</a> <a href="#">开关插座</a> <a href="#">油漆涂料</a> <a href="#">龙头</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">家纺</a></dt>
                        <dd>
                            <a href="#">床品套件</a> <a href="#">被子</a> <a href="#">蚊帐</a> <a href="#">凉席</a> <a
                                href="#">床单被罩</a> <a href="#">枕芯</a> <a href="#">毛巾浴巾</a> <a href="#">布艺软饰</a>
                            <a href="#">毯子</a> <a href="#">抱枕靠垫</a> <a href="#">床垫/床褥</a> <a href="#">窗帘/窗纱</a>
                            <a href="#">电热毯</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">家具</a></dt>
                        <dd>
                            <a href="#">卧室家具</a> <a href="#">客厅家具</a> <a href="#">餐厅家具</a> <a href="#">书房家具</a>
                            <a href="#">储物家具</a> <a href="#">阳台/户外</a> <a href="#">商业办公</a> <a href="#">床</a>
                            <a href="#">床垫</a> <a href="#">沙发</a> <a href="#">电脑椅</a> <a href="#">衣柜</a> <a href="#">
                            茶几</a> <a href="#">电视柜</a> <a href="#">餐桌</a> <a href="#">电脑桌</a> <a href="#">鞋架/衣帽架</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">灯具</a></dt>
                        <dd>
                            <a href="#">台灯</a> <a href="#">吸顶灯</a> <a href="#">筒灯射灯</a> <a href="#">LED灯</a>
                            <a href="#">节能灯</a> <a href="#">落地灯</a> <a href="#">五金电器</a> <a href="#">应急灯/手电</a>
                            <a href="#">装饰灯</a> <a href="#">吊灯</a> <a href="#">氛围照明</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">生活日用</a></dt>
                        <dd>
                            <a href="#">收纳用品</a> <a href="#">雨伞雨具</a> <a href="#">浴室用品</a> <a href="#">缝纫/针织用品</a>
                            <a href="#">洗晒/熨烫</a> <a href="#">净化除味</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">服饰内衣、珠宝首饰</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">男装</a></dt>
                        <dd>
                            <a href="#">衬衫</a> <a href="#">T恤</a> <a href="#">POLO衫</a> <a href="#">针织衫</a>
                            <a href="#">夹克</a> <a href="#">卫衣</a> <a href="#">风衣</a> <a href="#">马甲/背心</a> <a
                                href="#">短裤</a> <a href="#">休闲裤</a> <a href="#">牛仔裤</a> <a href="#">西服</a> <a href="#">
                            西裤</a> <a href="#">西服套装</a> <a href="#">真皮皮衣</a> <a href="#">仿皮皮衣</a> <a href="#">羽绒服</a>
                            <a href="#">毛呢大衣</a> <a href="#">棉服</a> <a href="#">羊绒衫</a> <a href="#">羊毛衫</a>
                            <a href="#">卫裤/运动裤</a> <a href="#">加绒裤</a> <a href="#">设计师/潮牌</a> <a href="#">唐装/中山装</a>
                            <a href="#">工装</a> <a href="#">中老年男装</a> <a href="#">大码男装</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">内衣</a></dt>
                        <dd>
                            <a href="#">文胸</a> <a href="#">睡衣/家居服</a> <a href="#">情侣睡衣</a> <a href="#">文胸套装</a>
                            <a href="#">少女文胸</a> <a href="#">女式内裤</a> <a href="#">男式内裤</a> <a href="#">商务男袜</a>
                            <a href="#">休闲棉袜</a> <a href="#">吊带/背心</a> <a href="#">打底衫</a> <a href="#">抹胸</a>
                            <a href="#">连裤袜/丝袜</a> <a href="#">美腿袜</a> <a href="#">打底裤袜</a> <a href="#">塑身美体</a>
                            <a href="#">大码内衣</a> <a href="#">内衣配件</a> <a href="#">泳衣</a> <a href="#">秋衣秋裤</a>
                            <a href="#">保暖内衣</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">服饰配件</a></dt>
                        <dd>
                            <a href="#">太阳镜</a> <a href="#">光学镜架/镜片</a> <a href="#">防辐射眼镜</a> <a href="#">女士丝巾/围巾/披肩</a>
                            <a href="#">棒球帽</a> <a href="#">遮阳伞/雨伞</a> <a href="#">遮阳帽</a> <a href="#">领带/领结/领带夹</a>
                            <a href="#">男士腰带/礼盒</a> <a href="#">防晒手套</a> <a href="#">老花镜</a> <a href="#">袖扣</a>
                            <a href="#">男士丝巾/围巾</a> <a href="#">装饰眼镜</a> <a href="#">女士腰带/礼盒</a> <a href="#">游泳镜</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">珠宝首饰</a></dt>
                        <dd>
                            <a href="#">时尚饰品</a> <a href="#">钻石</a> <a href="#">翡翠玉石</a> <a href="#">纯金K金饰品</a>
                            <a href="#">金银投资</a> <a href="#">银饰</a> <a href="#">水晶玛瑙</a> <a href="#">彩宝</a>
                            <a href="#">铂金</a> <a href="#">天然木饰</a> <a href="#">珍珠</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">个护化妆</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">面部护肤</a></dt>
                        <dd>
                            <a href="#">清洁</a> <a href="#">护肤</a> <a href="#">面膜</a> <a href="#">剃须</a> <a href="#">
                            套装</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">洗发护发</a></dt>
                        <dd>
                            <a href="#">洗发</a> <a href="#">护发</a> <a href="#">染发</a> <a href="#">造型</a> <a href="#">
                                假发</a> <a href="#">套装</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">身体护肤</a></dt>
                        <dd>
                            <a href="#">沐浴</a> <a href="#">润肤</a> <a href="#">颈部</a> <a href="#">手足</a> <a href="#">
                                纤体塑形</a> <a href="#">美胸</a> <a href="#">套装</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">口腔护理</a></dt>
                        <dd>
                            <a href="#">牙膏/牙粉</a> <a href="#">牙刷/牙线</a> <a href="#">漱口水</a> <a href="#">套装</a>
                        </dd>
                    </dl>
                    <%--<dl>--%>
                        <%--<dt><a href="#">女性护理</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">卫生巾</a> <a href="#">卫生护垫</a> <a href="#">私密护理</a> <a href="#">脱毛膏</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl>--%>
                        <%--<dt><a href="#">香水彩妆</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">香水</a> <a href="#">底妆</a> <a href="#">腮红</a> <a href="#">眼部</a> <a href="#">--%>
                                <%--唇部</a> <a href="#">美甲</a> <a href="#">美容工具</a> <a href="#">套装</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">鞋靴、箱包、钟表、奢侈品</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <%--<dl>--%>
                        <%--<dt><a href="#">时尚女鞋</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">凉鞋</a> <a href="#">单鞋</a> <a href="#">高跟鞋</a> <a href="#">坡跟鞋</a> <a--%>
                                <%--href="#">松糕鞋</a> <a href="#">鱼嘴鞋</a> <a href="#">休闲鞋</a> <a href="#">帆布鞋</a>--%>
                            <%--<a href="#">拖鞋/人字拖</a> <a href="#">妈妈鞋</a> <a href="#">防水台</a> <a href="#">雨鞋/雨靴</a>--%>
                            <%--<a href="#">内增高</a> <a href="#">布鞋/绣花鞋</a> <a href="#">女靴</a> <a href="#">雪地靴</a>--%>
                            <%--<a href="#">踝靴</a> <a href="#">马丁靴</a> <a href="#">鞋配件</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl>--%>
                        <%--<dt><a href="#">流行男鞋</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">休闲鞋</a> <a href="#">凉鞋/沙滩鞋</a> <a href="#">帆布鞋</a> <a href="#">商务休闲鞋</a>--%>
                            <%--<a href="#">正装鞋</a> <a href="#">增高鞋</a> <a href="#">拖鞋/人字拖</a> <a href="#">工装鞋</a>--%>
                            <%--<a href="#">男靴</a> <a href="#">传统布鞋</a> <a href="#">功能鞋</a> <a href="#">鞋配件</a>--%>
                            <%--<a href="#">定制鞋</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <dl>
                        <dt><a href="#">潮流女包</a></dt>
                        <dd>
                            <a href="#">单肩包</a> <a href="#">手提包</a> <a href="#">斜挎包</a> <a href="#">双肩包</a>
                            <a href="#">钱包</a> <a href="#">手拿包/晚宴包</a> <a href="#">卡包/零钱包</a> <a href="#">钥匙包</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">精品男包</a></dt>
                        <dd>
                            <a href="#">商务公文包</a> <a href="#">单肩/斜挎包</a> <a href="#">男士手包</a> <a href="#">双肩包</a>
                            <a href="#">钱包/卡包</a> <a href="#">钥匙包</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">功能箱包</a></dt>
                        <dd>
                            <a href="#">拉杆箱/拉杆包</a> <a href="#">旅行包</a> <a href="#">电脑包</a> <a href="#">休闲运动包</a>
                            <a href="#">相机包</a> <a href="#">腰包/胸包</a> <a href="#">登山包</a> <a href="#">旅行配件</a>
                            <a href="#">书包</a> <a href="#">妈咪包</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">奢侈品</a></dt>
                        <dd>
                            <a href="#">箱包</a> <a href="#">钱包</a> <a href="#">服饰</a> <a href="#">腰带</a> <a href="#">
                            鞋靴</a> <a href="#">太阳镜/眼镜框</a> <a href="#">饰品</a> <a href="#">配件</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">钟表</a></dt>
                        <dd>
                            <a href="#">男表</a> <a href="#">女表</a> <a href="#">儿童表</a> <a href="#">座钟挂钟</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">礼品</a></dt>
                        <dd>
                            <a href="#">火机烟具</a> <a href="#">军刀军具</a> <a href="#">美妆礼品</a> <a href="#">工艺礼品</a>
                            <a href="#">礼盒礼券</a> <a href="#">礼品文具</a> <a href="#">收藏品</a> <a href="#">古董把玩</a>
                            <a href="#">地方礼品</a> <a href="#">创意礼品</a> <a href="#">婚庆用品</a> <a href="#">鲜花绿植</a>
                            <a href="#">京东卡</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">运动户外</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">运动鞋包</a></dt>
                        <dd>
                            <a href="#">休闲鞋</a> <a href="#">跑步鞋</a> <a href="#">板鞋</a> <a href="#">帆布鞋</a> <a
                                href="#">篮球鞋</a> <a href="#">足球鞋</a> <a href="#">乒羽网鞋</a> <a href="#">专项运动鞋</a>
                            <a href="#">训练鞋</a> <a href="#">拖鞋</a> <a href="#">运动包</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">运动服饰</a></dt>
                        <dd>
                            <a href="#">卫衣/套头衫</a> <a href="#">毛衫/线衫</a> <a href="#">夹克/风衣</a> <a href="#">棉服</a>
                            <a href="#">羽绒服</a> <a href="#">T恤</a> <a href="#">乒羽网服</a> <a href="#">训练服</a>
                            <a href="#">运动背心</a> <a href="#">运动裤</a> <a href="#">运动套装</a> <a href="#">运动配饰</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">健身训练</a></dt>
                        <dd>
                            <a href="#">跑步机</a> <a href="#">健身车/动感单车</a> <a href="#">综合训练器</a> <a href="#">其他大型器械</a>
                            <a href="#">哑铃</a> <a href="#">仰卧板/收腹机</a> <a href="#">其他中小型器材</a> <a href="#">武术搏击</a>
                            <a href="#">运动护具</a> <a href="#">瑜伽舞蹈</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">骑行运动</a></dt>
                        <dd>
                            <a href="#">山地车/公路车</a> <a href="#">折叠车</a> <a href="#">电动车</a> <a href="#">其他整车</a>
                            <a href="#">骑行装备</a> <a href="#">骑行服</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">体育用品</a></dt>
                        <dd>
                            <a href="#">乒乓球</a> <a href="#">羽毛球</a> <a href="#">网球</a> <a href="#">篮球</a> <a
                                href="#">足球</a> <a href="#">高尔夫</a> <a href="#">台球</a> <a href="#">轮滑滑板</a>
                            <a href="#">排球</a> <a href="#">棋牌麻将</a> <a href="#">其它</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">户外鞋服</a></dt>
                        <dd>
                            <a href="#">冲锋衣裤</a> <a href="#">速干衣裤</a> <a href="#">滑雪服</a> <a href="#">羽绒服/棉服</a>
                            <a href="#">休闲衣裤</a> <a href="#">抓绒衣裤</a> <a href="#">软壳衣裤</a> <a href="#">T恤</a>
                            <a href="#">户外风衣</a> <a href="#">功能内衣</a> <a href="#">军迷服饰</a> <a href="#">登山鞋</a>
                            <a href="#">徒步鞋</a> <a href="#">越野跑鞋</a> <a href="#">休闲鞋</a> <a href="#">雪地靴</a>
                            <a href="#">工装鞋</a> <a href="#">溯溪鞋</a> <a href="#">沙滩/凉拖</a> <a href="#">户外袜</a>
                        </dd>
                    </dl>
                    <%--<dl>--%>
                        <%--<dt><a href="#">户外装备</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">背包</a> <a href="#">帐篷/垫子</a> <a href="#">睡袋/吊床</a> <a href="#">登山攀岩</a>--%>
                            <%--<a href="#">户外照明</a> <a href="#">野餐烧烤</a> <a href="#">便携桌椅床</a> <a href="#">户外工具</a>--%>
                            <%--<a href="#">望远镜</a> <a href="#">户外仪表</a> <a href="#">旅游用品</a> <a href="#">军迷用品</a>--%>
                            <%--<a href="#">救援装备</a> <a href="#">滑雪装备</a> <a href="#">极限户外</a> <a href="#">冲浪潜水</a>--%>
                            <%--<a href="#">户外配饰</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl>--%>
                        <%--<dt><a href="#">垂钓用品</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">鱼竿鱼线</a> <a href="#">浮漂鱼饵</a> <a href="#">钓鱼桌椅</a> <a href="#">钓鱼配件</a>--%>
                            <%--<a href="#">钓箱鱼包</a> <a href="#">其它</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl>--%>
                        <%--<dt><a href="#">游泳用品</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">泳镜</a> <a href="#">泳帽</a> <a href="#">游泳包防水包</a> <a href="#">男士泳衣</a>--%>
                            <%--<a href="#">女士泳衣</a> <a href="#">比基尼</a> <a href="#">其它</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">汽车用品</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">维修保养</a></dt>
                        <dd>
                            <a href="#">润滑油</a> <a href="#">添加剂</a> <a href="#">防冻液</a> <a href="#">滤清器</a>
                            <a href="#">火花塞</a> <a href="#">雨刷</a> <a href="#">车灯</a> <a href="#">后视镜</a> <a
                                href="#">轮胎</a> <a href="#">轮毂</a> <a href="#">刹车片/盘</a> <a href="#">喇叭/皮带</a>
                            <a href="#">蓄电池</a> <a href="#">底盘装甲/护板</a> <a href="#">贴膜</a> <a href="#">汽修工具</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">车载电器</a></dt>
                        <dd>
                            <a href="#">导航仪</a> <a href="#">安全预警仪</a> <a href="#">行车记录仪</a> <a href="#">倒车雷达</a>
                            <a href="#">蓝牙设备</a> <a href="#">时尚影音</a> <a href="#">净化器</a> <a href="#">电源</a>
                            <a href="#">冰箱</a> <a href="#">吸尘器</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">美容清洗</a></dt>
                        <dd>
                            <a href="#">车蜡</a> <a href="#">补漆笔</a> <a href="#">玻璃水</a> <a href="#">清洁剂</a> <a
                                href="#">洗车工具</a> <a href="#">洗车配件</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">汽车装饰</a></dt>
                        <dd>
                            <a href="#">脚垫</a> <a href="#">座垫</a> <a href="#">座套</a> <a href="#">后备箱垫</a> <a
                                href="#">头枕腰靠</a> <a href="#">香水</a> <a href="#">空气净化</a> <a href="#">车内饰品</a>
                            <a href="#">功能小件</a> <a href="#">车身装饰件</a> <a href="#">车衣</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">安全自驾</a></dt>
                        <dd>
                            <a href="#">安全座椅</a> <a href="#">胎压充气</a> <a href="#">防盗设备</a> <a href="#">应急救援</a>
                            <a href="#">保温箱</a> <a href="#">储物箱</a> <a href="#">自驾野营</a> <a href="#">摩托车装备</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">母婴、玩具乐器</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">奶粉</a></dt>
                        <dd>
                            <a href="#">婴幼奶粉</a> <a href="#">成人奶粉</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">营养辅食</a></dt>
                        <dd>
                            <a href="#">DHA</a> <a href="#">钙铁锌/维生素</a> <a href="#">益生菌/初乳</a> <a href="#">清火/开胃</a>
                            <a href="#">米粉/菜粉</a> <a href="#">果泥/果汁</a> <a href="#">面条/粥</a> <a href="#">宝宝零食</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">尿裤湿巾</a></dt>
                        <dd>
                            <a href="#">婴儿尿裤</a> <a href="#">拉拉裤</a> <a href="#">成人尿裤</a> <a href="#">湿巾</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">洗护用品</a></dt>
                        <dd>
                            <a href="#">宝宝护肤</a> <a href="#">宝宝洗浴</a> <a href="#">理发器</a> <a href="#">洗衣液/皂</a>
                            <a href="#">奶瓶清洗</a> <a href="#">日常护理</a> <a href="#">座便器</a> <a href="#">驱蚊防蚊</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">喂养用品</a></dt>
                        <dd>
                            <a href="#">奶瓶奶嘴</a> <a href="#">吸奶器</a> <a href="#">牙胶安抚</a> <a href="#">暖奶消毒</a>
                            <a href="#">辅食料理机</a> <a href="#">碗盘叉勺</a> <a href="#">水壶/水杯</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">童车童床</a></dt>
                        <dd>
                            <a href="#">婴儿床</a> <a href="#">婴儿推车</a> <a href="#">餐椅摇椅</a> <a href="#">学步车</a>
                            <a href="#">三轮车</a> <a href="#">自行车</a> <a href="#">扭扭车</a> <a href="#">滑板车</a>
                            <a href="#">电动车</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">安全座椅</a></dt>
                        <dd>
                            <a href="#">提篮式</a> <a href="#">安全座椅</a> <a href="#">增高垫</a>
                        </dd>
                    </dl>
                    <%--<dl>--%>
                        <%--<dt><a href="#">寝居服饰</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">婴儿外出服</a> <a href="#">婴儿内衣</a> <a href="#">婴儿礼盒</a> <a href="#">婴儿鞋帽袜</a>--%>
                            <%--<a href="#">家居床品</a> <a href="#">安全防护</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl class="0">--%>
                        <%--<dt><a href="#">童装童鞋</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">套装</a> <a href="#">上衣</a> <a href="#">裤子</a> <a href="#">裙子</a> <a href="#">--%>
                            <%--内衣</a> <a href="#">羽绒服/棉服</a> <a href="#">亲子装</a> <a href="#">配饰</a> <a href="#">演出服</a>--%>
                            <%--<a href="#">运动服</a> <a href="#">运动鞋</a> <a href="#">皮鞋/帆布鞋</a> <a href="#">靴子</a>--%>
                            <%--<a href="#">凉鞋</a> <a href="#">功能鞋</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl class="1">--%>
                        <%--<dt><a href="#">玩具乐器</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">适用年龄</a> <a href="#">遥控/电动</a> <a href="#">毛绒布艺</a> <a href="#">娃娃玩具</a>--%>
                            <%--<a href="#">模型玩具</a> <a href="#">健身玩具</a> <a href="#">动漫玩具</a> <a href="#">益智玩具</a>--%>
                            <%--<a href="#">积木拼插</a> <a href="#">DIY玩具</a> <a href="#">创意减压</a> <a href="#">乐器相关</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">食品饮料、酒类、生鲜</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">中外名酒</a></dt>
                        <dd>
                            <a href="#">白酒</a> <a href="#">葡萄酒</a> <a href="#">洋酒</a> <a href="#">啤酒</a> <a href="#">
                            黄酒/养生酒</a> <a href="#">收藏酒/陈年老酒</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">进口食品</a></dt>
                        <dd>
                            <a href="#">牛奶</a> <a href="#">饼干蛋糕</a> <a href="#">糖果/巧克力</a> <a href="#">休闲零食</a>
                            <a href="#">冲调饮品</a> <a href="#">粮油调味</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">休闲食品</a></dt>
                        <dd>
                            <a href="#">休闲零食</a> <a href="#">坚果炒货</a> <a href="#">肉干肉脯</a> <a href="#">蜜饯果干</a>
                            <a href="#">糖果/巧克力</a> <a href="#">饼干蛋糕</a> <a href="#">无糖食品</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">地方特产</a></dt>
                        <dd>
                            <a href="#">新疆</a> <a href="#">四川</a> <a href="#">云南</a> <a href="#">湖南</a> <a href="#">
                            内蒙</a> <a href="#">北京</a> <a href="#">山西</a> <a href="#">福建</a> <a href="#">东北</a>
                            <a href="#">其他</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">茗茶</a></dt>
                        <dd>
                            <a href="#">铁观音</a> <a href="#">普洱</a> <a href="#">龙井</a> <a href="#">绿茶</a> <a href="#">
                            红茶</a> <a href="#">乌龙茶</a> <a href="#">花草茶</a> <a href="#">花果茶</a> <a href="#">黑茶</a>
                            <a href="#">白茶</a> <a href="#">养生茶</a> <a href="#">其他茶</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">饮料冲调</a></dt>
                        <dd>
                            <a href="#">牛奶乳品</a> <a href="#">饮料</a> <a href="#">饮用水</a> <a href="#">咖啡/奶茶</a>
                            <a href="#">蜂蜜/柚子茶</a> <a href="#">冲饮谷物</a> <a href="#">成人奶粉</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">粮油调味</a></dt>
                        <dd>
                            <a href="#">米面杂粮</a> <a href="#">食用油</a> <a href="#">调味品</a> <a href="#">南北干货</a>
                            <a href="#">方便食品</a> <a href="#">有机食品</a>
                        </dd>
                    </dl>
                    <%--<dl>--%>
                        <%--<dt><a href="#">生鲜食品</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">水果蔬菜</a> <a href="#">海鲜水产</a> <a href="#">海参</a> <a href="#">牛排</a>--%>
                            <%--<a href="#">肉禽蛋奶</a> <a href="#">熟食腊味</a> <a href="#">环球美食</a> <a href="#">产地直供</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                    <%--<dl>--%>
                        <%--<dt><a href="#">食品礼券</a></dt>--%>
                        <%--<dd>--%>
                            <%--<a href="#">大闸蟹</a> <a href="#">粽子</a> <a href="#">月饼</a> <a href="#">卡券</a>--%>
                        <%--</dd>--%>
                    <%--</dl>--%>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
        <li><a href="#">营养保健</a>
            <%--<span></span>--%>
            <div class="submenu">
                <div class="leftdiv">
                    <dl>
                        <dt><a href="#">营养健康</a></dt>
                        <dd>
                            <a href="#">调节免疫</a> <a href="#">调节三高</a> <a href="#">缓解疲劳</a> <a href="#">美体塑身</a>
                            <a href="#">美容养颜</a> <a href="#">肝肾养护</a> <a href="#">肠胃养护</a> <a href="#">明目益智</a>
                            <a href="#">骨骼健康</a> <a href="#">改善睡眠</a> <a href="#">抗氧化</a> <a href="#">耐缺氧</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">营养成分</a></dt>
                        <dd>
                            <a href="#">维生素/矿物质</a> <a href="#">蛋白质</a> <a href="#">鱼油/磷脂</a> <a href="#">螺旋藻</a>
                            <a href="#">番茄红素</a> <a href="#">叶酸</a> <a href="#">葡萄籽</a> <a href="#">左旋肉碱</a>
                            <a href="#">辅酶Q10</a> <a href="#">益生菌</a> <a href="#">玛咖</a> <a href="#">膳食纤维</a>
                            <a href="#">牛初乳</a> <a href="#">胶原蛋白</a> <a href="#">大豆异黄酮</a> <a href="#">芦荟提取</a>
                            <a href="#">酵素</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">传统滋补</a></dt>
                        <dd>
                            <a href="#">蜂产品</a> <a href="#">阿胶</a> <a href="#">参类</a> <a href="#">冬虫夏草</a> <a
                                href="#">燕窝</a> <a href="#">海参</a> <a href="#">养生茶饮</a> <a href="#">鹿茸</a> <a href="#">
                            灵芝</a> <a href="#">药食同源</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">成人用品</a></dt>
                        <dd>
                            <a href="#">安全避孕</a> <a href="#">验孕测孕</a> <a href="#">人体润滑</a> <a href="#">情爱玩具</a>
                            <a href="#">情趣内衣</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">保健器械</a></dt>
                        <dd>
                            <a href="#">血压仪器</a> <a href="#">血糖用品</a> <a href="#">养生器械</a> <a href="#">康复辅助</a>
                            <a href="#">中医保健</a> <a href="#">家庭护理</a> <a href="#">呼吸制氧</a>
                        </dd>
                    </dl>
                    <dl>
                        <dt><a href="#">急救卫生</a></dt>
                        <dd>
                            <a href="#">口罩</a> <a href="#">跌打损伤</a> <a href="#">防裂抗冻</a> <a href="#">眼部保健</a>
                            <a href="#">鼻炎健康</a>
                        </dd>
                    </dl>
                </div>
                <div class="rightdiv">
                </div>
            </div>
        </li>
    </ul>
</div>

<!-- 模板内容 -->
<textarea id="template">
   {#foreach $T as record}
      <div class="template">
          <div class="image">
              <a href="/book/{$T.record.bookId}.do">
                <img src="../img/{$T.record.cover}"/>
              </a>
          </div>
          <div class="message">
              <ul>
                  <a href="/book/{$T.record.bookId}.do">
                      <li>{$T.record.bookName}</li>
                      <li>{$T.record.description}</li>
                  </a>
                  <li>￥{$T.record.price}</li>
                  <%--<li>--%>
                    <%--<a>我要购买</a>--%>
                    <%--<a>加入收藏</a>|--%>
                    <%--<a>我要出售</a>--%>
                  <%--</li>--%>
              </ul>
          </div>

      </div>
   {#/for}
</textarea>
<!-- 输出元素 -->
<div>
    <div id="result">
    </div>
    <br/>
    <img id="loading" src="/img/loading.gif"/>
    <span id="span1" >---哥，这回真没有了---</span>
</div>



</body>
</html>
