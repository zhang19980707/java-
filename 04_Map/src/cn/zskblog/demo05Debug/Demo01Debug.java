package cn.zskblog.demo05Debug;
/****************************************************************************
* Package:cn.zskblog.demo05Debug                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  10:37                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Debug {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        demo01();
    }

    private static void demo01() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
