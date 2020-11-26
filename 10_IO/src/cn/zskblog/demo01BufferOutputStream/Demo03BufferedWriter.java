package cn.zskblog.demo01BufferOutputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo03ReserveStream
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  18:26                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo03BufferedWriter {

    public static void main(String[] args) throws IOException {
        //  1、创建字符缓冲输出流
        BufferedWriter br = new BufferedWriter(new FileWriter("10_IO\\b.txt"));
        for (int i = 0; i < 10; i++) {
            // 2、写入字符串数据
            br.write("你好");
            br.newLine();  // 换行
        }
        // 3、关闭字符缓冲输出流
        br.close();
    }
}
