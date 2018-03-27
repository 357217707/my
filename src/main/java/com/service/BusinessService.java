package com.service;

import com.dao.BusinessMapper;
import com.dao.EvaluateMapper;
import com.entity.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

@Service
public class BusinessService {
    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private EvaluateMapper evaluateMapper;




    public Business getByprimaryKey(Integer id){
        Business business = businessMapper.selectByPrimaryKey(id);
        return  business;
    }


    /*public List<Business> searche( String key, String city){
        key = "%" + key + "%";
        List<Business> list = businessMapper.searchByKyeWord(key,city);
        return  list;
    }*/



}
