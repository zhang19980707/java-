package cn.zskblog.demo01List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/****************************************************************************
* Package:cn.zskblog.Demo01List
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  13:08                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01List {

    public static void main(String[] args) {
        // 使用多态创建列表
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);  // [a, b, c, d]  说明重写了toString方法

        // .add(int: index, E : element)在指定位置添加元素
        list.add(3,"zskblog");
        System.out.println(list); // [a, b, c, zskblog, d]

        // .get(int: index) 获取指定位置元素
        String s1 = list.get(3);
        System.out.println(s1);

        // .remove(int: index) 移除指定位置的元素
        String remover = list.remove(2);
        System.out.println("移除的是：" + remover); // 移除的是：c
        System.out.println(list); // [a, b, zskblog, d]

        // .set(int: index, E : element) 替换指定位置的元素
        String setE = list.set(2, "高晓松");
        System.out.println("被替换的元素为：" + setE);
        System.out.println(list);

        // 遍历list的三种方式
        // 第一种：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        // 第二种：利用迭代器进行while遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 使用增强for循环遍历list
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println(list.get(5)); // 索引越界异常java.lang.IndexOutOfBoundsException: Index 5 out-of-bounds for length 4

    }
}
