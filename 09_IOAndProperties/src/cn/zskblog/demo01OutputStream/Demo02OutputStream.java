package cn.zskblog.demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/****************************************************************************
 * Package:cn.zskblog.demo01OutputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  13:14                                
 * Version: 1.0                                                              
 * Description:
 *      FileOutputStream类 : 将内存中的数据写入到文件中
*****************************************************************************/

public class Demo02OutputStream {

    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("09_IOAndProperties\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes)); // [-28, -67, -96, -27, -91, -67]
        fos.write(bytes);
        fos.close();
    }
}
