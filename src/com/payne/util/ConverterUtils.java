/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.util;

import java.io.*;

/**
 *
 * @author peng.dengp
 * @version $Id: ConverterUtils, v 0.1 2017-11-08 18:33 peng.dengp Exp $
 */
public class ConverterUtils {
    public static byte[] objectSerialize(Object object) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(object);
        oos.close();
        baos.close();
        return baos.toByteArray();
    }

    public static Serializable objectDeserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        ois.close();
        bais.close();
        return (Serializable) ois.readObject();
    }
}
