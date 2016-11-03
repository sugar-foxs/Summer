<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 16-11-3
  Time: 上午11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车结算</title>
    <link rel="stylesheet" href="../css/carSettle.css"/>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <link rel="stylesheet" href="../css/bootstrap.css"/>
    <script type="text/javascript" src="../js/carSettle.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
    <table id="cartTable">
        <thead>
        <tr>
            <th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
            <th>商品</th>
            <th>单价</th>
            <th>数量</th>
            <th>小计</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
            <td class="goods"><img src="../img/huawei_p9.jpg" alt=""/><span>huawei_p9/华为 EX-TR350</span></td>
            <td class="price">3669</td>
            <td class="count"><span class="reduce">-</span><input  class="count-input" type="text" value="1"/><span class="add">+</span></td>
            <td class="subtotal">3669</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>
        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
            <td class="goods"><img src="../img/Galaxy_s7.jpg" alt=""/><span>Galaxy_s7/三星 PowerShot SX50 HS</span></td>
            <td class="price">3559.99</td>
            <td class="count"><span class="reduce">-</span><input class="count-input" type="text" value="1"/><span class="add">+</span></td>
            <td class="subtotal">3559.99</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>
        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
            <td class="goods"><img src="../img/iphone6.jpg" alt=""/><span>iphone6/苹果 DSC-WX300</span></td>
            <td class="price">3559</td>
            <td class="count"><span class="reduce">-</span><input class="count-input" type="text" value="1"/><span class="add">+</span></td>
            <td class="subtotal">3559</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>
        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
            <td class="goods"><img src="../img/iphone_se.jpg" alt=""/><span>iphone_se/苹果 instax mini 25</span></td>
            <td class="price">3445</td>
            <td class="count"><span class="reduce">-</span><input class="count-input" type="text" value="1"/><span class="add">+</span></td>
            <td class="subtotal">3445</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>
        </tbody>
    </table>
    <div class="foot" id="foot">
        <label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>
        <a class="fl delete" id="deleteAll" href="javascript:;">删除</a>
        <div class="fr closing">
            结 算
            <a href="#" style="display: none;" class="jz2" id="jz2">结 算</a>
        </div>
        <div class="fr total">合计：￥<span id="priceTotal">0.00</span></div>
        <div class="fr selected" id="selected">已选商品<span id="selectedTotal">0</span>件<span class="arrow up">︽</span><span class="arrow down">︾</span></div>
        <div class="selected-view">
            <div id="selectedViewList" class="clearfix">
                <div><img src="../img/huawei_p9.jpg"><span>取消选择</span></div>
            </div>
            <span class="arrow">◆<span>◆</span></span>
        </div>
    </div>
    </div>
</div>
</body>
</html>
