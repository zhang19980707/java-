package cn.zskblog.demo06StringBuilder;
/****************************************************************************
* Package:cn.zskblog.demo06StringBuilder                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/16  21:09                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01StringBuilder {

    public static void main(String[] args) {
        // 空参构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);

        // 带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:" + bu2);
    }
}
