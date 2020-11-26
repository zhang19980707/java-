package cn.zskblog.demo01File;

import java.io.File;

/****************************************************************************
* Package:cn.zskblog.demo01File
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  21:16                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo04File {

    public static void main(String[] args) {
        File file = new File("E:\\java_learn\\shungyuan");
        if (file.exists()){  // 判断文件是否真实存在在硬盘中
            if (file.isFile()){  // 判断是否为一个文件，文件和文件夹互斥
                System.out.println("文件存在");
            } else{
                System.out.println("这是一个文件夹");
            }
        } else{
            System.out.println("文件不存在");
        }
    }
}
