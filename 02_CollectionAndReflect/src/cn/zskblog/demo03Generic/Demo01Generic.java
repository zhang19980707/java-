package cn.zskblog.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/****************************************************************************
* Package:cn.zskblog                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/18  23:00                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Generic {

    public static void main(String[] args) {
        show01();
        show02();
    }

     /**
        * Description: 创建集合对象时使用泛型的好处：
        *                      避免类型转换时的异常问题；
        *                      把运行代码异常提升到编译阶段
        *              弊端：泛型指定什么类型数据就只能存什么类型数据
        * Params: []
        * Return: void
        * Date: 2020/9/18 23:16
        */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }
    }

    /**
        * Description: 展示不使用泛型所带来的的问题
        *             好处：不使用泛型，集合默认存储Object类型，可存储任意类型数据
        *             弊端：不安全，容易引发异常
        * Params: []
        * Return: void
        * Date: 2020/9/18 23:01
        */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(1);

        // 使用迭代器遍历list集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            // 使用String特有的方法length函数获取字符串长度；
            //        不能用  多态  Object obj = “abc”；  （需要向下转型）
            String s = (String) obj;  // 将object类型向下转成String类型
            // java.lang.ClassCastException:
            //    java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
            int length = s.length();
            System.out.println(length);

        }

    }
}
