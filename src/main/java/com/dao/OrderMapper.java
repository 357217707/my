package com.dao;

import com.entity.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Integer getLastInsertId();

    List<Order> selectAllByUid(Integer uid);

    List<Order> selectNoFaHuo();

    List<Order> selectNoShouHuo();

    List<Order> selectNoPingJia();



}