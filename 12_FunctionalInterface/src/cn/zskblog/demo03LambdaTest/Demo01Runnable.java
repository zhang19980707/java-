package cn.zskblog.demo03LambdaTest;
/****************************************************************************
 * Package:cn.zskblog.demo03LambdaTest                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/3  09:09                                
 * Version: 1.0                                                              
 * Description:
 *          练习1、使用函数式接口作为方法的参数
*****************************************************************************/

public class Demo01Runnable {
    // 定义一个startThread()方法，参数时Runnable函数式接口
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        // 调用startThread()方法，传递接口匿名内部类，重写 run 方法
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了！");
            }
        });

        // 使用lambda表达式“语法糖”创建新线程，优化了匿名内部类的写法
        startThread(()-> System.out.println(Thread.currentThread().getName()+ "-->" + "线程启动了！"));
    }
}
