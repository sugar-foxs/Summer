<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-22
  Time: 上午10:38
  To change this templateuse File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功哲学</title>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script type="text/javascript" src="../js/jquery-jtemplates.js"></script>
    <script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
    <link href="../css/bootstrap.css" rel="stylesheet" />
    <script type="text/javascript" src="../js/angular.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $.getJSON("/book/findfather.do?father=1",function (data) {
                $("#result1").setTemplateElement("templateContainer");
                //处理模板
                $("#result1").processTemplate(data);
            })
        })
    </script>

</head>
<body>
    <center><h1>Book List</h1></center>

    <center><textarea id="templateContainer" style="display:none;">
        {#foreach $T as row}
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-3"><a href="../jsps/bookInfo.jsp"> <img src ="../img/{$T.row.cover}" /></a></div><br/><br/>
            <div class="col-md-2">
                书编号：{$T.row.bookId}<br/><br/>
                书名：{$T.row.bookName}<br/><br/>

                描述：{$T.row.description}<br/><br/>
            </div>
            <div class="col-md-43"></div>
        </div>
        {#/for}


        <%----%>
            <%--<table border="1">--%>
                <%--<tr>--%>
                    <%--<th>--%>
                        <%--书编号--%>
                    <%--</th>--%>
                    <%--<th>--%>
                        <%--书名--%>
                    <%--</th>--%>
                    <%--<th>--%>
                        <%--描述--%>
                    <%--</th>--%>
                    <%--<th>--%>
                        <%--封面--%>
                    <%--</th>--%>
                <%--</tr>--%>
                <%--{#foreach $T as row}--%>
                    <%--<tr>--%>
                        <%--<td>--%>
                            <%--{$T.row.bookId}--%>
                        <%--</td>--%>
                        <%--<td>--%>
                            <%--{$T.row.bookName}--%>
                        <%--</td>--%>
                        <%--<td>--%>
                            <%--{$T.row.description}--%>
                        <%--</td>--%>
                        <%--<td>--%>
                          <%--<img src ="../img/{$T.row.cover}" />--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                <%--{#/for}--%>
            <%--</table>--%>
      </textarea>

        <div id="result1"></div>
    </center>
</body>
</html>
