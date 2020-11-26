package cn.zskblog.demo07Integer;
/****************************************************************************
* Package:cn.zskblog.demo07Integer                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/17  15:33                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

 /**
    * Description: 利用包装类的方法实现一些整数和字符串数据之间类型的转换
    * Params: 【】
    * Return: void
    * Date: 2020/9/17 15:46
    */
public class Demo03Integer {

    public static void main(String[] args) {
        // 整数(int)-->字符串(str)
        int i = 100;
        String s1 = i+"";  // 最常用
        System.out.println(s1+200);

        String s2 = Integer.toString(100);  // 使用Integer包装类中的toString方法
        System.out.println(s2+200);

        String s3 = String.valueOf(100);  // 使用String类中的valueOf方法
        System.out.println(s3+200);

        // 字符串(str)-->整数(int)
        int i1 = Integer.parseInt(s1);   // 使用Integer包装类的方法
        double v = Double.parseDouble(s1); // 使用Double包装类的方法
        System.out.println(i1);
        System.out.println(v);
    }
}
