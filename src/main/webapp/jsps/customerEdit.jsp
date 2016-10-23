<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-22
  Time: 下午7:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>增加用户</title>
    <link href="../css/bootstrap.css" rel="stylesheet" />
    <script src="../js/jquery-3.0.0.min.js"></script>
    <script src="../js/bootstrap.js"></script>
    <script src="../js/customerEdit.js"></script>
</head>
<body>
<div class="row">
    <div class="col-sm-12" style="text-align: center">
        <a href="<c:url value="/jsps/register.jsp"/>">
            <h4 style="text-decoration:underline">增加用户
                <span class="glyphicon glyphicon-user"></span>
            </h4>
        </a>
    </div>
</div>
<div class="row">
    <div class="col-sm-10 col-sm-offset-1">
        <table style="width:100%;border: 1px solid">
            <thead>
            <tr style="background-color: #215867;text-align: center;">
                <%--<td><span style="color: white">用户地址</span></td>--%>
                <td><span style="color: white">用户邮箱</span></td>
                <td><span style="color: white">用户id</span></td>
                <td><span style="color: white">用户姓名</span></td>
                <td><span style="color: white">用户密码</span></td>
                <td><span style="color: white">用户电话</span></td>
                <td>&nbsp;</td>
            </tr>
            </thead>
            <tbody id="list" style="text-align: center">
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
