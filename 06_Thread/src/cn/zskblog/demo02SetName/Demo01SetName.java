package cn.zskblog.demo02SetName;
/****************************************************************************
* Package:cn.zskblog.demo02SetName                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  14:27                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01SetName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        // 方法1：
        mt.setName("小强");
        mt.start();

        // 方法2
        new MyThread("旺财").start(); 
    }
}
