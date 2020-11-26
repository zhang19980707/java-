package cn.zskblog.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo05Writer                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  16:34                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("09_IOAndProperties\\f.txt",true);
        for (int i = 0; i < 20; i++) {
            fw.write("你好"+"\r\n");
        }
        fw.close();
    }
}
