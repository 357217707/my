<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>我的订单</title>
    <link rel="stylesheet" type="text/css" href="/static/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/static/css/shopping-mall-index.css" />
    <script type="text/javascript" src="/static/js/jquery.js"></script>
    <script type="text/javascript" src="/static/js/zhonglin.js"></script>
    <link rel="stylesheet" href="/static/css/tip-skyblue.css" type="text/css" />

    <style>
        .alert {
            display: none;
            position: fixed;
            top: 50%;
            left: 50%;
            min-width: 200px;
            margin-left: -100px;
            z-index: 99999;
            padding: 15px;
            border: 1px solid transparent;
            border-radius: 4px;
            background-color: #1ccbd2;
        }



        .alert-warning {
            color: #8a6d3b;
            background-color: #fcf8e3;
            border-color: #faebcc;
        }
    </style>
    <script type="text/javascript">
        function addCart(image,id) {


            $.post("/cart/insert",{uid:${user.id},bid:${business.id},pid:id},function (result) {


                if (result>0  ){
                    $('.alert').html('加入购物车成功').addClass('.alert-warning').show().delay(1500).fadeOut();
                }else {
                    $('.alert').html('加入').addClass('.alert-warning').show().delay(1500).fadeOut();
                }
            })


        }

        $(function () {
            $("p[name=pingjia]").each(function () {
                var id = $(this).attr("sign");
                var p = $(this);

                $.post("/evaluate/count",{id:id},function (count) {

                    if (count>0){
                        p.text(count+"条评价");
                    }
                })
            })
        })

        function register() {
            window.location.href="/register";
        }

        function  pay(oid) {
            location.href="/order/pay?oid=${oid}"
        }
    </script>
</head>

<body style="position:relative;">
<div class="alert"></div>
<!--top 开始-->
<div class="top">
    <div class="top-con w1200">
        <p class="t-con-l f-l">您好，欢迎来到宅客微购</p>
        <ul class="t-con-r f-r">
            <li><a href="#">我 (个人中心)</a></li>
            <li><a href="/cart/all/${user.id}/1">我的购物车</a></li>
            <li><a href="/myorder">我的订单</a></li>
            <li class="erweima">
                <a href="#">扫描二维码</a>
                <div class="ewm-tu">
                    <a href="#"><img src="/static/images/erweima-tu.jpg" /></a>
                </div>
            </li>
            <div style="clear:both;"></div>
        </ul>
        <div style="clear:both;"></div>
    </div>
</div>

<!--logo search 开始-->
<div class="hd-info1 w1200">
    <div class="logo f-l">
        <h1><a href="#" title=""><img src="/static/images/logo.jpg" /></a></h1>
    </div>
    <div class="search f-r">
        <ul class="sp">
            <li class="current" ss-search="sp"><a href="JavaScript:;">商品</a></li>
            <li ss-search="dp"><a href="JavaScript:;">店铺</a></li>
            <div style="clear:both;"></div>
        </ul>
        <div class="srh">
            <div class="ipt f-l">
                <input type="text" placeholder="搜索商品..." ss-search-show="sp" />
                <input type="text" placeholder="搜索店铺..." ss-search-show="dp" style="display:none;" />
            </div>
            <button class="f-r">搜 索</button>
            <div style="clear:both;"></div>
        </div>
        <ul class="sp2">
            <li><a href="#">绿豆</a></li>
            <li><a href="#">大米</a></li>
            <li><a href="#">驱蚊</a></li>
            <li><a href="#">洗面奶</a></li>
            <li><a href="#">格力空调</a></li>
            <li><a href="#">洗发护发</a></li>
            <li><a href="#">葡萄 </a></li>
            <li><a href="#">脉动</a></li>
            <li><a href="#">海鲜水产</a></li>
            <div style="clear:both;"></div>
        </ul>
    </div>
    <div style="clear:both;"></div>
</div>
