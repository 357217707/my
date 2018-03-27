package com.service;

import com.dao.UserMapper;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:chwenwei
 * @Description
 * @Date: Creeated in 11:50 2018/2/7
 */
@Service
public class UsersService {
    @Autowired
    private UserMapper userMapper;

    /*注册用户*/
    public int insertSelective(User user){
        int i = userMapper.insertSelective(user);
        return i;
    }

    /* 登陆用户验证*/
    public User getUserByUsername(String username){

        return userMapper.getUserByUsername(username);
    }


    public User selectByPrimaryKey(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    /*修改用户*/
   public int updateByPrimaryKeySelective(User user){
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i;
    }

    /*删除用户*/
    public int deleteByPrimaryKey(Integer id){
        int i = userMapper.deleteByPrimaryKey(id);
        return i;
    }

}
