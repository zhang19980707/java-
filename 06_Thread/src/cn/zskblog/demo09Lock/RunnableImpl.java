package cn.zskblog.demo09Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/****************************************************************************
* Package:cn.zskblog.demo06ThreadSafe                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  16:26                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class RunnableImpl implements Runnable{

    private int ticket = 100;

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (ticket > 0){
                try {
                    Thread.sleep(100); // 减少资源抢夺出错概率
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
                    ticket--;}
                    catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
            }

        }
    }
}
