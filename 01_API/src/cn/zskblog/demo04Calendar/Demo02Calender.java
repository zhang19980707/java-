package cn.zskblog.demo04Calendar;

import java.util.Calendar;
import java.util.Date;

/****************************************************************************
 * Package:cn.zskblog.demo04Calendar                                                  
 * Author:ZhangShiKang
 * Email: 845664960@qq.com                                                       
 * Created_at_data:2020/9/16  15:56                             
 * Version: 1.0    
 * Description:                                                     
 *****************************************************************************/

public class Demo02Calender {

    public static void main(String[] args) {
        get();  // 获取日历的年月日信息
        set();  // 设置日历中的年月日信息
        add();  // 增减日历信息
        date();  // 将日历转换为日期信息
    }

    private static void get(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);  // 西方的月份是 0-11

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    private static void set(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 9988);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DAY_OF_MONTH, 30);

//        c.set(8888,9,30);    使用重载方法实现同时设置年月日

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

    }

    private static void add(){
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, 2);
        c.add(Calendar.MONTH, -2);
        c.add(Calendar.DAY_OF_MONTH, -2);
        
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);  // 西方的月份是 0-11

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    private static void date(){
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }
}
