package com.service;

import com.dao.OrderMapper;
import com.entity.Order;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper ordermapper;

    public Integer saveOrder(Order order){
        Date date = order.getCreateTime();
        if (date == null){
            order.setCreateTime(new Date());
        }
        Integer i = ordermapper.insertSelective(order);
        return  i;
    }

    /*获取刚插入的*/
    public Integer getLastInsertId(){
        Integer i = ordermapper.getLastInsertId();
        return i;
    }

    /*修改为已付款*/
    public Integer update(Order order){
        int i = ordermapper.updateByPrimaryKeySelective(order);
        return i;

    }
    /*根据主键获取订单*/
    public Order selectByPrimaryKey(Integer id){
        Order order = ordermapper.selectByPrimaryKey(id);
        return order;
    }

    /*根据主键删除订单*/
    public Integer deleteByPrimaryKey(Integer id){
        Integer i = ordermapper.deleteByPrimaryKey(id);
        return i;
    }

    /*获取用户的所有订单*/
    public List<Order> selectAllByUid(Integer uid){
        List<Order> orders = ordermapper.selectAllByUid(uid);
        return orders;
    }

    /*获取用户的所有未付款订单*/
    public List<Order> selectNoFaHuo(){
        List<Order> orders = ordermapper.selectNoFaHuo();
        return orders;
    }

    /*获取用户的所有未发货订单*/
    public List<Order> selectNoShouHuo(){
        List<Order> orders = ordermapper.selectNoShouHuo();
        return orders;
    }

    /*获取用户的所有未收货订单*/
    public List<Order> selectNoPingJia(){
        List<Order> orders = ordermapper.selectNoPingJia();
        return orders;
    }

    /*修改订单*/
    public Integer updateByPrimaryKeySelective(Order order){
        Integer i = updateByPrimaryKeySelective(order);
        return i;
    }
}
