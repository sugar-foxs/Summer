<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-22
  Time: 上午10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功哲学</title>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>

    <script type="text/javascript" src="../js/jquery-jtemplates.js"></script>


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
    <h1>Book List</h1>

    <textarea id="templateContainer" style="display:none;">
            <table border="1">
                <tr>
                    <th>
                        书编号
                    </th>
                    <th>
                        书名
                    </th>
                    <th>
                        描述
                    </th>
                    <th>
                        封面
                    </th>
                    <th>
                        删除
                    </th>
                </tr>
                {#foreach $T as row}
                    <tr>
                        <td>
                            {$T.row.bookId}
                        </td>
                        <td>
                            {$T.row.bookName}
                        </td>
                        <td>
                            {$T.row.description}
                        </td>
                        <td>
                          <img src ="../img/{$T.row.cover}" />
                        </td>
                        <td>
                            <a href="#">删除</a>
                        </td>
                    </tr>
                {#/for}
            </table>
      </textarea>

        <div id="result1"></div>
</body>
</html>
