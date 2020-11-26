package cn.zskblog.demo01GetName;
/****************************************************************************
* Package:cn.zskblog.demo01GetName                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  14:12                                
* Version: 1.0                                                              
* Description:
 *      线程名称从 Thread-0 ---> Thread-1 ----> Thread-...
*****************************************************************************/

public class Demo01GetName {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start(); 

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        // 链式编程
//        System.out.println(Thread.currentThread());
    }
}
