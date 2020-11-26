package cn.zskblog.demo01File;

import java.io.File;

/****************************************************************************
* Package:cn.zskblog.demo01File
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  20:31                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01File {

    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;  // 路径分割符
        System.out.println(pathSeparator);   // windows下是;  linux下是:

        String separator = File.separator; // 文件名称分割符
        System.out.println(separator); // windows下是\     linux下是/ 
    }
}
