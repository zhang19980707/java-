package cn.zskblog.demo02InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/****************************************************************************
 * Package:cn.zskblog.demo02InputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  14:27                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02InputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("09_IOAndProperties\\b.txt");
        /*
        byte[] bytes = new byte[10];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        fis.close();
        */
        byte[] bytes = new byte[1024]; // 1kb
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
