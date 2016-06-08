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
</head>
<body style="text-align: center">
<div class="container">
    <div class="row">
        <div class="col-xs-4 col-xs-offset-4" style="border: 1px solid red">
            <div class="row">
                <div class="col-xs-10 col-xs-offset-1">
                    <h2>账户登陆</h2><br>
                    <form class="form" name="myform" id="login" method="post" action="login.do">
                        <div class="row" >
                            <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                                <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                                        <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-user"></span>
                                </div>
                                <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                                    <input type="text" placeholder="用户名" id="username" name="username" style="border: 0;width:96%;height: 44px;">
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
                                    <input type="password" id="password" name="password" style="border: 0;width:96%;height: 44px;">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-xs-10 col-xs-offset-1">
                                <button type="submit" id="login-button" class="btn btn-block" style="background-color: orangered" onclick="return checkform(this.form);">
                                    登&nbsp;&nbsp;&nbsp;&nbsp;录
                                </button>
                            </div>
                        </div>
                        <br>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
