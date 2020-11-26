package cn.zskblog.demo02Exception;

import java.io.IOException;

/****************************************************************************
* Package:cn.zskblog.demo02Exception                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  16:42                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02TryCatchFinally {

    public static void main(String[] args) {
        try {
            readfile("d:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 无论是否发生异常代码都会执行
            System.out.println("资源释放！");
        }
    }

    private static void readfile(String filename) throws IOException {
        if (!filename.endsWith(".txt")){
            throw new IOException("文件格式不正确");
        }
        System.out.println("没有发生异常，格式正确，开始读取");

    }
}
