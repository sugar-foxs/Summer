<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-10-25
  Time: 下午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="../js/angular.min.js"></script>
    <title>Title</title>
</head>
<body style="text-align: center">
我想要买：
<div ng-app="myApp" ng-controller="costCtrl">
    价格：<input type="number" ng-model="price"/><br/>
    数量：<input type="number" ng-model="quantity"/>
    <p>总体={{(quantity*price)|currency}}</p>
</div>
<script type="text/javascript">
    var app = angular.module('myApp',[]);
    app.controller('costCtrl',function ($scope) {
        $scope.quantity=1;
        $scope.price=9.99;
    });
</script>
</body>
</html>
