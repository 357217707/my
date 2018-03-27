package com.controller;

import com.entity.Product;
import com.entity.User;
import com.service.ProductService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller

public class IndexController {
    @Autowired
    private ProductService productService;

    @RequestMapping("index")
    public String index(Model model, Integer page){
        if (page == null ){
            page = 1;
        }
        List<Product> list = productService.selectALL(page);
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request,String username,String password){
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        User principal = (User) subject.getPrincipal();


        HttpServletRequest request1 = (HttpServletRequest)request;

        // 如果已经登录，则跳转到管理首页
        if(principal != null ){

            return "redirect:index" ;
        }
        return "login";
    }


}
