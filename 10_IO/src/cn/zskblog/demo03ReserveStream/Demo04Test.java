package cn.zskblog.demo03ReserveStream;

import java.io.*;

/****************************************************************************
 * Package:cn.zskblog.demo03ReserveStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  19:47                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo04Test {

    public static void main(String[] args) throws IOException {
        // 1、创建读写流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("10_IO\\gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("10_IO\\gbk转换为utf—8格式后的文件.txt"), "utf8");
        // 2、读写数据
        int len = 0;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        // 3、关闭流
        osw.close();
        isr.close();
    }
}
