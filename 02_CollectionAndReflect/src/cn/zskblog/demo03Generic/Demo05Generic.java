package cn.zskblog.demo03Generic;

import java.util.ArrayList;

/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  09:25                                
* Version: 1.0                                                              
* Description:
 *          泛型通配符的使用 ：
 *             ？ 表示任意数据类型
 *         使用：
 *            不能创建对象
 *            只能作为方法的参数使用，来接收数据
*****************************************************************************/
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        printArrayList(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        printArrayList(list2);
    }
    /*
      使用泛型统配符接收数据，用于集合遍历
     */
    private static void printArrayList(ArrayList<?> list) {
        /*
          使用增强for循环遍历集合
          使用while遍历需现将集合转换成迭代器
          在利用it.hasnext()和it.next()方法输出迭代器中可存储任何数据类型的Object对象
         */
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
