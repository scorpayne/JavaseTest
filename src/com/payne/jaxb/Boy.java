/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author peng.dengp
 * @version $Id: Boy, v 0.1 2017-10-19 21:19 peng.dengp Exp $
 */
@XmlRootElement(name = "xml") // 必须要标明这个元素
//@XmlAccessorType(XmlAccessType.FIELD)
public class Boy {
    @XmlElement(name = "Name")
    private String name = "CY";

    public String getName() {
        return name;
    }
}
