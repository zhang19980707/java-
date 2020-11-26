package cn.zskblog.demo06StringBuilder;
/****************************************************************************
* Package:cn.zskblog.demo06StringBuilder                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/16  21:45                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03StringBuilder {

    public static void main(String[] args) {
        // String--->stringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);

        // 往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:" + bu);

        // 使用bu.toString()方法将StringBuilder对象转成string类型
        String s = bu.toString();
        System.out.println("s:" + s);
    }
}
