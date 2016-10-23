<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-15
  Time: 上午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>id查找用户</title>
    <%--<script src="../js/jquery.validate.min.js"></script>--%>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../js/jquery-3.0.0.min.js"></script>

</head>
<body>
<form class="findUserById" name="findUserById" id="findUserById" method="post"
      action="/customer/findcustomerbyid.do">
    <input type="text" placeholder="请输入用户id" id="customerid" name="customerid"/>
    <button type="submit">查询</button>
</form>

</body>
</html>
