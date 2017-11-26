/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.zookeeper;



/**
 *
 * @author peng.dengp
 * @version $Id: ZookeeperTest, v 0.1 2017-09-23 14:16 peng.dengp Exp $
 */
public class ZookeeperTest {
//    private static final int    TIME_OUT = 3000;
//    private static final String HOST     = "localhost:2181";
//
//    public static void main(String[] args) throws Exception {
//
//        ZooKeeper zookeeper = new ZooKeeper(HOST, TIME_OUT, null);
//        System.out.println("=========创建节点===========");
//        if (zookeeper.exists("/test", false) == null) {
//            zookeeper.create("/test", "znode1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
//                CreateMode.PERSISTENT);
//        }
//        System.out.println("=============查看节点是否安装成功===============");
//        System.out.println(new String(zookeeper.getData("/test", false, null)));
//
//        System.out.println("=========修改节点的数据==========");
//        String data = "zNode2";
//        zookeeper.setData("/test", data.getBytes(), -1);
//
//        System.out.println("========查看修改的节点是否成功=========");
//        System.out.println(new String(zookeeper.getData("/test", false, null)));
//
//        System.out.println("=======删除节点==========");
//        zookeeper.delete("/test", -1);
//
//        System.out.println("==========查看节点是否被删除============");
//        System.out.println("节点状态：" + zookeeper.exists("/test", false));
//
//        zookeeper.close();
//    }
}
