<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<link rel="stylesheet" type="text/css" href="/static/css/style.css" />
<link rel="stylesheet" type="text/css" href="/static/css/shopping-mall-index.css" />
<script type="text/javascript" src="/static/js/jquery.js"></script>
<script type="text/javascript" src="/static/js/zhonglin.js"></script>
</head>
<script type="text/javascript">
    function register(){
        var username = $("input[name=username]").val();
        var password = $("input[name=password]").val();
        var passwordTow = $("input[name=passwordTow]").val();
        if (password != passwordTow){
            alert("两次密码输入不一致");
            return false;
        }
        var phone = $("input[name=phone]").val();
        var email = $("input[name=email]").val();
        if (username == null || username.leng==0){
            alert("输入内容有误，请检查");
            return false;
        }


        $("#register").submit();
        alert("注册成功")
    }
</script>
<body>


<div class="top">
    <div class="top-con w1200">
        <p class="t-con-l f-l">您好，欢迎来到宅客微购</p>
        <ul class="t-con-r f-r">
            <li><a href="#">我 (个人中心)</a></li>
            <li><a href="#">我的购物车</a></li>
            <li><a href="#">我的订单</a></li>

            <div style="clear:both;"></div>
        </ul>
        <div style="clear:both;"></div>
    </div>
</div>
    
    <!--内容开始-->
    <div class="password-con registered">
        <form action="/user/addUser" id="register" method="post">
    	<div class="psw">
        	<p class="psw-p1">用户名</p>
            <input type="text" placeholder="请填写用户名" name="username" />
           <%-- <span class="dui"></span>--%>
        </div>
    	<div class="psw">
        	<p class="psw-p1">输入密码</p>
            <input type="text" placeholder="请输入密码" name="password" />

        </div>
    	<div class="psw">
        	<p class="psw-p1">确认密码</p>
            <input type="text" placeholder="请再次确认密码" name="passwordTow"/>

        </div>
    	<div class="psw psw2">
        	<p class="psw-p1">手机号</p>
            <input type="text" placeholder="请输入手机号" name="phone"/>
        </div>
    	<div class="psw psw3">
        	<p class="psw-p1">邮箱</p>
            <input type="text" placeholder="请输入邮箱" name="eamil" />
        </div>


        <button class="psw-btn" onclick="register()">立即注册</button>
        </form>
    </div>

    <!--底部服务-->
    <div class="ft-service">
    	<div class="w1200">
        	<div class="sv-con-l2 f-l">
            	<dl>
                	<dt><a href="#">新手上路</a></dt>
                    <dd>
                    	<a href="#">购物流程</a>
                    	<a href="#">在线支付</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">配送方式</a></dt>
                    <dd>
                    	<a href="#">货到付款区域</a>
                    	<a href="#">配送费标准</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">购物指南</a></dt>
                    <dd>
                    	<a href="#">常见问题</a>
                    	<a href="#">订购流程</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">售后服务</a></dt>
                    <dd>
                    	<a href="#">售后服务保障</a>
                    	<a href="#">退款说明</a>
                    	<a href="#">新手选购商品总则</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">关于我们</a></dt>
                    <dd>
                    	<a href="#">投诉与建议</a>
                    </dd>
                </dl>
                <div style="clear:both;"></div>
            </div>
        	<div class="sv-con-r2 f-r">
            	<p class="sv-r-tle">187-8660-5539</p>
            	<p>周一至周五9:00-17:30</p>
            	<p>（仅收市话费）</p>
            	<a href="#" class="zxkf">24小时在线客服</a>
            </div>
            <div style="clear:both;"></div>
        </div>
    </div>
    
    <!--底部 版权-->
    <div class="footer w1200">
    	<p>
        	<a href="#">关于我们</a><span>|</span>
        	<a href="#">友情链接</a><span>|</span>
        	<a href="#">宅客微购社区</a><span>|</span>
        	<a href="#">诚征英才</a><span>|</span>
        	<a href="#">商家登录</a><span>|</span>
        	<a href="#">供应商登录</a><span>|</span>
        	<a href="#">热门搜索</a><span>|</span>
        	<a href="#">宅客微购新品</a><span>|</span>
        	<a href="#">开放平台</a>
        </p>
        <p>
        	沪ICP备13044278号<span>|</span>合字B1.B2-20130004<span>|</span>营业执照<span>|</span>互联网药品信息服务资格证<span>|</span>互联网药品交易服务资格证
        </p>
    </div>
    
</body>
</html>
