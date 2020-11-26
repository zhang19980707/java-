package cn.zskblog.demo01BufferOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo04BufferedReader                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  18:34                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo04BufferedReader {

    public static void main(String[] args) throws IOException {
        // 1、创建 BufferedReader 字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("10_IO\\b.txt"));
        // 2、循环读取每行数据
        String lines;
        while ((lines = br.readLine()) != null){
            System.out.println(lines);
        }
        // 3、关闭流对象
        br.close();
    }
}
