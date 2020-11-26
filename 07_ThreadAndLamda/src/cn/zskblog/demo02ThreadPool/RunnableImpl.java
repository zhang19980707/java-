package cn.zskblog.demo02ThreadPool;
/****************************************************************************
* Package:cn.zskblog.demo02ThreadPool                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  17:41                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新线程");
    }
}
