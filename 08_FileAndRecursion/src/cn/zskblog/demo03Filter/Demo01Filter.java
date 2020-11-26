package cn.zskblog.demo03Filter;

import java.io.File;
import java.io.FileFilter;

/****************************************************************************
* Package:cn.zskblog.demo03Filter                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/29  10:33                                
* Version: 1.0                                                              
* Description:
 *             使用文件过滤器FileFilter优化
*****************************************************************************/

public class Demo01Filter {

    public static void main(String[] args) {
        File dir = new File("E:\\java_learn\\shungyuan");
        getfile(dir);

    }

    private static void getfile(File dir) {
        System.out.println(dir);
        /*
           编写文件过滤器，在调用listFiles() 方法时，将过滤器传递进去，重写accept方法
         */
        /*
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 编辑过滤的逻辑，需要返回文件名则 return true;
                if (pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });
        */
        File[] files = dir.listFiles((pathname)->pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory());

        // 遍历文件和文件夹，获取文件名称并打印
        for (File file : files) {
            if (file.isDirectory()){
                getfile(file);
            }
            System.out.println(file);
        }
    }
}
