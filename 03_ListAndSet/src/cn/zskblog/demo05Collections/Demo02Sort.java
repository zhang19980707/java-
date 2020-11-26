package cn.zskblog.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

/****************************************************************************
* Package:cn.zskblog.demo05Collections                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  15:35                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> Array = new ArrayList<>();  //数组元素有序
        Collections.addAll(Array,2,8,4,9,6,7);
        System.out.println(Array);

        Collections.sort(Array); // 对集合升序排序
        System.out.println(Array);

        ArrayList<Person> ArrayPerson = new ArrayList<>();
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 20);
        Person p3 = new Person("王武", 19);
        Collections.addAll(ArrayPerson,p1,p2,p3);
        System.out.println(ArrayPerson);
        Collections.sort(ArrayPerson);
        System.out.println(ArrayPerson);


    }
}
