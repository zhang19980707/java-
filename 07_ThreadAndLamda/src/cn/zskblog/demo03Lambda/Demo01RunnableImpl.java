package cn.zskblog.demo03Lambda;
/****************************************************************************
* Package:cn.zskblog.demo03Lambda                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  17:53                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01RunnableImpl {

    public static void main(String[] args) {
        // 使用实现类开启多线程
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        t1.start();

        // 使用匿名内部类开启多任务
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "使用匿名内部类创建了一个新的线程！");
            }
        };
        Thread t2 = new Thread(r);
        t2.start();

        // 简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "简化代码创建了一个新线程");
            }
        }).start();
    }
}
