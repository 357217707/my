package com.service;

import com.dao.OrderProductMapper;
import com.entity.OrderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProductService {
    @Autowired
    private OrderService orderService;
    @Autowired
	private OrderProductMapper orderProductMapper;
	
	public Integer insertSelective(OrderProduct orderProduct){
		Integer i = orderProductMapper.insertSelective(orderProduct);
		return i;
	}

	public Integer update(OrderProduct orderProduct){
		int i = orderProductMapper.updateByPrimaryKeySelective(orderProduct);
		return i;
	}
}
