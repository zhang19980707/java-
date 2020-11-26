package cn.zskblog.demo06TryException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo06TryException                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  09:59                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02JDK7 {

    public static void main(String[] args) {
        try( //创建字节输入流对象，构造方法中绑定数据源
             FileInputStream fis = new FileInputStream("09_IOAndProperties\\g.txt");
             FileOutputStream fos = new FileOutputStream("09_IOAndProperties\\h.txt");){
             int len = 0;
             while ((len = fis.read()) != -1){
                 fos.write(len);
                }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
