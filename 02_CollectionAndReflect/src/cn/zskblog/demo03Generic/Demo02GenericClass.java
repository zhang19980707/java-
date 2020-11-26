package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  08:27                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02GenericClass {

    public static void main(String[] args) {
        // 类中使用了泛型，但在创建对象时没有指定泛型，默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj); // 打印obj类型数据

        // 创建对象时使用Integer泛型
        GenericClass<Integer> gcg = new GenericClass<>();
        gcg.setName(1);
        Integer in1 = gcg.getName();
        System.out.println(in1);

        // 创建使用String泛型创建对象、
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("张三");
        System.out.println(gc3.getName());

    }
}
