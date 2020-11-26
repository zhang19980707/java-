package cn.zskblog.demo05PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/****************************************************************************
 * Package:cn.zskblog.demo05PrintStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  21:06                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("在控制台输出");
        PrintStream ps = new PrintStream("10_IO\\目的地是打印流.txt");
        System.setOut(ps);
        System.out.println("在打印流目的地中输出");

        ps.close();
    }
}
