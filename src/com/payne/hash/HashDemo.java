/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.hash;

import com.payne.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author peng.dengp
 * @version $Id: HashDemo, v 0.1 2017-09-21 23:41 peng.dengp Exp $
 */
public class HashDemo {
    public static void main(String[] args){

        List<Person> personList = new ArrayList<Person>();
        Person zhangsan = new Person("001", "zhangsan");
        personList.add(zhangsan);

        Person lisi = new Person("001", "lisi");

        System.out.println("人员是否重复 ? "+(personList.contains(lisi)));
        System.out.println("zhangsan == lisi ? "+(zhangsan==lisi));
        System.out.println("zhangsan.equals(lisi) ? "+(zhangsan.equals(lisi)));

    }
}
