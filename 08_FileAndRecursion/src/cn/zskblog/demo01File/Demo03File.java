package cn.zskblog.demo01File;

import java.io.File;

/****************************************************************************
* Package:cn.zskblog.demo01File
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  21:00                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03File {

    public static void main(String[] args) {
        File file = new File("E:\\java_learn\\shuangyuan\\a.txt");
        System.out.println(file.getAbsoluteFile()); // 获取文件绝对路径

        System.out.println(file.getPath());  // toString方法内部调用了改方法
        System.out.println(file.getName()); // 获取路径结尾   a.txt
        System.out.println(file.length()); // 获取文件大小，字节形式，文件不存在返回0
        long length = new File(
                "C:\\Users\\Admin\\Desktop\\mysql.pdf").length();
        System.out.println(length); // 555846 字节
    }
}
