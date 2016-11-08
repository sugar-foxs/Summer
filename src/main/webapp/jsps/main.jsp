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
<body style="vertical-align: middle;text-align: center">
<div class="row" style="background-color: whitesmoke;height: 36px;min-width: 1200px;">
    <div class="col-xs-4 col-xs-offset-1">
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
                    <a href="/logout.do">注销</a>
                </div>
            </c:otherwise>
        </c:choose>
        <%--<a href="#">--%>
            <%--<span style="color: #999999;" onmouseover="this.style.color='darkorange'" onmouseout="this.style.color='#999999'">--%>
                <%--手机逛书城--%>
            <%--</span>--%>
        <%--</a>--%>
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
            <button type="button" class="btn dropdown-toggle"
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
<!-- 模板内容 -->
    <textarea id="template" style="display:none">
       {#foreach $T as record}
          <div style="width: 50%;margin-left: 35%">
              <table>
                  <tr>

                          <td>
                              <a href="/book/{$T.record.bookId}.do">
                                <img src="../img/{$T.record.cover}"  width="200"/>
                              </a>
                          </td>
                          <td>
                              <ul style="list-style-type: none">
                                  <li><p style="color: blue">{$T.record.bookName}</p></li>
                                  <li>{$T.record.author}/{$T.record.year}</li>
                                  <li>{$T.record.description}</li>
                      Book            <li>书价：￥{$T.record.price}
                                  <a style="color:blue;">我要购买</a>|
                                  <a style="color:blue;">加入收藏</a>|
                                  <a style="color:blue;">我要出售</a></li>
                              </ul>
                          </td>
                  </tr>
                  <br/>
              </table>
          </div>
       {#/for}
    </textarea>
<!-- 输出元素 -->
<div id="result"></div>
<div>
    <img id="loading" style="margin:0 auto;display: none" src="/img/loading.gif"/>
    <span id="span1" style=";display: none">---哥，这回真没有了---</span>
</div>

<%--<button style="align-self: center" onclick="show()">更多</button>--%>
</body>
</html>
