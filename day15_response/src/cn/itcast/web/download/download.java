package cn.itcast.web.download;

import cn.itcast.web.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // 1、获取请求参数（文件名称）
        String filename = request.getParameter("filename");
        // 2、使用字节输入输入流加载文件到内存
        // 2.1、找到文件的服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        // 2.2、用字节流关联
        FileInputStream fis = new FileInputStream(realPath);

        // 3、设置response响应头
        // 3.1、设置context-type类型响应头
        String mimeType = servletContext.getMimeType(filename); // 获取文件mime类型
        response.setHeader("context-type", mimeType);
        // 3.2、设置打开方式context-disposition响应头
        response.setHeader("context-disposition", "attachment; filename=" + filename);

        // 解决中文文件名问题
        // 1、获取user-agent请求头
        String agent = request.getHeader("user-agent");
        // 2、使用工具类方法设置编码格式
        String newfilename = DownLoadUtils.getFileName(agent, filename);
        response.setHeader("context-disposition", "attachment; filename=" + newfilename);

        // 4、将输入流数据写出到输出流中
        ServletOutputStream sos = response.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while ((len = fis.read(buff)) != -1){
            sos.write(buff, 0 , len);
        }
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doPost(request, response);
    }
}
