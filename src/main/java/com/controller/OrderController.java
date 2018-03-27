package com.controller;

import com.entity.*;
import com.service.AddressService;
import com.service.CartService;
import com.service.OrderProductService;
import com.service.OrderService;
import com.util.MallUtil;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private CartService cartService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderProductService orderProductService;
    @RequestMapping("skip")
    public String order(HttpServletRequest request , String  ids){
        List<Cart> cartList = cartService.selectByIdList(ids);
        User user = (User) request.getSession().getAttribute("user");
        Integer uid = user.getId();

        /*生成订单*/

        Double total = 0.0;
        for (Cart cart:cartList) {
            Double amount = cart.getPrice()*cart.getNum();
            cart.setTotal(amount);
            total += amount;
        }
        Integer oid = MallUtil.getRandom();
        Order order = new Order();
        order.setId(oid);
        order.setCreateTime(new Date());
        order.setUid(user.getId());
        order.setTotal(total);
        orderService.saveOrder(order);

        OrderProduct orderProduct = null;
        for (Cart cart:cartList) {
            orderProduct = new OrderProduct();

            orderProduct.setOid(oid);
            orderProduct.setName(cart.getPname());
            orderProduct.setPrice(cart.getPrice());
            orderProduct.setPid(cart.getPid());
            orderProduct.setPimage(cart.getImage());
            orderProduct.setNum(cart.getNum());
            orderProductService.insertSelective(orderProduct);
        }
        request.setAttribute("oid",oid);
        request.setAttribute("order",order);

        /*获取地址*/
        List<Address> addressList = addressService.selectAddressByUid(uid);
        request.setAttribute("cartList",cartList);
        request.setAttribute("addressList",addressList);
        request.setAttribute("ids",ids);
        return "/member/order";
    }


    @RequestMapping("submit")
    public String  save(HttpServletRequest request,Integer oid,Integer aid){
        Order order = orderService.selectByPrimaryKey(oid);
        order.setAid(aid);
        /*修改订单地址*/
        orderService.update(order);
        request.setAttribute("order",order);
      return "/member/pay";
    }

    @RequestMapping("pay")
    public String pay(Order order){
        order.setPayStatus(1);
        Integer i = orderService.update(order);
        return "/member/paySuccess";
    }

    @RequestMapping("del")
    @ResponseBody
    public Integer deleteByPrimaryKey(Integer id){
        Integer integer = orderService.deleteByPrimaryKey(id);
        return integer;
    }

    @RequestMapping("myOrder")
    public String myOrder(Model model,Integer id){
        List<Order> list = orderService.selectAllByUid(id);
        model.addAttribute("list",list);
        model.addAttribute("type",1);//1 全部
        return "/personinfo/myOrder";
    }


}
