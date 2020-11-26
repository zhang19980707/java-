package cn.zskblog.demo06TryException;

import java.io.FileWriter;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.demo06TryException                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  13:03                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01TryException {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("09_IOAndProperties\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
