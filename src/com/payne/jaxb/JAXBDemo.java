/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 *
 * @author peng.dengp
 * @version $Id: JAXBDemo, v 0.1 2017-10-19 21:19 peng.dengp Exp $
 */
public class JAXBDemo {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Boy.class);

        Marshaller marshaller = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Boy boy = new Boy();
        marshaller.marshal(boy, System.out);
        System.out.println();

        String xml = "<xml><Name>David</Name></xml>";
        Boy boy2 = (Boy) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(boy2.getName());

    }
}
