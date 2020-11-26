package cn.zskblog.demo04Runnable;
/****************************************************************************
* Package:cn.zskblog.demo04Runnable                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  15:54                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/
// step1: 创建一个Runnable的接口实现类
public class RunnableImp implements Runnable {

    // step2: 重写run方法指定多任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
