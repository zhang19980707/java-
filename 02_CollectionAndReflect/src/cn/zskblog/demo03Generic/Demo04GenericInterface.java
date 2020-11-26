package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  09:02                                
* Version: 1.0                                                              
* Description:     测试GenericInterface
*****************************************************************************/

public class Demo04GenericInterface {
    public static void main(String[] args) {
        // 创建GenericInterfaceImplement1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("hello GenericInterface!");

        // 创建GenericInterfaceImplement2对象
        GenericInterfaceImpl2<Double> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(1.00);
    }
}
