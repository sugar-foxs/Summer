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
    <script src="../js/jquery-3.0.0.min.js"></script>
    <script src="../js/register.js"></script>
    <script type="text/javascript" src="../js/angular.min.js"></script>
    <script type="text/javascript">
        var app=angular.module('myApp',[]);
        app.controller('validateCtrl',function ($scope) {
            $scope.username ='John Doe';
            $scope.email = 'John.doe@gmail.com';
        });
    </script>
</head>
<body style="text-align: center">

<div style="margin: 0 auto;width: 70%">
    <font style="color: #1a8cff;font-size: 200%">用户注册&nbsp;&nbsp;&nbsp;&nbsp;
    </font><span style="color: red">*</span>必填
</div>
<div style="margin-top: 10px">
    <form class="form" name="form" id="register" ng-app="myApp" ng-controller="validateCtrl"
        novalidate  method="post" action="/customer/register.do">

        <h3><font style="color: red">*</font>姓名
            <input type="text"  id="username" name="username"
                   ng-model="username" required/>
        </h3>
        <span style="color: red" ng-show = "form.username.$dirty&&form.username.$invalid">
            <span ng-show="form.username.$error.required">必须输入用户名。</span>
        </span>
        <h6 style="color: red">${error}</h6>




        <h3><font style="color: red">*</font>密码
            <input type="password" placeholder="Password" id="password" name="password"/></h3>
        <h6 style="color: red">${error2}</h6>
        <h3>&nbsp;&nbsp;           电话
            <input type="text" placeholder="Phone" id="phone" name="phone"/></h3>

        <h3>&nbsp;&nbsp;          地址
            <input type="text" placeholder="Address" id="address" name="address"/></h3>

        <h3>&nbsp;&nbsp;          邮箱
            <input type="email" id="email" name="email" ng-model="email" required/>
        </h3>
            <span style="color: red" ng-show="form.email.$dirty&&form.email.$invalid">
            <span ng-show ="form.email.$error.required">必须输入邮箱</span>
            <span ng-show="form.email.$error.email">非法打邮箱地址</span>
        </span>
        <h3><font style="color: red">*</font>编号
            <input type="text" placeholder="Id" id="id" name="id"/></h3>

        <%--<h3><font style="color: red">(*)</font>权限--%>
            <%--<input type="text" placeholder="0/1" id="authority" name="authority"/></h3>--%>
        <%--<h6 style="color: red">${error2}</h6>--%>

        <button type="submit" id="adduser-button" onclick="return checkform(this.form);">提交</button>
    </form>
</div>




</body>
</html>
