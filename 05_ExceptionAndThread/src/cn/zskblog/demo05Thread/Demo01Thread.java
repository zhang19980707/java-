package cn.zskblog.demo05Thread;
/****************************************************************************
* Package:cn.zskblog.demo05Thread                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  21:02                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Thread {

    public static void main(String[] args) {
        Person p1 = new Person("小明");
        p1.run();
        System.out.println(0 / 0);
        Person p2 = new Person("小强");
        p2.run();
    }
}
