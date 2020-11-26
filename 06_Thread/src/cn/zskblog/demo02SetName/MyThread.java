package cn.zskblog.demo02SetName;
/****************************************************************************
* Package:cn.zskblog.demo02SetName                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  14:28                                
* Version: 1.0                                                              
* Description:
 *   设置线程名称：
 *     1、使用 Thread 模块中的 SetName() 方法
 *       void SetName(String name) 改变线程名称，使之与参数相同
 *     2、创建一个带参数的构造方法，调用父类构造方法，把线程名称传递
 *       给父类，让父类(Thread)给子线程起名
 *        Thread(String name) 分配新的 Thread 对象
*****************************************************************************/

public class MyThread extends Thread {
    public MyThread(){
        
    }

    public MyThread(String name){
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
