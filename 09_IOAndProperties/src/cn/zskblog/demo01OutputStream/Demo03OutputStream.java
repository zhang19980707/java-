package cn.zskblog.demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo01OutputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  13:50                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo03OutputStream {

    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("09_IOAndProperties\\c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes() );
            fos.write("\r\n".getBytes());  // 换行，windows：\r\n    linux:\n    mac: \r
        }
        fos.close();
    }
}
