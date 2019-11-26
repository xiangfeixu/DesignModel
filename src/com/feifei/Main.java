package com.feifei;

import com.feifei.singletonpattern.SingletonDemo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //    try {
        //        int a = 5;
        //        if (a > 0) {
        //            System.out.println("a > 0");
        //        } else if (a > 1) {
        //            System.out.println("a > 1");
        //        } else if (a > 2) {
        //            System.out.println("a > 2");
        //        } else {
        //            System.out.println("进入else代码块");
        //        }
        //    } finally {
        //        System.out.println("a = 5");
        //    }
        //System.out.println(SingletonDemo4.getInstance().toString());
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        //SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //try {
        //    Date date = dateFormat.parse("20190621042329");
        //    System.out.println("date = " + date);
        //    System.out.println(dateFormat.format(date));
        //    System.out.println(dateFormat2.format(date));
        //} catch (ParseException e) {
        //    e.printStackTrace();
        //}
        String date = "20151101095440";
        String reg = "(\\d{4})(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})";
        date = date.replaceAll(reg, "$1-$2-$3 $4:$5:$6");
    }
}
