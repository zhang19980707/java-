package cn.zskblog.demo01List;

import java.util.LinkedList;

/****************************************************************************
* Package:cn.zskblog.demo01List                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  13:47                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02LinkLIst {

    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();

        // 使用add方法
        linked.add("a");
        linked.add("b");
        linked.add("c");

        String s1 = linked.removeFirst();
        String s2 = linked.removeLast();
        String pop = linked.pop();  // 相当于 .removefirst 方法
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(pop);
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();

        // 使用add方法
        linked.add("a");
        linked.add("b");
        linked.add("c");

        String first = linked.getFirst();
        String last = linked.getLast();
        String s = linked.get(1);
        System.out.println(first);
        System.out.println(last);
        System.out.println(s);

        linked.clear();// 清空集合中所有元素
        if (!linked.isEmpty()){
            linked.getFirst();
        }
    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();

        // 使用add方法
        linked.add("a");
        linked.add("b");
        linked.add("c");
//        linked.addFirst("wwww");
        linked.push("www"); // .push 方法相当于 .addfirst方法
        linked.addLast("cat"); // .addlist 方法相当于 .add方法
        System.out.println(linked);
    }
}
