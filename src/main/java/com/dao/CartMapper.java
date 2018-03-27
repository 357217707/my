package com.dao;

import com.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Integer countCartNumByUidPid(@Param("uid") Integer uid, @Param("pid") Integer pid);

    Integer updateByUidPidSelective(Cart cart);

    List<Cart> selectByUid(@Param("uid") Integer uid, @Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize);

    List<Cart> selectByIdList(List<Integer> list);
}