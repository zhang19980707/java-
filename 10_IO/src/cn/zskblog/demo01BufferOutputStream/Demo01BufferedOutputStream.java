package cn.zskblog.demo01BufferOutputStream;

import java.io.*;

/****************************************************************************
 * Package:cn.zskblog.demo01BufferOutputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  17:19                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01BufferedOutputStream {

    public static void main(String[] args) throws IOException {
        // 1、创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("10_IO\\a.txt");
        // 2、创建字节缓冲流对象，传递输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 3、写入数据，将字符串通过 .getBytes() 方法转换为字节
        bos.write("把数据写到缓冲区".getBytes());
        // 4、使用 .flush() 方法刷新缓冲区
        bos.flush();
        // 5、关闭缓冲流（关闭之前也会刷新）
        bos.close();
        
    }
}
