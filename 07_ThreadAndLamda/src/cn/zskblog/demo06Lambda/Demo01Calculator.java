package cn.zskblog.demo06Lambda;
/****************************************************************************
* Package:cn.zskblog.demo06Lambda                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  19:35                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Calculator {

    public static void main(String[] args) {
        // 使用匿名内部类
        invokeCalc(12, 33, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        // 使用Lambda表达式
        invokeCalc(22, 45, (int a, int b)->{
            return a + b;
        });

        // 省略格式
        invokeCalc(22, 45, (a, b)->a + b);
    }


    public static void invokeCalc(int a, int b, Calculator c) {
        int result = c.calc(a,b);
        System.out.println(result);
    }
}
