package cn.zskblog.demo01BufferOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo01BufferOutputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  17:32                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02BufferedInputStream {

    public static void main(String[] args) throws IOException {
        // 1、创建字节输入流对象
        FileInputStream fis = new FileInputStream("10_IO\\a.txt");
        // 2、创建缓冲流对象，传入字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        // 3、读取数据
        /*
        int len = 0;
        while ((len = bis.read()) != -1){
            System.out.println(len);
        }
        */
        byte[] bytes = new byte[1024]; // 创建字节数组
        int len = 0; // 记录每次读取的个数
        while ((len = bis.read(bytes)) != -1){
            // 将字节转换为字符串输出显示
            System.out.println(new String(bytes,0,len));
        }
        // 4、关闭缓冲流
        bis.close();
    }
}
