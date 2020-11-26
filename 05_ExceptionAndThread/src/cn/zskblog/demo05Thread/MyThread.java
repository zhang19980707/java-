package cn.zskblog.demo05Thread;
/****************************************************************************
* Package:cn.zskblog.demo05Thread                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  21:46                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }
}
