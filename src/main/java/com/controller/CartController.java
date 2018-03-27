package com.controller;

import com.entity.Cart;
import com.entity.Product;
import com.entity.User;
import com.service.CartService;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RequestMapping("cart")
@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;



    @ResponseBody
    @RequestMapping("insert")
    public Integer insertSelective(Cart cart){

        Product product = productService.selectByPrimaryKey(cart.getPid());
        cart.setPname(product.getName());
        cart.setTime(new Date());
        cart.setPrice(product.getPrice());
        cart.setImage(product.getImage());
        Integer i = 0;
        Integer count = cartService.countCartNumByUidPid(cart.getUid(),cart.getPid());
        Integer num = count + 1;
        cart.setNum(count+1);
        if (count > 0){
            //修改
            i = cartService.updateByUidPidSelective(cart);
        }else {
            //插入
            i = cartService.insertSelective(cart);
        }
        return i;
    }


    @RequestMapping("all/{uid}/{page}")
    public String cart(Model model, @PathVariable("uid") Integer uid,@PathVariable("page")Integer page){
        if (page == null){
            page = 1;
        }
        List<Cart> list = cartService.selectByUid(uid,page);
        model.addAttribute("cartList",list);
        return "/member/cart";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Integer deleteByPrimaryKey( Integer id){
        Integer i = cartService.deleteByPrimaryKey(id);
        return  i;
    }



    @ResponseBody
    @RequestMapping("update")
    public Integer updateCart(HttpServletRequest request ,Cart cart){

        Integer i = cartService.updateByUidPidSelective(cart);
        return i;
    }
    /*

    @RequestMapping("num")
    @ResponseBody
    public Integer cartNum(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        Integer uid = user.getId();
        Integer num = cartService.cartNum(uid);
        return num;
    }






*/
}
