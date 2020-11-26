package cn.zskblog.demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/****************************************************************************
 * Package:cn.zskblog.demo01TCP                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  08:51                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class TCPClient {

    public static void main(String[] args) throws IOException {
        // 1、创建客户端对象,绑定本机地址
        Socket socket = new Socket("127.0.0.1",8888);
        // 2、使用 socket 的 getOutputStream() 方法创建网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        // 3、使用网络字节输出流对象的 write() 方法向服务器发送数据
        os.write("你好，服务器".getBytes());
        // 4、 使用 socket 的 getInputStream() 方法创建网络字节输入流对象
        InputStream is = socket.getInputStream();
        // 5、使用网络字节输入流对象的 read() 方法读取数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        // 6、关闭套接字 socket 对象
        socket.close();
    }
}
