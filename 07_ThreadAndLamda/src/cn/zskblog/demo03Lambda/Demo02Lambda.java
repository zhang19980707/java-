package cn.zskblog.demo03Lambda;
/****************************************************************************
* Package:cn.zskblog.demo03Lambda                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  18:48                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02Lambda {

    public static void main(String[] args) {
        // 使用匿名内部类，简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "简化代码创建了一个新线程");
            }
        }).start();

        // 使用Lambda表达式
        new Thread(()->System.out.println(Thread.currentThread().getName() + "简化代码创建了一个新线程")).start();
    }
}
