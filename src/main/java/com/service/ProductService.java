package com.service;

import com.dao.ProductMapper;
import com.entity.Product;
import com.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> selectALL(Integer page){

        Integer startIndex =(page-1)* PageUtil.PAGE_SIZE;
        List<Product> list = productMapper.selectALL(startIndex,PageUtil.PAGE_SIZE);
        return  list;
    }

    /*商品详情BY*/
    public Product selectByPrimaryKey(Integer id) {
        Product product = productMapper.selectByPrimaryKey(id);
        return product;
    }

    /*根据ID删除商品*/
    public Integer deleteByPrimaryKey(Integer id){
        Integer i = productMapper.deleteByPrimaryKey(id);
        return i;
    }

    /*根据主键选择修改属性*/
    public Integer updateByPrimaryKeySelective(Product product){
        Integer i = productMapper.updateByPrimaryKeySelective(product);
        return i;
    }

    public Integer add(Product product){
        Integer i = productMapper.insertSelective(product);
        return  i;
    }


}
