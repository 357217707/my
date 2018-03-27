<%@ include file="/WEB-INF/jsp/include/head.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<script>
    function  pay(oid) {
        location.href="/order/pay?oid=${oid}"
    }
</script>
    <!--内容开始-->
    <div class="payment-interface w1200">
    	<div class="pay-info">
        	<div class="info-tit">
            	<h3>选择银行</h3>
            </div>
            <ul class="pay-yh">
            	<li>
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li>
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li>
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li style="border-right:0; width:298px;">
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
            	<li>
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li>
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li>
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li style="border-right:0; width:298px;">
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
            	<li style="border-bottom:0;">
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li style="border-bottom:0;">
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li style="border-bottom:0;">
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <li style="border-right:0;border-bottom:0; width:298px;">
                	<input type="checkbox" value="" name="hobby"></input>
                    <img src="/static/images/jiangheng.gif" />
                	<div style="clear:both;"></div>
                </li>
                <div style="clear:both;"></div>
            </ul>
        </div>
    	<div class="pay-info">
        	<div class="info-tit">
            	<h3>输入卡号</h3>
            </div>
            <div class="pay-kahao">
            	<input type="text" placeholder="请输入银行卡号或支付宝账号"/>
                <p>输入正确</p>
            </div>
        </div>
    	<div class="pay-info">
        	<div class="info-tit">
            	<h3>输入密码</h3>
            </div>
            <div class="pay-mima">
            	<p class="mima-p1">你在安全的环境中，请放心使用！</p>
                <div class="mima-ipt">
                	<p>支付宝或银行卡密码：</p>
                    <input type="text" style="border-left:1px solid #E5E5E5;" /><input type="text" /><input type="text" /><input type="text" /><input type="text" /><input type="text" />
                    <span>请输入6位数字支付密码</span>
                </div>
                <button class="mima-btn" onclick="pay(${oid})">立即支付</button>
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
</body>
</html>
