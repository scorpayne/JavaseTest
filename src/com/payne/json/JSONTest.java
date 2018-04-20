package com.payne.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payne.entity.Person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class JSONTest {
    public static void main(String[] args) {

        /** ---------------------- start 序列化时 对时间进行格式序列化 ----------------------------**/
        //JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS")
//        List<Person> list = new ArrayList<Person>();
//        Person person = new Person();
//        person.setName("遇见小星");
//        for (int i = 0; i < 3; i++) {
//            person.setIdentNo(i + "");
//            person.setBirthday(Calendar.getInstance().getTime());
//            list.add(person);
//        }
//
//        //时间格式化
//        String data = JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:00", SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat);
//
//        System.out.println("result:" + data);
        /** ---------------------- end 序列化时 对时间进行格式序列化 ----------------------------**/


        /** ---------------------- start String的format使用 ----------------------------**/
//        StringBuffer str = new StringBuffer();
//
//        str.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//        str.append("<ns1:CustomerName>");
//        str.append("%s");
//        str.append("</ns1:CustomerName><ns1:Password>");
//        str.append("%s");
//        str.append("</ns1:Password>");
//
//        String s = str.toString();
//        String format = String.format(s, new Object[]{"a", "b"});
//
//        System.out.println("result:" + s);
//        System.out.println("result:" + format);
        /** ---------------------- end String的format使用 ----------------------------**/

    }
}
