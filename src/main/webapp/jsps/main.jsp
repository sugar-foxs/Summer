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

    <script src="../js/main.js"></script>

</head>
<body style="vertical-align: middle">
<div class="row" style="background-color: whitesmoke;height: 36px;min-width: 1200px;">
    <div class="col-xs-4 col-xs-offset-1">
        <c:choose>
            <c:when test="${customer.customerName==null}">
                <a href="/jsps/login.jsp">
                    <span style="color: darkorange">
                        亲，请登录&nbsp;
                    </span>
                </a>
                <a href="#">
                    <span style="color: #999999" onmouseover="this.style.color='darkorange'" onmouseout="this.style.color='#999999'">
                    免费注册&nbsp;&nbsp;
                    </span>
                </a>
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
                </div>
            </c:otherwise>
        </c:choose>
        <a href="#">
            <span style="color: #999999;" onmouseover="this.style.color='darkorange'" onmouseout="this.style.color='#999999'">
                手机逛书城
            </span>
        </a>
    </div>
    <div class="col-xs-7 ">
    <%--<button id="bookstore_button" style="border: 0;height:36px;background-color:whitesmoke;"--%>
            <%--onmouseover="a_onmouseover('mybookstore','bookstore_button');" onmouseout="a_onmouseout('mybookstore','bookstore_button');">--%>
        <%--我的书城 <span class="caret"></span>--%>
    <%--</button>--%>
    <%--<div id="mybookstore" style="display:none;width: 100px; height:auto; z-index:2; position:absolute; background-repeat: no-repeat; background-color: white; border: 1px solid whitesmoke;">--%>
        <%--<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0" >--%>
            <%--<tr>--%>
                <%--<td height="30"><a href="#">已买到的宝贝</a></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td height="30"><a href="#">我的足迹</a></td>--%>
            <%--</tr>--%>
        <%--</table>--%>
    <%--</div>--%>
        <div class="dropdown" style="float: left">
            <button type="button" class="btn dropdown-toggle" id="dropdownMenu1"
                    data-toggle="dropdown">
                我的书城<span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu1" aria-labelledby="dropdownMenu1">
                <li role="presentation">
                    <a role="menuitem" tabindex="-1" href="#">已买到的宝贝</a>
                </li>
                <li role="presentation">
                    <a role="menuitem" tabindex="-1" href="#">我的足迹</a>
                </li>
            </ul>
        </div>
        <div class="dropdown" style="float: left">
            <button type="button" class="btn dropdown-toggle" id="dropdownMenu2"
                    data-toggle="dropdown">
                收藏夹<span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu2" aria-labelledby="dropdownMenu2">
                <li role="presentation">
                    <a role="menuitem" tabindex="-1" href="#">收藏的宝贝</a>
                </li>
                <li role="presentation">
                    <a role="menuitem" tabindex="-1" href="#">收藏的店铺</a>
                </li>
            </ul>
        </div>

    </div>
</div>
<div class="container">


</div>
</body>
</html>
