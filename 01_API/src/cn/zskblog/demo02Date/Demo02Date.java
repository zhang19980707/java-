package cn.zskblog.demo02Date;

/****************************************************************************
 * Package:cn.zskblog.demo02Date                                                  
 * Author:ZhangShiKang
 * Email: 845664960@qq.com                                                       
 * Created_at_data:2020/9/16  14:24                             
 * Version: 1.0    
 * Description:                                                     
 *****************************************************************************/

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();  // 展示Date类的无参数构造方法
        demo02();  // 传入毫秒值：1600238433211L  0L显示“ctd 1970年1月1日8点”
        demo03();  // 展示Long getTime()方法， 把日期转换为毫秒值
    }

    private static void demo01() {
        /*
         Date类的午餐构造方法展示
         */
        Date date =  new Date();
        System.out.println("demo01中显示的结果：" + date);  // 显示当前时间--Wed Sep 16 14:28:32 CST 2020
    }

    private static void demo02() {
        /*
         Date类的有参数构造方法展示
         */
        Date date = new Date(0L);
        System.out.println("demo02中第一次显示的结果：" + date);   // 显示0毫秒时的时间--Thu Jan 01 08:00:00 CST 1970

        date = new Date(1600238343321L);  // 传入当前时间的毫秒值表示，显示当前时间
        System.out.println("demo02中第二次显示的结果：" + date); // Wed Sep 16 14:39:03 CST 2020
    }

    private static void demo03(){
        /*
         Long getTime()把日期转换为毫秒值，相当于System.CurrentTimeMillis()方法；
         */

        Date date = new Date();
        long time = date.getTime();
        System.out.println("demo03中显示的结果：" + time);
    }
}
