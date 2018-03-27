package com.controller;


import com.entity.User;
import com.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:chwenwei
 * @Description
 * @Date: Creeated in 11:51 2018/2/7
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UsersService userService;


    @RequestMapping("addUser")
    public String addUser(HttpServletRequest request, Model model, User user){
        Integer i = userService.insertSelective(user);
        if(i > 0){
            request.getSession().setAttribute("user",user);
            return "index";
        }
        return "500";
    }

/*    @RequestMapping("getAllUser")
    public String getAllUser(Model model){
        List<User> list = userService.getAllUser();
        model.addAttribute("list",list);
        return "user/index";
    }


    @RequestMapping("delUser")
    @ResponseBody
    public String delUser(String id){
        System.out.println(id);
        int a =   userService.deleteByPrimaryKey(id);
        if (a == 0){
            return "false";
        }else {
            return "success";
        }
    }



    @RequestMapping("editUser")
    public String editUser(){
        return "user/editUser";
    }

    @RequestMapping("add")
    public String add(Users users){
        userService.insertSelective(users);
        return "redirect:/user/getAllUser";
    }

    @RequestMapping("edit")
    public String edit(Users users){
        userService.updateByPrimaryKeySelective(users);
        return "redirect:/user/getAllUser";
    }

    @RequestMapping("password")
    public String password(){
        return "/user/password";
    }

    @RequestMapping("updatePassword")
    public String updatePassword(HttpServletRequest request,Users users){
        Users oldusers =(Users) request.getSession().getAttribute("user");
        userService.updateByPrimaryKeySelective(users);
        String password = users.getPassword();
        oldusers.setPassword(password);
        request.getSession().setAttribute("user",oldusers);
        return "redirect:/user/getAllUser";
    }*/
}

