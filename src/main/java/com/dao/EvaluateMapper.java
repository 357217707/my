package com.dao;

import com.entity.Evaluate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);

    Integer selectCountByPid(Integer pid);

    List<Evaluate> all(@Param("pid") Integer pid, @Param("starIndex") Integer statIndex, @Param("pageSize") Integer pageSize);
}