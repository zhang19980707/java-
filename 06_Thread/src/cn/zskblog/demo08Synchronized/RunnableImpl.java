package cn.zskblog.demo08Synchronized;
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
    @Override
    public void run() {
        while (true) {
            payTicket();
        }
    }

    public synchronized void payTicket(){
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
            ticket--;
            try {
                Thread.sleep(100); // 减少资源抢夺出错概率
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
