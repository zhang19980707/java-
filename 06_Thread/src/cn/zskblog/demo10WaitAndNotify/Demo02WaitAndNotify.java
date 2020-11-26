package cn.zskblog.demo10WaitAndNotify;
/****************************************************************************
* Package:cn.zskblog.demo10WaitAndNotify                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  15:23                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02WaitAndNotify {

    public static void main(String[] args) {
        // 创建锁对象保证唯一
        Object obj = new Object();
        // 创建一个顾客线程（消费者）, 使用匿名内部类创建线程对象
        new Thread(){
            @Override
            public void run() {
                while (true){
                    // 顾客和老板线程必须使用同步代码块包裹，保持等待和唤醒只有一个在执行
                    synchronized (obj){
                        System.out.println("\"<--顾客1-->\"等老板做包子");
                        try {
                            obj.wait();  // 调用锁对象的wait方法，使线程进入waiting状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后的代码
                        System.out.println("包子已做好了，\"<---顾客1--->\"开吃");
                        System.out.println("=====================");
                    }
                }
            }
        }.start();

        // 创建一个顾客线程（消费者）, 使用匿名内部类创建线程对象
        new Thread(){
            @Override
            public void run() {
                while (true){
                    // 顾客和老板线程必须使用同步代码块包裹，保持等待和唤醒只有一个在执行
                    synchronized (obj){
                        System.out.println("顾客2等老板做包子。");
                        try {
                            obj.wait();  // 调用锁对象的wait方法，使线程进入waiting状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后的代码
                        System.out.println("包子已做好了，顾客2开吃");
                        System.out.println("=====================");
                    }
                }
            }
        }.start();
        // 创建一个老板线程（生产者）
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000); // 花了5秒做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 保证等待和唤醒的线程只要一个，需要同步技术
                    synchronized (obj){
                        System.out.println("老板做好包子，唤醒顾客开吃");
                        // 唤醒顾客线程， 来吃包子
//                        obj.notify(); // 随机唤醒一个等待的线程
                        obj.notifyAll(); //唤醒所有等待线程
                        
                    }
                }
            }
        }.start();

    }
}
