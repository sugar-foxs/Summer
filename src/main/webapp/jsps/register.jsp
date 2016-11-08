<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-6-8
  Time: 下午3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>login</title>
    <link href="../css/bootstrap.css" rel="stylesheet" />
    <script src="../js/jquery-1.9.1.js" type="text/javascript"></script>
    <script src="../js/bootstrap.js"></script>
    <script src="../js/jquery.validate.min.js"></script>
</head>
<body style="text-align: center">
<div class="container">
    <div class="row">
        <div class="col-xs-3 col-xs-offset-4" style="border: 1px solid red">
            <h2>账户注册</h2><br>
            <form class="loginForm" name="loginForm" id="login" method="post" action="/register.do">
                <span style="color: red">${error}</span>
                <div class="row">
                    <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                        <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                            <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-user"></span>
                        </div>
                        <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                            <input type="text" placeholder="用户名" id="customername" name="customerName" style="border: 0;width:96%;height: 44px;">
                            <%--<span style="color: red;font-size: smaller">字母开头，由字母和数字下划线组成</span>--%>
                        </div>
                    </div>
                </div>
                <br>
                <div class="row" >
                    <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                        <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                            <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-lock"></span>
                        </div>
                        <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                            <input type="password" id="password" placeholder="密码" name="customerPassword" style="border: 0;width:96%;height: 44px;">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row" >
                    <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                        <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                            <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-phone"></span>
                        </div>
                        <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                            <input type="text" placeholder="手机" name="customerPhone" style="border: 0;width:96%;height: 44px;">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row" >
                    <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                        <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                            <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-send"></span>
                        </div>
                        <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                            <input type="text" placeholder="邮箱" name="customerEmail" style="border: 0;width:96%;height: 44px;">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row" >
                    <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                        <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                            <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-home"></span>
                        </div>
                        <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                            <input type="text" placeholder="地址" name="customerAddress" style="border: 0;width:96%;height: 44px;">
                        </div>
                    </div>
                </div>
                <br>
                <a href="/gologin.do">已有账号登陆</a><br>
                <div class="row">
                    <div class="col-xs-10 col-xs-offset-1">
                        <button type="submit" id="login-button" class="btn btn-block" style="background-color: orangered">
                            注册
                        </button>
                    </div>
                </div>
                <br>
            </form>
        </div>
    </div>
</div>
</body>
</html>
