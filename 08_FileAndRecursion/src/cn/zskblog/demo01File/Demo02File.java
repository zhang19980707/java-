package cn.zskblog.demo01File;

import java.io.File;

/****************************************************************************
* Package:cn.zskblog.demo01File
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  20:40                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02File {

    public static void main(String[] args) {
        /*
           File类的构造方法
         */
        show01();
        show02("c:\\","a.txt");
        show03();
    }

    private static void show03() {
        File parent = new File("C:\\");
        File file = new File(parent, "c.txt");
        System.out.println(file);
    }

    private static void show02(String parent, String child) {
        File f2 = new File(parent,child);
        System.out.println(f2);
    }

    private static void show01() {
        File f1 = new File("E:\\java_learn\\shuangyuan\\a.txt");
        System.out.println(f1);

        System.out.println(new File("E:\\java_learn\\shuangyuan"));

        System.out.println(new File("b.txt"));
    }
}
