package cn.zskblog.demo07Integer;

import java.util.ArrayList;

/****************************************************************************
* Package:cn.zskblog.demo07Integer                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/17  15:13                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

 /**
    * Description: 演示自动装箱和自动拆箱的过程
    * Params: 【】
    * Return: void
    * Date: 2020/9/17 15:23
    */
public class Demo02Integer {

    public static void main(String[] args) {
        Integer in = 1;  // 自动装箱：相当于Integer in = new Integer(1);

        in = in + 2;  // 自动拆箱：相当于in.intValue() + 2，再装箱成in
        System.out.println(in);  // 3

        /*
          ArrayList无法直接存储int类型整数，但是可以存储Integer包装类、
           调用list.add();方法时传入的参数就是一个自动包装好Integer包装类
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int a = list.get(0);
        System.out.println(a);
    }
}
