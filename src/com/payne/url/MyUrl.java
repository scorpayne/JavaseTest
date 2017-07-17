package com.payne.url;

import java.net.MalformedURLException;
import java.net.URL;

public class MyUrl {

//    protocols(协议)可以是 HTTP, HTTPS, FTP, 和File。port 为端口号。path为文件路径及文件名。
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://yuncode.net/code/c_5087ce9512c5e88");
        System.out.println("Protocol: " + hp.getProtocol()); // 协议
        System.out.println("Port: " + hp.getPort()); // 端口
        System.out.println("Host: " + hp.getHost()); // 主机
        System.out.println("File: " + hp.getFile()); // url对应的文件名
        System.out.println("Ext:" + hp.toExternalForm());
    }
}
