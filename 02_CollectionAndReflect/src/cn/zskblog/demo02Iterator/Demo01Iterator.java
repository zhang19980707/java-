package cn.zskblog.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/****************************************************************************
* Package:cn.zskblog.demo02Iterator                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/18  21:56                                
* Version: 1.0                                                              
* Description:
 *          迭代器
*****************************************************************************/

public class Demo01Iterator {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("霍华德");
        coll.add("詹姆斯");
        coll.add("艾佛森");

        // 多态  接口            实现类
        Iterator<String> it = coll.iterator();
        /*
        boolean b = it.hasNext(); // 判断集合中是否还有元素，返回boolean类型
        System.out.println("b:" + b);
        String s = it.next();  // 取出集合中的下一个元素，返回泛型元素，没有产生异常
        System.out.println("s:" + s);
         */

        // 使用while循环取出集合中元素
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }


    }
}
