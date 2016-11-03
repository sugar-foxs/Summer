<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-11-3
  Time: 下午10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/test.css"/>
    <link rel="stylesheet" href="../css/bootstrap.css"/>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script type="text/javascript" src="../js/test.js"></script>
</head>

<body class="login_body">
<div class="login_div">
    <div class="col-xs-12 login_title">登录</div>
    <form action="" class="login" method="post">
        <div class="nav">
            <div class="nav login_nav">
                <div class="col-xs-4 login_username">
                    用户名:
                </div>
                <div class="col-xs-6 login_usernameInput">
                    <input type="text" name="" id="name" value="" placeholder="&nbsp;&nbsp;用户名/手机号"  onblur="javascript:ok_or_errorBylogin(this)" />
                </div>
                <div class="col-xs-1 ok_gou">
                    √
                </div>
                <div class="col-xs-1 error_cuo">
                    ×
                </div>
            </div>
            <div class="nav login_psdNav">
                <div class="col-xs-4">
                    密&nbsp;&nbsp;&nbsp;码:
                </div>
                <div class="col-xs-6">
                    <input type="password" name="" id="psd" value="" placeholder="&nbsp;&nbsp;密码" onBlur="javascript:ok_or_errorBylogin(this)" />
                </div>
                <div class="col-xs-1 ok_gou">
                    √
                </div>
                <div class="col-xs-1 error_cuo">
                    ×
                </div>
            </div>
            <div class="col-xs-12 login_btn_div">
                <input type="submit" class="sub_btn" value="登录" id="login" />
            </div>
        </div>
    </form>
    <br><br><br><br>
    <div class="col-xs-12 barter_btnDiv">
        <button class="barter_btn" onClick="javascript:barter_btn(this)">没有账号?前往注册</button>
    </div>
</div>
<div class="register_body">
    <div class="col-xs-12 register_title">注册</div>
    <form action="" class="register" method="post">
        <div class="nav">
            <div class="nav register_nav">
                <div class="col-xs-4">
                    用户名:
                </div>
                <div class="col-xs-6">
                    <input type="text" name="" id="name_r" value="" placeholder="&nbsp;&nbsp;用户名/手机号" onBlur="javascript:ok_or_errorByRegister(this)" />
                </div>
                <div class="col-xs-1 ok_gou">
                    √
                </div>
                <div class="col-xs-1 error_cuo">
                    ×
                </div>
            </div>
            <div class="nav register_psdnav">
                <div class="col-xs-4">
                    密&nbsp;&nbsp;&nbsp;码:
                </div>
                <div class="col-xs-6">
                    <input type="password" name="" id="psd_r" value="" placeholder="&nbsp;&nbsp;密码" onBlur="javascript:ok_or_errorByRegister(this)" />
                </div>
                <div class="col-xs-1 ok_gou">
                    √
                </div>
                <div class="col-xs-1 error_cuo">
                    ×
                </div>
            </div>
            <div class="nav register_affirm">
                <div class="col-xs-4">
                    确认密码:
                </div>
                <div class="col-xs-6">
                    <input type="password" name="" id="affirm_psd" value="" placeholder="&nbsp;&nbsp;确认密码" onBlur="javascript:ok_or_errorByRegister(this)" />
                </div>
                <div class="col-xs-1 ok_gou">
                    √
                </div>
                <div class="col-xs-1 error_cuo">
                    ×
                </div>
            </div>
            <div class="col-xs-12 register_btn_div">
                <input type="submit" class="sub_btn" value="注册" id="register" />
            </div>
        </div>
    </form>
    <br><br><br><br>
    <div class="col-xs-12 barter_register">
        <button class="barter_registerBtn" onClick="javascript:barter_btn(this)" style="">已有秘籍?返回登录</button>
    </div>
</div>
</body>
</html>
