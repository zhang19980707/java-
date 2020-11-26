package cn.zskblog.demo04Runnable;
/****************************************************************************
* Package:cn.zskblog.demo04Runnable                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  15:56                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Runnable {

    public static void main(String[] args) {
        // step3: 创建接口实现类对象
        RunnableImp run = new RunnableImp();
        // step4：创建线程，传递实现类对象
        Thread t = new Thread(run);
        // step5：调用t.start() 开启线程
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
