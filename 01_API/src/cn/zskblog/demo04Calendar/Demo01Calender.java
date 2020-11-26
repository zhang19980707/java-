package cn.zskblog.demo04Calendar;

import java.util.Calendar;

/****************************************************************************
 * Package:cn.zskblog.demo04Calendar                                                  
 * Author:ZhangShiKang
 * Email: 845664960@qq.com                                                       
 * Created_at_data:2020/9/16  15:50                             
 * Version: 1.0    
 * Description:                                                     
 *****************************************************************************/

public class Demo01Calender {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // 多态
        System.out.println(c);  // 子类重写了toString()方法；
    }
}
