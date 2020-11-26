package cn.zskblog.demo07Synchronized;

/****************************************************************************
* Package:cn.zskblog.demo06ThreadSafe                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  16:27                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Dmeo01ticket {

    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
