/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/**
 * ObjectMapper工具类，能够接受空属性，无引号的json对象的序列化
 *
 * @author peng.dengp
 * @version $Id: ObjectMapperUtil, v 0.1 2017-08-22 16:37 peng.dengp Exp $
 */
public class ObjectMapperUtil {
    private static final ObjectMapper DEFAULT_JSONMAPPER = newObjectMapper();

    public static ObjectMapper newObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        //        输出属性风格：属性为 空("")或者为NULL时都不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        //        允许单引号、允许不带引号的字段名称：
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        //        Enum的序列化与反序列化：
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        return mapper;
    }

    /**
     * 获取构造的ObjectMapper
     *
     * @return
     */
    public static ObjectMapper getDefaultJSONMapper() {
        return DEFAULT_JSONMAPPER;
    }

    /**
     * 将json转换成java对象
     * @param jsonString
     * @param clz
     * @param <Tp>
     * @return
     * @throws IOException
     */
    public static <Tp> Tp objectFromJSON(String jsonString, Class<Tp> clz) throws IOException {
        return DEFAULT_JSONMAPPER.readValue(jsonString, clz);
    }

    /**
     * 将对象转换成json
     * @param obj
     * @return
     * @throws IOException
     */
    public static String objectToJSON(Object obj) throws IOException {
        return DEFAULT_JSONMAPPER.writeValueAsString(obj);
    }
}
