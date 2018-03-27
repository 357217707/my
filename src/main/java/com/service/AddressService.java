package com.service;

import com.dao.AddressMapper;
import com.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressMapper addressMapper;

    public List<Address> selectAddressByUid(Integer uid){
        List<Address> list = addressMapper.selectAddressByUid(uid);
        return list;
    }

    /*新增地址*/
    public Integer insertSelective(Address address){
        address.setCreateTime(new Date());
        int i = addressMapper.insertSelective(address);
        return i;
    }

    /*修改地址*/
    public Integer updateByPrimaryKeySelective(Address address){
        int i = addressMapper.updateByPrimaryKeySelective( address);
        return i;
    }
}
