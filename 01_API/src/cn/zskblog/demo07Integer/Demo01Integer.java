package cn.zskblog.demo07Integer;
/****************************************************************************
* Package:cn.zskblog.demo07Integer                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/16  22:25                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Integer {

    public static void main(String[] args) {
        /*
          装箱：把基本数据类型包装到包装类中(基本数据类型--->包装类)
         */
        // 构造方法
        Integer in1 = new Integer(1);  // 划线方法表名方法过时
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        /*
          拆箱：在包装类中取出基本类型数据(包装类-->基本数据)
         */
        int i = in1.intValue();
        System.out.println(i);
    }
}
