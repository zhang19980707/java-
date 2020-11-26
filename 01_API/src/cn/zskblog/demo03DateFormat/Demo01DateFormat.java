package cn.zskblog.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/****************************************************************************
 * Package:cn.zskblog.demo03DateFormat
 *
 * Author:ZhangShiKang
 * Email: 845664960@qq.com
 *
 * Created_at_data:2020/9/16  14:46                             
 * Version: 1.0    
 * Description:                                                     
 *****************************************************************************/

public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {   // 抛出异常
        demo01();  // 演示SimpleDateFormat类的format方法
        demo02();  // 演示SimpleDateFormat类的parse方法
    }

    private static void demo02() throws ParseException {   // 抛出异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");
        Date date = sdf.parse("2020-19-16-15-19-07");    //
        // SimpleDateFormat类对象的parse方法
        System.out.println(date);

    }

    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");
        Date date = new Date();
        String d = sdf.format(date);  // SimpleDateFormat类对象的format方法
        System.out.println(date);
        System.out.println(d);
    }
}
