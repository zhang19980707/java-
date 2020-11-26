package cn.zskblog.demo03FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/****************************************************************************
 * Package:cn.zskblog.demo02FileUpload                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  10:29                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class TCPClient {

    public static void main(String[] args) throws IOException {
        // 1、创建用于连接的socket对象
        Socket socket = new Socket("127.0.0.1",8888);
        // 2、获取网络字节输出流用以发送数据
        OutputStream os = socket.getOutputStream();
        // 3、创建本地文件输入流，读取本地文件，并传给服务器
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\2.png");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            // 4、读取到的文件直接写入网络字节输出流
            os.write(bytes,0,len);
        }
        socket.shutdownOutput(); // 禁用此输出流套接字
        // 5、创建网络字节输入流，读取Server传回来的数据
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        // 6、释放资源
        fis.close();
        socket.close();

    }
}
