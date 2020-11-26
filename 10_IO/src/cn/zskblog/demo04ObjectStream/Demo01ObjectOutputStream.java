package cn.zskblog.demo04ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/****************************************************************************
 * Package:cn.zskblog.demo04ObjectStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  20:01                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01ObjectOutputStream {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("10_IO\\Person.txt"));
        // 以字节形式将对象 object 写入文件
        oos.writeObject(new Person("张三", 18));
    }
}
