package cn.zskblog.demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo02InputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  14:10                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01InputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("09_IOAndProperties\\b.txt");
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
