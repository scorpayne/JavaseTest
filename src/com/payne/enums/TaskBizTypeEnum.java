/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.payne.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 商品状态枚举
 *
 * @author tao
 * @version $Id: CommodityStatusEnum, v 0.1 2017-07-09 下午4:08 tao Exp $
 */
public enum TaskBizTypeEnum {

                             TIME_SHELVES("0", "定时上架"),

                             TRAFFIC_ACCOUNT("1", "流量计费"),

                             CIRCULAR_TOKEN("2", "刷新授权Token"),

    ;

    /** 枚举值 */
    private final String code;

    /** 描述 */
    private final String desc;

    /**
     * 构造函数
     *
     * @param code
     * @param desc
     */
    TaskBizTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据枚举值获取枚举
     *
     * @param code
     * @return
     */
    public static TaskBizTypeEnum getByCode(String code) {
        for (TaskBizTypeEnum item : values()) {
            if (StringUtils.equals(item.code, code)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {

        return code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {

        return desc;
    }

}
