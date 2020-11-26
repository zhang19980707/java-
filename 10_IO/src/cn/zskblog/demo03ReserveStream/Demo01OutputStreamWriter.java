package cn.zskblog.demo03ReserveStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/****************************************************************************
 * Package:cn.zskblog.demo03ReserveStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  19:24                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01OutputStreamWriter {

    public static void main(String[] args) throws IOException {

        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        // 1、创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("10_IO\\gbk.txt"), "GBK");
        // 2、写入数据
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    /**
      * Description: 使用转换流写utf_8格式文件
      * Params: []
      * Return: void
      * Date: 2020/9/30 19:29
    */
    private static void write_utf_8() throws IOException {
        // 1、创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("10_IO\\utf_8.txt"));
        // 2、写入数据
        osw.write("你好");
        osw.flush();
        osw.close();
        
    }
}
