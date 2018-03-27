package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MallUtil {


    public static Integer getRandom(){
        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("MMmmSS");

        Date date = new Date();

        String str = simpleDateFormat.format(date);

        Random random = new Random();

        int rannum =(int)((Math.random()*9+1)*10);// 获取4位随机数

        String number =  rannum + str;// 当前时间

        rannum = Integer.valueOf(number);

        return rannum;

    }

    public static void main(String[] args) {
        System.out.println(getRandom());
    }
}
