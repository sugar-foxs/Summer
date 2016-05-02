<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-4-27
  Time: 下午4:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        文件已上传
<ol>
    <c:forEach items="${customer.images}" var="image">
        <li>
            ${image.originalFilename}
            <img width="500" src="<c:url value="/image/"/>${image.originalFilename}"/>
        </li>
    </c:forEach>
</ol>
</body>
</html>
