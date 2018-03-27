package com.controller;

import com.entity.Business;
import com.entity.Product;
import com.service.BusinessService;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("product")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private BusinessService businessService;
   /* @RequestMapping("delete")
    @ResponseBody
    public Integer delete(Integer id){
        Integer i = productService.deleteByPrimaryKey(id);
        return i;
    }

    @RequestMapping("update")
    @ResponseBody
    public Integer update(Product product){
        Integer i = productService.updateByPrimaryKeySelective(product);
        return i;
    }*/

   @RequestMapping("detail/{id}")
    public String detail(HttpServletRequest request, @PathVariable("id") Integer id){
       Product product = productService.selectByPrimaryKey(id);

       Business business = businessService.getByprimaryKey(product.getBid());
       System.out.println(business.toString());
       request.setAttribute("product",product);
       request.setAttribute("business",business);
       return "/member/detail";
   }
}
