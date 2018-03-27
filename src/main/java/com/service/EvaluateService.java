package com.service;

import com.dao.EvaluateMapper;
import com.entity.Business;
import com.entity.Evaluate;

import com.entity.User;
import com.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateService {

    @Autowired
    private EvaluateMapper evaluateMapper;
    @Autowired
    private UsersService usersService;

    /*分页获取商品的评价*/
   public List<Evaluate> all(Integer pid,Integer startIndex) {
        Integer pageSize = PageUtil.PAGE_SIZE;
        List<Evaluate> list = evaluateMapper.all(pid,startIndex,pageSize);
        User user = null;
        for (Evaluate evaluate:list){
            user = usersService.selectByPrimaryKey(evaluate.getUid());
            evaluate.setUser(user);
        }
        return list;
    }


    /*保存评价*/
    public int insert(Evaluate evaluate) {
        int i = evaluateMapper.insert(evaluate);
        return i;
    }




    /*根据ID删除评论*/
    public Integer deleteByPrimaryKey(Integer id){
        Integer i = evaluateMapper.deleteByPrimaryKey(id);
        return i;
    }

    /*查询商家的评论数*/
    public Integer selectCountByPid(Integer pid){
        Integer count = evaluateMapper.selectCountByPid(pid);
        return count;
    }
}
