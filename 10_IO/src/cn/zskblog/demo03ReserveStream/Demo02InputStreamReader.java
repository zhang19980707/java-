package cn.zskblog.demo03ReserveStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/****************************************************************************
 * Package:cn.zskblog.demo03ReserveStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  19:40                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02InputStreamReader {

    public static void main(String[] args) throws IOException {
        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("10_IO\\gbk.txt"),"GBK");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("10_IO\\utf_8.txt"));
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
