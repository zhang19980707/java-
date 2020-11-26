package cn.zskblog.demo02Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/****************************************************************************
* Package:cn.zskblog.demo02Set                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  14:15                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Set {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 使用add、方法往集合中添加元素
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);    // 不允许元素重复

        // 使用while和迭代器遍历set
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 使用增强for循环遍历set
        System.out.println("=======================");
        for (Integer i: set) {
            System.out.println(i);
        }
    }
}
