<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
		<meta http-equiv="content-type" content="text/html charset=utf-8" >
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>首页</title>
        <link rel="stylesheet" href="../css/bootstrap.css"/>
        <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
        <script type="text/javascript" src="../js/bootstrap.js"></script>
        <style type="text/css">
            #test{width:102px;height: 80px;margin: 20px;}
            #canvas{
                display: block;
                border: 2px solid #000000;
                margin: 50px auto;
            }
        </style>
    </head>
    <body>
    <div id="container">
        <div class="row">
            <div class="col-lg-1"><a href="../jsps/waterFall.jsp">我的宜居环境</a></div>
            <div class="col-lg-2">
                <%--小兔子特效--%>
                <div id="test"></div>
            </div>
            <div class="col-lg-3">用户：<h2><%=request.getAttribute("username") %></h2></div>
            <div class="col-lg-2"><a href="../jsps/customerEdit.jsp">查询所有用户</a></div>
            <div class="col-lg-2"><a href="../jsps/findCustomer.jsp">通过id查找用户</a></div>
            <div class="col-lg-2"> <a href="../jsps/jtemplate.jsp">成功励志类图书</a></div>
        </div>
    </div>
    <div id="colorTime">
        <%--彩色时钟特效--%>
        <center><canvas id="canvas" width="1100" height="450"></canvas></center>
    </div>
    <div class="content2">
        <center><h2>距离2016年圣诞节还有<span id="timeShow"></span>天</h2></center>
    </div>
    <div><center><a href="../jsps/PicChange.jsp"><h3>先去一睹为快吧！</h3></a></center></div>

    <script type="text/javascript" src="../js/rabit.js"></script>
    <script type="text/javascript" src="../js/colorTime.js"></script>
    </body>
</html>