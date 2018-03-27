package com.controller;

import com.entity.Business;
import com.entity.Product;
import com.entity.User;
import com.service.BusinessService;
import com.service.EvaluateService;
import com.service.ProductService;
import com.service.UsersService;
import com.util.RankUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:chwenwei
 * @Description
 * @Date: Creeated in 15:44 2018/3/2
 */
@RequestMapping("login")
@Controller
public class LoginController {

    @Autowired
    private UsersService userService;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private EvaluateService evaluateService;
    @Autowired
    private ProductService productService;

    @RequestMapping("login")
    public String loginUrl(String username,String password,Model model,HttpServletRequest request){
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        User principal = (User) subject.getPrincipal();


        HttpServletRequest request1 = (HttpServletRequest)request;

        // 如果已经登录，则跳转到管理首页
        if(principal != null ){

            return "redirect:index" ;
        }



        try {
            subject.login(token);
        } catch (IncorrectCredentialsException ice) {
            // 捕获密码错误异常
          model.addAttribute("message","密码不正确");
          return "login";

        } catch (UnknownAccountException uae) {
            // 捕获未知用户名异常
            model.addAttribute("message","用户名不正确");
            return "login";
        } catch (ExcessiveAttemptsException eae) {
            // 捕获错误登录过多的异常
            model.addAttribute("message","错误次数太多");
            return "login";
        }
        User user = userService.getUserByUsername(username);
        subject.getSession().setAttribute("users", user);
        return "forward:index";
    }

    /**
     * 登陆成功  根据身份判断登陆不同的页面
     * @return
     */
    @RequestMapping("index")
    public String success(Model model, Integer page ){

        if (page == null ){
            page = 1;
        }
        List<Product> list = productService.selectALL(page);
        model.addAttribute("list",list);
        return "index";
    }

   /* @RequestMapping("index")
    public String index(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        String city = (String) request.getSession().getAttribute("city");
        String role = user.getRole();
        List<Business> list = businessService.getTop(city);
        model.addAttribute("list",list);
        if ("admin".equals(role)){
            return "consumer/index";
        }
        return "consumer/index";
    }*/

    @RequestMapping("/")
    public String login(){
        return "redirect:success";
    }
    @RequestMapping("city")
    public String city(){
        return "consumer/city";
    }


   /* @RequestMapping("detail")
    public String detail(){
        return "consumer/detail";
    }*/

  /*  @RequestMapping("list")
    public String list(){
        return "consumer/list";
    }*/

/*    @RequestMapping("cart")
    public String cart(){
        return "consumer/cart";
    }*/
}
