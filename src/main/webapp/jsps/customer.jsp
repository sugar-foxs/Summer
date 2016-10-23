<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-13
  Time: 下午9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>CustomerInfomation</title>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>

    <script type="text/javascript" src="../js/jquery-jtemplates.js"></script>

    <script type="text/javascript" src="../js/customerEdit.js"></script>

    <script type="text/javascript">
        function butOnclick() {
            $.getJSON("/customer/findall.do",function (data) {
                $("#result2").setTemplateElement("customerContainer");
                //处理模板
                $("#result2").processTemplate(data);
            })
        }
//        var btn1=document.getElementById("btn1");
//        btn1.addEventListener("click",function () {
//            $.getJSON("/customer/findall.do",function (data) {
//                $("#result2").setTemplateElement("customerContainer");
//                //处理模板
//                $("#result2").processTemplate(data);
//            })
//        })

    </script>


</head>
<body>
    <form class="customerMessage" name="customerMessage" id="customerMessage" >
        <input type="button" id="btn1" value="查询所有用户信息" onclick="javascript:butOnclick();"/>
        <textarea id="customerContainer" style="display: none;">
            <table border="1">

                <tr>
                    <th>
                        用户地址
                    </th>
                    <th>
                        用户邮箱
                    </th>
                    <th>
                        用户id
                    </th>
                    <th>
                        用户姓名
                    </th>
                    <th>
                        用户密码
                    </th>
                    <th>
                        用户电话
                    </th>
                    <th>&nbsp;</th>
                </tr>
                 {#foreach $T as row}
                <tr>
                    <td>{$T.row.customerAddress}</td>
                    <td>{$T.row.customerEmail}</td>
                    <td>{$T.row.customerId}</td>
                    <td>{$T.row.customerName}</td>
                    <td>{$T.row.customerPassword}</td>
                    <td>{$T.row.customerPhone}</td>
                    <td><button>删除</button></td>
                </tr>
                {#/for}
            </table>
        </textarea>
        <div id="result2"></div>
    </form>
</body>
</html>
