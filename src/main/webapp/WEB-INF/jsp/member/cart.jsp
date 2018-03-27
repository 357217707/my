<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/jsp/include/head.jsp" %>


<script type="text/javascript">
    function deleteCart(obj,id) {
        $.post("/cart/delete",{id:id},function (result) {
            if(result > 0){
                $('.alert').html('删除成功').addClass('.alert-warning').show().delay(1500).fadeOut();
                $(obj).parents(".info-mid").remove();
            }
        })


    }

    //全选
    function selectAll(obj){
        var checked = $(obj).is(':checked');

        if (checked) {
            $("input[name=id]").each(function(){
                $(this).prop('checked', true);
                $(this).attr("checked","checked");
            })
        } else {
            $("input[name=id]").each(function(){
                $(this).prop('checked', false);
                $(this).removeAttr("checked");
            })
        }
    }

    $(function () {
        var ids="";
        $("button[name=pay]").click(function(){
            $("input[name=id]").each(function(){
                var isChecked = $(this).prop('checked');
                if(isChecked){
                    ids += $(this).val()+",";
                    location.href="/order/skip?ids="+ids;
                }

            })
        })
    })
</script>
    
    <!--内容开始-->
    <div class="cart-content w1200">
    	<ul class="cart-tit-nav">
        	<li class="current"><a href="#">全部商品   21</a></li>
            <div style="clear:both;"></div>
        </ul>
        <div class="cart-con-tit">
        	<p class="p1">
            	<input type="checkbox" value="" name="hobby" onchange="selectAll(this)"></input>
				<span >全选</span>
            </p>
            <p class="p2">订单信息</p>
            <p class="p4">数量</p>
            <p class="p5">单价（元）</p>
            <p class="p6">金额（元）</p>
            <p class="p7">操作</p>
        </div>




       <c:forEach items="${cartList}" var="cart">
           <div class="cart-con-info">

               <div class="info-mid">
                   <input type="checkbox" value="${cart.id}" name="id"   class="mid-ipt f-l"/>
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
                       <a href="JavaScript:;" class="sl-left" >-</a>
                       <input type="text" value="${cart.num}" sign="${cart.id}" size="5px" />
                       <a href="JavaScript:;" class="sl-right" >+</a>
                   </div>
                   <p class="mid-dj f-l" name="price_${cart.id}">¥ <i>${cart.price}</i></p>
                   <p class="mid-je f-l" name="priceAll_${cart.id}">¥ <i></i></p>
                   <div class="mid-chaozuo f-l">
                       <a href="javascript:void(0);" onclick="deleteCart(this,'${cart.id}');">删除</a>
                   </div>
                   <div style="clear:both;"></div>
               </div>
           </div>

       </c:forEach>

        <div class="cart-con-footer">
            <input type="checkbox" value="" name="hobby" onchange="selectAll(this)"></input>
            <span>全选</span>
            <a href="#">删除</a>
            <a href="#">加入收藏夹</a>
            <p>（此处始终在屏幕下方）</p>
            <button class="f-l" name="pay">结 账</button>
        </div>




        <!--分页-->
        <div class="paging">
            	<div class="pag-left f-l">
                	<a href="#" class="about left-r f-l"><</a>
                    <ul class="left-m f-l">
                    	<li><a href="#">1</a></li>
                        <li class="current"><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">6</a></li>
                        <li><a href="#">...</a></li>
                        <li><a href="#">100</a></li>
                        <div style="clear:both;"></div>
                    </ul>
                	<a href="#" class="about left-l f-l">></a>
                    <div style="clear:both;"></div>
                </div>
            	<div class="pag-right f-l">
                	<div class="jump-page f-l">
                        到第<input type="text" />页
                    </div>
                    <button class="f-l">确定</button>
                    <div style="clear:both;"></div>
                </div>
                <div style="clear:both;"></div>
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
