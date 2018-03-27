<%@ include file="/WEB-INF/jsp/include/head.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" %>

    <script type="text/javascript">
        function pay() {
            $(".pay-dz li").each(function () {

                if ($(this).hasClass("current")){
                   var aid = $(this).attr("name");

                    $("#pay").append('<input type="hidden" name="aid" value="'+aid+'"/>\n' +
                        '               <input type="hidden" name="oid" value="${oid}"/>');
                    $("#pay").submit();
                }else {
                    $('.alert').html('请选择地址').addClass('.alert-warning').show().delay(1500).fadeOut();
                }
            })
        }
    </script>
    <form method="post" id="pay"   action="/order/submit" >

    </form>

    <!--内容开始-->
    <div class="payment-interface w1200">
    	<div class="pay-info">
        	<div class="info-tit">
            	<h3>选择收货地址</h3>
            </div>
            <ul class="pay-dz">
            	<c:forEach items="${addressList}" var="address" varStatus="status">
                    <li name="${address.id}">

                        <h3>（<span class="sp3">${address.name}</span> 收）</h3>
                        <p><span class="sp1">${address.detail}</span><br/><span class="sp2">${address.phone}</span></p>
                        <a href="JavaScript:;" xiugai="" >修改</a>
                    </li>
                </c:forEach>
                <div style="clear:both;"></div>
            </ul>
            <P class="pay-xgdz">修改地址和使用新地址样式一样。</P>
            <button class="pay-xdz-btn" onclick="">使用新地址</button>
        </div>
        <div class="pay-info">
        	<div class="info-tit" style="border-bottom:0;">
            	<h3>订单信息</h3>
            </div>
        </div>

        <div class="cart-con-tit">

            <p class="p2" style="width: 470px">商品信息</p>
            <p class="p4">数量</p>
            <p class="p5">单价（元）</p>
            <p class="p6">金额（元）</p>

        </div>

            <div class="cart-con-info">
                <c:forEach items="${cartList}" var="cart">
                <div class="info-mid">

                    <div class="mid-tu f-l">
                        <a href="#"><img src="${cart.image}" style="width: 150px;"/></a>
                    </div>
                    <div class="mid-font f-l">
                        <a href="#" style="width: 80px">${cart.pname}</a>
                        <span>满赠</span>
                    </div>
                    <div class="mid-guige f-l" style="    width: 67px; height: 71px;padding: 5px 15px; margin-right: 60px;border: 1px solid #ffffff;position: relative;" >

                    </div>
                    <div class="mid-sl f-l" name="test">

                        <input type="text" value="${cart.num}" sign="${cart.id}" size="5px" />

                    </div>
                    <p class="mid-dj f-l" style="margin-left: 37px;" name="price_${cart.id}">¥ <i>${cart.price}</i></p>
                    <p class="mid-je f-l" name="priceAll_${cart.id}">¥ ${cart.total}<i></i></p>

                    <div style="clear:both;"></div>
                </div>
                </c:forEach>
                <div class="info-heji">

                    <h3 class="f-r">订单号：2015122332124565</h3>
                </div>
                <div class="info-tijiao">
                    <p class="p1">实付款：<span>${order.total}</span></p>
                    <button class="btn" onclick="pay()">提交订单</button>
                </div>
            </div>





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

    <!--确认订单（新增地址）-->
    <div class="confirmation-tanchuang" xgdz1="">

    	<div class="tanchuang-bg"></div>
        <form id="addAddress" action="/address/addAddress" method="post">
        <input name="uid" type="hidden" value="${user.id}"/>
    	<div class="tanchuang-con">
        	<div class="tc-title">
            	<h3>新增地址</h3>
                <a href="JavaScript:;" dz-guan=""><img src="/static/images/close-select-city.gif" /></a>
                <div style="clear:both;"></div>
            </div>
            <ul class="tc-con2">
            	<li class="tc-li1">
                	<p class="l-p">详细地址<span>*</span></p>
                    <textarea name="detail" class="textarea1" placeholder="请如实填写您的详细信息，省市区街道名称、门牌号、楼层号和房间号。"></textarea>
                    <div style="clear:both;"></div>
                </li>

            	<li class="tc-li1">
                	<p class="l-p" >收货人姓名<span>*</span></p>
                    <input type="text" name="name" />
                    <div style="clear:both;"></div>
                </li>
            	<li class="tc-li1">
                	<p class="l-p">联系电话<span>*</span></p>
                    <input type="text"  name="phone" />
                    <div style="clear:both;"></div>
                </li>
            </ul>
            <button class="btn-pst2" >保存</button>

        </div>
        </form>
    </div>


    <%--
     var obj = $("ul.pay-dz");
            var element = $("ul.pay-dz li:eq("+index+")");
            $(element).html("<h3>（<span class=\"sp3\">23213</span> 收）</h3>\n" +
                "            <p><span class=\"sp1\">13232</span><span class=\"sp2\">213213</span></p>\n" +
                "            <a href=\"JavaScript:;\" xiugai=\"\" onclick=\"xiugai()\">修改</a>");

    --%>

    <script type="text/javascript">
        function updateAddress(){

           $.post("/address/updateAddress", $("#updateAddress").serialize(),function(result){
                if (result > 0){
                   location.href="/order/skip?ids=${ids}";
                }
           })
        }

        function addAddress(){
            $.post("/address/addAddress", $("#addAddress").serialize(),function(result){
                if(result >0){
                    location.href="/order/skip?ids=${ids}";
                }
            })
        }
    </script>
    <!--修改地址-->
    <div class="confirmation-tanchuang" xgdz2="">
        <div class="tanchuang-bg"></div>
        <form id="updateAddress" action="/address/updateAddress" type="post">
            <input name="uid" type="hidden" value="${user.id}"/>
            <div class="tanchuang-con">
                <div class="tc-title">
                    <h3>新增地址</h3>
                    <a href="JavaScript:;" dz-guan=""><img src="/static/images/close-select-city.gif" /></a>
                    <div style="clear:both;"></div>
                </div>
                <ul class="tc-con2">
                    <li class="tc-li1">
                        <p class="l-p" >详细地址<span>*</span></p>
                        <textarea name="detail" class="textarea1" placeholder="请如实填写您的详细信息，省市区街道名称、门牌号、楼层号和房间号。"></textarea>
                        <div style="clear:both;"></div>
                    </li>

                    <li class="tc-li1">
                        <p class="l-p"  >收货人姓名<span>*</span></p>
                        <input type="text" class="shxm"  name="name" />
                        <div style="clear:both;"></div>
                    </li>
                    <li class="tc-li1">
                        <p class="l-p" >联系电话<span>*</span></p>
                        <input type="text" class="lxdh" name="phone" />
                        <input type="hidden" class="id" name="id" value="">
                        <div style="clear:both;"></div>
                    </li>
                </ul>
                <button class="btn-pst2" onclick="updateAddress()">保存</button>

            </div>
        </form>
    </div>
</body>
</html>
