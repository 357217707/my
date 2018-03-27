package com.controller;

import com.service.BusinessService;
import com.service.EvaluateService;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("business")
@Controller
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @Autowired
    private ProductService productService;
    @Autowired
    private EvaluateService evaluateService;

    /**
     *
     * 获取销量最高的前12名店铺
     *
     */
   /* @RequestMapping("top")
    public String getTopFive(HttpServletRequest request, Model model){
        String city = (String) request.getSession().getAttribute("city");
        List<Business> list = businessService.getTop(city);
        model.addAttribute("list",list);
        return "consumer/index";
    }

    @RequestMapping("detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model){

        *//*获取商家信息*//*
        Business business = businessService.getByprimaryKey(id);

        model.addAttribute("business",business);
        *//*获取商家下的所有产品*//*
        List<Product> productList = productService.selectAllByBid(id);
        model.addAttribute("productList",productList);
        *//*获取商家下的所有评论，并且每个评论对应的用户*//*


        return "consumer/detail";
    }

    *//**
     * 根据关键字搜索商家
     *
     *//*
    @RequestMapping("search")
    public String searche(HttpServletRequest request, String key, Model model){
        if (key == null){
            key = "";
        }
        String city = (String) request.getSession().getAttribute("city");
        List<Business> list = businessService.searche(key,city);
        model.addAttribute("list",list);
        model.addAttribute("key",key);
        return "consumer/list";
    }

*/
}
