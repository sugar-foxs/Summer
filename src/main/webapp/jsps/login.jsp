<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-4-26
  Time: 下午9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
上传文件
<form  commandName="customer" action="/customer/login.do" method="post" enctype="multipart/form-data">
    <input type="file" name="images[0]"/>
    <input id="submit" type="submit" value="上传文件"/>
</form>
</body>
</html>
