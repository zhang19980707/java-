package cn.zskblog.demo02Set;

import java.util.LinkedHashSet;

/****************************************************************************
* Package:cn.zskblog.demo02Set                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  15:00                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo04LinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> Linked = new LinkedHashSet<>();
        Linked.add("www");
        Linked.add("zsk");
        Linked.add("www");
        Linked.add("zhang");
        System.out.println(Linked); // 元素不重复，有序
    }
}
