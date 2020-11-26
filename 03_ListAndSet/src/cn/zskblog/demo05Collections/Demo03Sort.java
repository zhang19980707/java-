package cn.zskblog.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/****************************************************************************
* Package:cn.zskblog.demo05Collections                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  16:00                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1,2,3,4,5,6,778,89);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1; // 降序排序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("迪丽热巴", 18));
        list02.add(new Student("赵丽颖", 19));
        list02.add(new Student("a杨幂", 20));
        list02.add(new Student("b杨超越", 20));
        System.out.println(list02);
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result= o2.getAge() - o1.getAge();
                if (result == 0 ){
                    result = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
