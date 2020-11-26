package cn.zskblog.demo02Set;

import java.util.HashSet;

/****************************************************************************
* Package:cn.zskblog.demo02Set                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  14:40                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03HashSetSavaPerson {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 19);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        /*
        重写类中的equals()和HashCode()方法之前
         */
        System.out.println(p1.hashCode()); // 1967205423
        System.out.println(p3.hashCode()); //  42121758

        System.out.println(set);
    }
}
