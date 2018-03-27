package com.service;

import com.dao.CartMapper;
import com.entity.Cart;
import com.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartMapper cartMapper;


    public Integer countCartNumByUidPid(Integer uid, Integer pid) {
        Integer i = cartMapper.countCartNumByUidPid(uid, pid);
        return i;
    }


    public Integer updateByUidPidSelective(Cart cart) {

        Integer i = cartMapper.updateByUidPidSelective(cart);
        if (i == null) {
            i = 0;
        }
        return i;
    }


    public int insertSelective(Cart cart) {
        int i = cartMapper.insertSelective(cart);
        return i;
    }

    public List<Cart> selectByUid(Integer uid, Integer page) {

        Integer startIndex = (page - 1) * PageUtil.CART_PAGE_SIZE;

        List<Cart> list = cartMapper.selectByUid(uid, startIndex, PageUtil.CART_PAGE_SIZE);

        return list;
    }

    public Integer deleteByPrimaryKey(Integer id) {
        Integer i = cartMapper.deleteByPrimaryKey(id);
        return i;
    }


    public Integer updateByPrimaryKey(Cart cart) {
        Integer i = cartMapper.updateByPrimaryKey(cart);
        return i;
    }

    public List<Cart> selectByIdList(String ids ){
        String[] id = ids.split(",");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < id.length; i++) {
            list.add(Integer.valueOf(id[i]));
        }
        List<Cart> list1 = cartMapper.selectByIdList(list);
        return list1;
    }

   /*

    public int cartNum(Integer uid){
        int num = cartMapper.cartNum(uid);
        return num;
    }








    }*/

}
