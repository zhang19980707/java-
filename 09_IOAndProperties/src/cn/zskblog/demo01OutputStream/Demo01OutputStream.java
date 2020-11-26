package cn.zskblog.demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo01OutputStream
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com
 * Created: 2020/9/29  13:14                                
 * Version: 1.0                                                              
 * Description:
*****************************************************************************/

public class Demo01OutputStream {

    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("09_IOAndProperties\\a.txt"));
        fos.write(48);
        fos.close();
    }

}
