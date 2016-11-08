<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-11-3
  Time: 下午9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <link href="../css/bootstrap.css" rel="stylesheet" />
    <script src="../js/jquery-1.9.1.js"></script>
    <script src="../js/bootstrap.js"></script>
    <link href="../css/main.css" rel="stylesheet" />
    <script  type="text/javascript" src="../js/jquery-jtemplates.js"></script>
    <script src="../js/shoppingCar.js"></script>
</head>
<body>
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
                                  <li>书价：￥{$T.record.price}
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
<%--<div>--%>
    <%--<img id="loading" style="margin:0 auto;display: none" src="/img/loading.gif"/>--%>
    <%--<span id="span1" style=";display: none">---哥，这回真没有了---</span>--%>
<%--</div>--%>
</body>
</html>
