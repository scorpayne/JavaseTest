/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.socket;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author peng.dengp
 * @version $Id: Network, v 0.1 2017-09-19 11:45 peng.dengp Exp $
 */
public class Network {
    public static void main(String[] args){
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface
                    .getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
}
