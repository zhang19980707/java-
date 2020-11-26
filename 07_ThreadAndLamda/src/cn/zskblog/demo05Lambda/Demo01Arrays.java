package cn.zskblog.demo05Lambda;

import java.util.Arrays;
import java.util.Comparator;


/****************************************************************************
* Package:cn.zskblog.demo05Lambda                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  19:16                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Arrays {

    public static void main(String[] args) {
        Person[] arr = new Person[]{
                new Person("迪丽热巴",18),
                new Person("古力娜扎",20),
                new Person("柳岩", 13)
        };

        // 使用匿名内部类排序
//        Arrays.sort(arr, new Comparator<Person>() {
////            @Override
////            public int compare(Person o1, Person o2) {
////                return o1.getAge() - o2.getAge();
////            }
////        });
        
        // 使Lambda表达式
        Arrays.sort(arr, (Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        // 省略格式
        Arrays.sort(arr, (o1,o2)->o1.getAge() - o2.getAge());

        // 遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
