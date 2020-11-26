package cn.zskblog.demo03CopyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo02InputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  15:29                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo03CopyFile {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\1.png");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin" +
                "\\Desktop\\101.png");

        byte[] bytes = new byte[1024];  // 定义字节数组缓冲，一次读取多个字节
        int len = 0;
        while ((len=fis.read(bytes)) != -1){
             fos.write(bytes,0,len);
        }
        fos.close(); // 先关闭写的fos
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("程序用时：" + (end - start) + "毫秒");
        // 程序用时：14毫秒
    }
}
