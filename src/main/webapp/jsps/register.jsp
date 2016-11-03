<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-22
  Time: 下午8:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html charset=utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户注册</title>
    <link href="../css/bootstrap.css" rel="stylesheet" />
    <link href="../css/autoComplete.css" rel="stylesheet"/>
    <script src="../js/jquery-3.0.0.min.js" type="text/javascript"></script>
    <script src="../js/register.js" type="text/javascript"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <%--自动完成邮箱--%>
    <script type="text/javascript" src="../js/completer.min.js"></script>
    <script type="text/javascript" src="../js/autoComplete.js"></script>
    <%--welcome动画特效插件--%>
</head>
<body style="text-align: center">
<%--welcome动画效果未实现--%>
<div class="container">
    <br>
    <br>
    <br>
    <div class="row">
        <div class="col-xs-3 col-xs-offset-4" style="border: 1px solid #2c97de">
          <form  name="form" role="form" id="register" method="post" action="/customer/register.do">
              <span style="color: red">${error}</span>
              <span style="color: red">${error2}</span>
              <div class="row">

                  <h2>用户注册</h2>
                  <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                      <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                          <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-user"></span>
                      </div>
                      <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                          <input type="text" placeholder="用户名" id="username" class="form-control" name="username" style="border: 0;width:96%;height: 44px;">
                      </div>

                  </div>
              </div>

              <br>
              <div class="row">
                  <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                      <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                          <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-lock"></span>
                      </div>
                      <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                          <input type="password" placeholder="密码" id="password" name="password" style="border: 0;width:96%;height: 44px;">
                      </div>

                  </div>
              </div>

              <br>
              <div class="row">
                  <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                      <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                          <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-envelope"></span>
                      </div>
                      <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                          <input type="email" placeholder="邮箱" id="auto-complete-email" name="email" required style="border: 0;width:96%;height: 44px;">
                      </div>
                  </div>
              </div>

              <br>
              <div class="row">
                  <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                      <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                          <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-info-sign"></span>
                      </div>
                      <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                          <input type="text" placeholder="编号" id="id" name="id" style="border: 0;width:96%;height: 44px;">
                      </div>
                  </div>
              </div>

              <br>
              <div class="row">
                  <div class="col-xs-10 col-xs-offset-1" style="height: 44px;">
                      <div class="col-xs-2" style="background-color:#adadad;height: 44px;">
                          <span style="font-size: 28px;line-height: 44px;color: white" class="glyphicon glyphicon-phone"></span>
                      </div>
                      <div class="col-xs-10" style="height: 44px;border: 1px solid whitesmoke;">
                          <input type="text" placeholder="电话" id="phone" name="phone" style="border: 0;width:96%;height: 44px;">
                      </div>
                  </div>
              </div>
              <br>

           <%--<h3>邮箱</h3>--%>
           <%--<input type="email" id="auto-complete-email" name="email" required/>--%>
           <%--<h3>编号</h3>--%>
           <%--<input type="text" placeholder="Id" id="id" name="id"/>--%>

        <%--<h3><font style="color: red">(*)</font>权限--%>
            <%--<input type="text" placeholder="0/1" id="authority" name="authority"/></h3>--%>
        <%--<h6 style="color: red">${error2}</h6>--%>

        <%--<button type="submit" id="adduser-button" >提交</button>--%>
              <div class="row">
                  <div class="col-xs-10 col-xs-offset-1">
                      <button type="submit"  class="btn btn-block" id="adduser-button" onclick="return checkform(this.form);"  style="background-color: orangered">
                          注&nbsp;&nbsp;&nbsp;&nbsp;册
                      </button>
                  </div>
              </div>

        </div>



</form>

    </div>
</div>


</body>
</html>
