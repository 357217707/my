package com.controller;

import com.entity.Address;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @RequestMapping("addAddress")
    public String addAddress(HttpServletRequest request, Address address){
        addressService.insertSelective(address);

       return  "forward:/order/skip";
    }

    @RequestMapping("updateAddress")
    @ResponseBody
    public Integer updateAddress(Address address){
        Integer i = addressService.updateByPrimaryKeySelective(address);
        return i;
    }
}
