<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-10-29
  Time: 下午1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>单个商品页面</title>
    <style type="text/css">
        .demo{width:820px; margin:120px auto 10px auto}
        .m-sidebar{position: fixed;top: 0;right: 0;background: #000;z-index: 2000;width: 35px;height: 100%;font-size: 12px;color: #fff;}
        .cart{color: #fff;text-align:center;line-height: 20px;padding: 200px 0 0 0px;}
        .cart span{display:block;width:20px;margin:0 auto;}
        .cart i{width:35px;height:35px;display:block; background:url(../img/car.png) no-repeat;}
        #msg{position:fixed; top:300px; right:35px; z-index:10000; width:1px; height:52px; line-height:52px; font-size:20px; text-align:center; color:#fff; background:#360; display:none}

        .box{float:left; width:498px; height:320px; margin-left:5px; border:1px solid #e0e0e0; }
        .box p{line-height:20px; padding:4px 4px 10px 4px; text-align:left}
        .box:hover{border:1px solid #f90}
        .box h4{line-height:20px; font-size:18px; color:#f30;font-weight:500}
        .box h4 span{font-size:20px}
        .u-flyer{display: block;width: 50px;height: 50px;border-radius: 50px;position: fixed;z-index: 9999;}

        .button {
            display: inline-block;
            outline: none;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
            font: 16px/100% 'Microsoft yahei',Arial, Helvetica, sans-serif;
            padding: .5em 2em .55em;
            text-shadow: 0 1px 1px rgba(0,0,0,.3);
            -webkit-border-radius: .5em;
            -moz-border-radius: .5em;
            border-radius: .5em;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.2);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.2);
            box-shadow: 0 1px 2px rgba(0,0,0,.2);
        }
        .button:hover {
            text-decoration: none;
        }
        .button:active {
            position: relative;
            top: 1px;
        }
        /* orange */
        .orange {
            color: #fef4e9;
            border: solid 1px #da7c0c;
            background: #f78d1d;
            background: -webkit-gradient(linear, left top, left bottom, from(#faa51a), to(#f47a20));
            background: -moz-linear-gradient(top,  #faa51a,  #f47a20);
            filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#faa51a', endColorstr='#f47a20');
        }
        .orange:hover {
            background: #f47c20;
            background: -webkit-gradient(linear, left top, left bottom, from(#f88e11), to(#f06015));
            background: -moz-linear-gradient(top,  #f88e11,  #f06015);
            filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#f88e11', endColorstr='#f06015');
        }
        .orange:active {
            color: #fcd3a5;
            background: -webkit-gradient(linear, left top, left bottom, from(#f47a20), to(#faa51a));
            background: -moz-linear-gradient(top,  #f47a20,  #faa51a);
            filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#f47a20', endColorstr='#faa51a');
        }
    </style>
    <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
    <script src="../js/jquery.fly.min.js"></script>
    <%--<script src="../js/DisplayBook.js"></script>--%>

    <!-- [if lte IE 9]> -->
    <%--<script src="requestAnimationFrame.js"></script>--%>
    <!-- <![endif] -->
    <script>
        $(function() {
            var offset = $("#end").offset();
            $(".addcar").click(function(event){
                var addcar = $(this);
                var img = addcar.parent().parent().find('img').attr('src');
                var flyer = $('<img class="u-flyer" src="'+img+'">');
                flyer.fly({
                    start: {
                        left: event.pageX,
                        top: event.pageY-30
                    },
                    end: {
                        left: offset.left+10,
                        top: offset.top+10,
                        width: 0,
                        height: 0
                    },
                    onEnd: function(){
                        $("#msg").show().animate({width: '250px'}, 200).fadeOut(1000);
                        //addcar.css("cursor","default").removeClass('orange').unbind('click');
                        this.destory();
                    }
                });

                ajax();

            });
            function ajax(){
                $.ajax({
                    url: '/shopCart/addBook.do',
                    type: "POST",
                    data:{
                        bookId: document.getElementById("bookid").innerHTML,
                        num: document.getElementById("num").value
                    },
//                    dataType:"json",
                    timeout: 1000
                })

            }
        });



        function addnum() {
            document.getElementById("num").value++;
        }

        function subnum() {
            document.getElementById("num").value--;
            if(document.getElementById("num").value<1){
                document.getElementById("num").value=1;
            }
        }

    </script>
</head>
<body>
<div id="main">
    <div class="demo">
        <div class="box">
            <div style="float: left;margin-left:5px;margin-top: 5px;">
                <img src="../img/${book.cover}"  width="200"/>
            </div>
            <div style="float: left;margin-left: 10px;margin-top: 5px;">
                <h4 id="bookid" style="display: none">${book.bookId}</h4>
                <h4>${book.bookName}</h4>
                <p>${book.description}</p>
                <p>
                    作者：<a href="#" style="color: #5bc0de;text-decoration: none">${book.author}</a>
                    出版时间：${book.year}
                </p>
                <p>￥${book.price}</p>
                <input id="num" value="1" style="width:40px" />
                <button onclick="addnum()">+</button>
                <button onclick="subnum()">-</button>
                <br/><button class="button orange addcar">加入购物车</button>
                <a href="#" class="button orange">立即购买</a>
            </div>
        </div>
    </div>


    <div class="m-sidebar">
        <div class="cart">
            <i id="end"></i>
            <a href="/shopCart/tocar.do"><span>购物车</span></a><br/><br/><br/><br/>
            <span>返回顶部</span>
        </div>
    </div>
    <div id="msg">已成功加入购物车！</div>
</div>


</body>
</html>
