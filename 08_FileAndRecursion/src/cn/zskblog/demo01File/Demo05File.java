package cn.zskblog.demo01File;

import java.io.File;
import java.io.IOException;

/****************************************************************************
* Package:cn.zskblog.demo01File
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  21:27                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo05File {

    public static void main(String[] args) throws IOException{
        show01();
    }

    private static void show01() throws IOException {
        File f1 = new File("E:\\java_learn\\shungyuan\\a.txt");
        System.out.println(f1.delete());
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        File f2 = new File("E:\\java_learn\\shungyuan\\111");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        boolean b3 = f2.delete();
        System.out.println(b3);
    }
}
