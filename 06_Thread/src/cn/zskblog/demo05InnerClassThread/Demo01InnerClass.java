package cn.zskblog.demo05InnerClassThread;

import cn.zskblog.demo04Runnable.RunnableImp;

/****************************************************************************
* Package:cn.zskblog.demo05InnerClassThread                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  16:14                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01InnerClass {

    public static void main(String[] args) {
        // 线程父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }.start();

        // 线程接口是 Runnable 接口  Runnable r = new RunnableImpl(); 多态
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        };
        new Thread(r).start();
    }
}
