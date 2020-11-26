package cn.zskblog.demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/****************************************************************************
 * Package:cn.zskblog.demo01TCP                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  09:05                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class TCPServer {

    public static void main(String[] args) throws IOException {
        // 1、创建服务器端 ServerSocket 对象，绑定IP和Port
        ServerSocket server = new ServerSocket(8888);
        // 2、调用 ServerSocket 对象的 accept() 方法获取客户端 socket
        Socket socket = server.accept();
        // 3、使用 socket 对象的 getInputStream() 方法获取网络字节输入流
        InputStream is = socket.getInputStream();
        // 4、读取来自客户端的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        // 5、使用 socket 对象的 getOutputStream() 方法获取网络字节输出流
        OutputStream os = socket.getOutputStream();
        // 6、使用网络字节输出流对象向客户端回写数据
        os.write("服务器已收到数据".getBytes());
        // 7、释放资源
        socket.close();
        server.close();

    }
}
