package cn.zskblog.demo04Reader;

import java.io.FileReader;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo04Reader                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  15:57                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Reader {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("09_IOAndProperties\\c.txt");
        int len = 0;
        /*
        while ((len = fr.read())!= -1){
            System.out.println((char)len);
        }
        */
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();

    }
}
