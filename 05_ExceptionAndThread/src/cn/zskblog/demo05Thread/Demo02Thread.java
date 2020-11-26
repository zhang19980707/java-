package cn.zskblog.demo05Thread;
/****************************************************************************
* Package:cn.zskblog.demo05Thread                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  21:45                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02Thread {

    public static void main(String[] args) {
        MyThread td = new MyThread();
        td.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
