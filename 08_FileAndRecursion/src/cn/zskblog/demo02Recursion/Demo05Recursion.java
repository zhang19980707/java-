package cn.zskblog.demo02Recursion;

import java.io.File;

/****************************************************************************
* Package:cn.zskblog.demo02Recursion                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/29  10:12                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo05Recursion {

    public static void main(String[] args) {
        File file = new File("E:\\java_learn\\shungyuan");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f); // 递归
            } else {
                if (f.getName().toLowerCase().endsWith(".java")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
