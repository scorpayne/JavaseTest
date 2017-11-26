/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author peng.dengp
 * @version $Id: PatternDemo, v 0.1 2017-10-27 10:36 peng.dengp Exp $
 */
public class PatternDemo {
    public static void main(String[] args){
        String regEx1 = "^1[3,4,5,6,7,8,9]\\d{9}$";

        String regEx2 = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,20}$";

        String regEx3 ="^[([A-Za-z0-9]*)|([0-9]*)|([a-zA-Z]*)]{8,20}$";

        String regEx4 ="^[\\u0391-\\uFFE5]{1,7}|[A-Za-z0-9]{2,14}$";

        String regEx5 ="^[([\\u0391-\\uFFE5]*)|([A-Za-z]*)]{1,14}$";

        String regEx6 = "^\\d{1,9}(.\\d{1,2})?$";

        String regEx7 = "^\\d{10}$";

        String regEx8 = "^[A-Za-z0-9]{32}$";


        // 要验证的字符串
        String str = "service@xsoftlab.net";

        String str1 = "999999F99999999999999999999999ac";
        // 邮箱验证规则
        String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx8);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str1);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);

        int a = 0;
        try {
            for(int i=0;i<2;i++){
                int strLength = strLength(str1);
            }
        }catch (Exception e){
            a++;
            System.out.println("a="+a);

        }
//        if(a!=0){
//            throw new RuntimeException("eeee");
//        }
        System.out.println("aaaaaaaaa="+a);
//        if(strLength<1 || strLength>14){
//            System.out.println("不符合规则");
//        }

//        System.out.println("结果："+(Double.valueOf("200.0") > 200));
    }

    /**
     * 判断字符串的字符长度
     * @param string
     * @return
     */
    public static int strLength(String string) {
        int length = 0;
        int n = 0;
        for (int i = 0; i < string.length(); i++) {
            n = (int) string.charAt(i);
            if (!(19968 <= n && n < 40869)) {
                length += 1;
            } else {
                length += 2;
            }
        }
        int a = 2/0;
        System.out.println("长度："+length);
        return length;
    }
}
