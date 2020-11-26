package cn.zskblog.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo05Writer                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  16:19                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\java_learn\\shungyuan" +
                "\\09_IOAndProperties\\e.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
