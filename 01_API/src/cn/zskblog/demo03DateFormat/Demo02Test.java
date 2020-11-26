package cn.zskblog.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/****************************************************************************
 * Package:cn.zskblog.demo03DateFormat                                                  
 * Author:ZhangShiKang
 * Email: 845664960@qq.com                                                       
 * Created_at_data:2020/9/16  14:50                             
 * Version: 1.0    
 * Description:                                                     
 *****************************************************************************/

public class Demo02Test {

    public static void main(String[] args) throws ParseException {
        // 1、获取屏幕输入的出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期：yyyy-mm-dd");
        String birthdayDataString = sc.next();

        // 2、将日期字符串parse为long类型的毫秒数值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date birthdayDate = sdf.parse(birthdayDataString);
        long birthdayDateTime = birthdayDate.getTime();

        // 3、获取当前时间的long类型毫秒数值
        long todayTime = new Date().getTime();

        // 4、输出时间计算结果
        long time = todayTime - birthdayDateTime;
        System.out.println("活了：" + time/1000/60/60/24 + "天。");


    }
}
