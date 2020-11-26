package cn.zskblog.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/****************************************************************************
* Package:cn.zskblog.demo03Filter                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/29  10:33                                
* Version: 1.0                                                              
* Description:
 *             使用文件过滤器 FileNameFilter 过滤器优化
*****************************************************************************/

public class Demo02Filter {

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
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });
        */

        File[] files = dir.listFiles((d, name)-> new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java"));

        // 遍历文件和文件夹，获取文件名称并打印
        for (File file : files) {
            if (file.isDirectory()){
                getfile(file);
            }
            System.out.println(file);
        }
    }
}
