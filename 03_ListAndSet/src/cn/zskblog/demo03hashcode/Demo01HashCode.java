package cn.zskblog.demo03hashcode;
/****************************************************************************
* Package:cn.zskblog.demo03hashcode                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  14:42                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
    }
}
