package cn.zskblog.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;

/****************************************************************************
* Package:cn.zskblog.demo02Iterator                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/18  22:36                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02Foreach {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

     /**
        * Description: 使用增强for循环遍历集合类型
        * Params: []
        * Return: void
        * Date: 2020/9/18 22:46
        */
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String i : list){
            System.out.println(i);
        }

    }

    /**
        * Description: 使用增强for循环遍历数组
        * Params: []
        * Return: void
        * Date: 2020/9/18 22:41
        */
    private static void demo01() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(i);

        }
    }
}
