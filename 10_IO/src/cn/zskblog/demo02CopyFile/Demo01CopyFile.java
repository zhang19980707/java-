package cn.zskblog.demo02CopyFile;

import java.io.*;

/****************************************************************************
 * Package:cn.zskblog.demo02InputStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/29  15:29                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01CopyFile {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\1.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin" +
                "\\Desktop\\103.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=bis.read(bytes)) != -1){
             bos.write(bytes,0,len);
        }
        bos.close(); // 先关闭写的bos
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println("程序用时：" + (end - start) + "毫秒");
        // 程序用时：8毫秒
    }
}
