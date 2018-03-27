package com.controller;

import com.entity.Evaluate;
import com.entity.User;
import com.service.EvaluateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/evaluate")
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;
    /**
     * 获取某商家后5条评论，按时间倒序
     */


  /*  *//**
     * 查询当日是否已经评论过
     *//*
    @RequestMapping("isAbleDis")
    @ResponseBody
    public Integer isAbleDis(HttpServletRequest request, Integer bid){
        User user = (User)request.getSession().getAttribute("user");
        Integer uid = user.getId();
        Integer numBean = evaluateService.isAbleDis(uid,bid);

        return numBean;
    }
*/
    /**
     *
     * 保存评论
     */
    @RequestMapping("insert")
    @ResponseBody
    public boolean insert(Evaluate evaluate){
        evaluate.setPid(0);
        evaluate.setTime(new Date());
        Integer i = evaluateService.insert(evaluate);
        if (i != 0){
            return true;
        }
        return false;
    }

    /**
     * 根据ID删除评论
     */
    @RequestMapping("delete")
    @ResponseBody
    public Integer deleteByPrimaryKey(Integer id){
        Integer i = evaluateService.deleteByPrimaryKey(id);
        return i;
    }

    /**
     *
     *统计商家的评论数
     */

    @ResponseBody
    @RequestMapping("count")
    public Integer countEva(Integer id){
        Integer i = evaluateService.selectCountByPid(id);
        return i;
    }

   /* *//***
     * 获取当前用户的用户等级
     *//*
    @RequestMapping("rank")
    public String rank(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        Integer score = evaluateService.getUserScore(user.getId());
        String rank = RankUtil.getRank(score);
        return rank;
    }*/
}
