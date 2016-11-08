<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-10-29
  Time: 下午1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" type="text/javascript">
        var t = 2;
        setInterval("refer()",1000);
        function refer(){
            if(t==0){
                window.location="/gologin.do";
            }
            document.getElementById('time').innerHTML=t;
            t--;
        }
    </script>
</head>
<body>
注册成功!
<span id="time">3</span>秒后跳转到登陆界面<br/>
如果不跳转，请点击下面的链接
<a href="/gologin.do">去登陆</a>
</body>

</html>
