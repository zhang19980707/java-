package cn.zskblog.demo03FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/****************************************************************************
 * Package:cn.zskblog.demo02FileUpload                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  10:36                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class TCPServer {

    public static void main(String[] args) throws IOException{
        /* 1、创建服务器socket，设置accept接收客服端socket */
        try (ServerSocket server = new ServerSocket(8888)) {
        /*
          使用多线程优化
         */
            new Thread(() -> {
                try {
                    while (true) {
                        Socket socket = server.accept();
                        // 2、获取网络字节输入流接收数据
                        InputStream is = socket.getInputStream();
                        // 3、判断并创建服务器端upload文件夹
                        File path = new File("11_Net\\upload");
                        if (!path.exists()) {
                            boolean b = path.mkdir();
                            System.out.println(b);
                        }
                        // 设置服务器端存储文件的名称形式   域名 + 毫秒值 + 随机数
                        String FileName = "zskbolg" + System.currentTimeMillis()
                                + new Random().nextInt() + ".png";
                        // 4、创建服务器本地文件输出流，往upload写文件
                        FileOutputStream fos = new FileOutputStream(path +
                                "\\" +
                                FileName);
                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1)
                            fos.write(bytes, 0, len);
                        // 5、创建网络字节输出流给客户端会送信息
                        OutputStream os = socket.getOutputStream();
                        os.write("文件已上传".getBytes());
                        socket.shutdownOutput();  //  禁用此输出流套接字
                        // 6、释放资源，
                        fos.close();
                        socket.close(); // 关闭接收到的客户端socket
                    }
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }).start();
        }
    }
}
