package com.payne.dataFormate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by peng.dengp on 2017/7/20.
 */
public class DateFormate {
    public static void main(String[] args){
        String tsStr = "";
//
//        Timestamp ts = new Timestamp(1508904840000L);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        try {
//            //方法一
//            tsStr = sdf.format(ts);
//            System.out.println(tsStr);
//            //方法二
//            tsStr = ts.toString();
//            System.out.println(tsStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        for(int i=0;i<5;i++){
            if(i== 3){
             System.out.println("aaa");
            }else{
                System.out.println("bbb");
                throw new RuntimeException("eee");
            }
        }
    }
}
