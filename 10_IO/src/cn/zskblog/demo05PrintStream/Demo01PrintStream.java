package cn.zskblog.demo05PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/****************************************************************************
 * Package:cn.zskblog.demo05PrintStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  21:03                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("hello world");
        PrintStream ps = new PrintStream("10_IO\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}
