package cn.zskblog.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/****************************************************************************
 * Package:cn.zskblog.web.listener                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/11/03  20:52                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class ContextLoaderListenner implements ServletContextListener {
    /**
      * Description: 监听ServletContext对象的，该对象服务器后自动创建
      * Params:
      * Return:
      * Date: 2020/11/03 下午 08:57
    */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 加载资源文件
        // 1、获取ServletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();
        // 2、加载资源文件
        String contextConfigLocation = servletContext.getInitParameter
                ("contextConfigLocation");
        // 3、获取真实路径
        String realPath = servletContext.getRealPath(contextConfigLocation);
        // 4、加载进内存
        try {
            FileInputStream fis = new FileInputStream(realPath);
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("ServletContext对象创建了。。。。");
    }

    /**
      * Description: 在服务器正常关闭后，该方法被执行
      * Params:
      * Return:
      * Date: 2020/11/03 下午 08:59
    */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁。。。。。");
    }
}
