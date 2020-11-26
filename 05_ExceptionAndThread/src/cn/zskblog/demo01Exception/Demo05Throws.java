package cn.zskblog.demo01Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/****************************************************************************
* Package:cn.zskblog.demo01Exception                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  16:06                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo05Throws {

// public static void main(String[] args) throws FileNotFoundException, IOException
    // 所有的异常都是Exception类的子类
    public static void main(String[] args) throws Exception{
        readfile("c:\\a.tx");
    }

    private static void readfile(String filename) throws IOException {
        if (!filename.equals("c:\\a.txt")){
            throw new FileNotFoundException("文件没有找到");
        }
        if (!filename.endsWith("txt")){
            throw new IOException("文件格式不正确");
        }
        System.out.println("文件找到，开始读取！");

    }
}
