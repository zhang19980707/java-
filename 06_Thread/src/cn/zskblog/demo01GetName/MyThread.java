package cn.zskblog.demo01GetName;
/****************************************************************************
* Package:cn.zskblog.demo01GetName                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  14:12                                
* Version: 1.0                                                              
* Description:
 *     获取线程名称：
 *        1、使用Thread模块的 getName() 方法
 *            String getName() 返回线程名称
 *        2、可以获取当前正在执行的线程，使用线程的 getName() 方法
 *            static Thread currentThread()  返回正在执行线程引用
*****************************************************************************/

public class MyThread extends Thread{

    @Override
    public void run() {
        // 方法1：
        /*
        String name = getName();
        System.out.println(name);
        */
        // 方法2：
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
