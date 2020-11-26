package cn.zskblog.demo01Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/****************************************************************************
 * Package:cn.zskblog.demo01Object
 *
 * Author:ZhangShiKang
 * Email: 845664960@qq.com
 *
 * Created: 2020/9/17  15:53
 * Version: 1.0
 * Description:
 *****************************************************************************/

public class Demo01ToString {

    public static void main(String[] args) {
        /*
        直接调用类对象的toString()方法返回的是对象的地址值
          cn.zskblog.demo01Object.Person@75412c2f
        直接打印对象名和调用toString()方法等效
         */
        Person p = new Person("张三", 18);
        String s = p.toString();

        // 重写了类中的toString()方法后输出的值
        System.out.println(s); // Person{name='张三', age=18}
        System.out.println(p); // Person{name='张三', age=18}

        /*
          打印对象名判断类中是否重写了toString()方法：
                如果打印地址值--->没有重写
                打印对象属性值--->重写了
         */
        Random r = new Random(); // java.util.Random@7f63425a
        System.out.println(r);  // 未重写

        Scanner sc = new Scanner(System.in);
        // java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0
        // ][match valid=false][need input=false][source
        // closed=false][skipped=false][group separator=\,][decimal
        // separator=\.]
        System.out.println(sc); // 重写

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]   重写
    }
}
