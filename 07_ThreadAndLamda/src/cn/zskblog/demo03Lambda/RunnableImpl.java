package cn.zskblog.demo03Lambda;
/****************************************************************************
* Package:cn.zskblog.demo03Lambda                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  17:52                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程已经创建！");
    }
}
