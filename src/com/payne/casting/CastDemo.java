/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.casting;

import com.payne.entity.Death;
import com.payne.entity.DeathCopy;
import com.payne.entity.Person;
import com.payne.enums.TaskBizTypeEnum;
import com.payne.util.ConverterUtils;
import com.payne.util.ObjectMapperUtil;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author peng.dengp
 * @version $Id: CastDemo, v 0.1 2017-11-08 17:40 peng.dengp Exp $
 */
public class CastDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Death death = new Death();
        death.setAge(1);
        death.setName("9999");
        death.setTaskBizType(TaskBizTypeEnum.CIRCULAR_TOKEN);
        Person person = new Person("1","zhangsan");
        String personStr = ObjectMapperUtil.objectToJSON(person);
        death.setBizContext(personStr);

        String s = ObjectMapperUtil.objectToJSON(death);

        byte[] bytes = ConverterUtils.objectSerialize(s);

        Serializable serializable = ConverterUtils.objectDeserialize(bytes);
        String a = (String)serializable;

        DeathCopy deathCopyCopy = ObjectMapperUtil.objectFromJSON(a, DeathCopy.class);
        Person person1 = ObjectMapperUtil
                .objectFromJSON(deathCopyCopy.getBizContext(), Person.class);
        ;
        System.out.println("sss:" + deathCopyCopy.getTaskBizType()+";"+person1.getName());
    }
}
