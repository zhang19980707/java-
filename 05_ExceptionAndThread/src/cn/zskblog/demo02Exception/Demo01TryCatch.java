package cn.zskblog.demo02Exception;

import java.io.IOException;

/****************************************************************************
* Package:cn.zskblog.demo02Exception                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  16:24                                
* Version: 1.0                                                              
* Description:
*****************************************************************************/

public class Demo01TryCatch {

    public static void main(String[] args) {
        try {
            readfile("C:\\a.tx");
        } catch (IOException e){
            System.out.println("捕获到IO异常");
            // System.out.println(e); // java.io.IOException: 文件格式不正确
            // System.out.println(e.getMessage()); // 捕获到IO异常
            e.printStackTrace();

        }
        System.out.println("执行异常之后的代码");

    }

    private static void readfile(String filename) throws IOException {
        if (!filename.endsWith(".txt")){
            throw new IOException("文件格式不正确");
        }
        System.out.println("没有发生异常，格式正确，开始读取");

    }
}
