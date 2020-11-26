package cn.zskblog.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

/****************************************************************************
* Package:cn.zskblog.demo01Collection                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/17  18:06                                
* Version: 1.0                                                              
* Description:
 *          演示Collection接口的共性方法
*****************************************************************************/

public class Demo01Collection {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>(); // 多态写法
        System.out.println(coll);  // 子类ArrayList重写了父类的toString()方法

        // add方法：往集合中添加元素, 一般都返回true
        boolean b1 = coll.add("张三");  // 一般都返回true
        System.out.println("b1:" + b1);
        coll.add("李四");
        coll.add("王武");
        coll.add("泪流");
        System.out.println(coll);

        // remove方法：删除成功返回true；失败返回false
        boolean b2 = coll.remove("李四");
        boolean b3 = coll.remove("赵四");
        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);

        // contains方法：判断对象是否在集合中
        boolean b4 = coll.contains("李四");
        System.out.println("b4:" + b4);

        // isEmpty方法：判断集合是否为空，返回布尔值
        boolean b5 = coll.isEmpty();
        System.out.println("b5:" + b5);

        // size方法：返回一个整数值
        int i1 = coll.size();
        System.out.println("b6:" + i1);

        // toArray方法：将集合转换成数组
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // clear方法：清空集合中的元素，但集合任然存在
        coll.clear();
        boolean b7 = coll.isEmpty();
        System.out.println("b7:" + b7);
    }
}
