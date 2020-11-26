package cn.zskblog.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/****************************************************************************
 * Package:cn.zskblog.datasource.c3p0                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/11  22:49                                
 * Version: 1.0                                                              
 * Description:
 *      C3p0 的演示
*****************************************************************************/

public class C3p0Demo01 {

    public static void main(String[] args) throws SQLException {
        // 1、创建数据库连接对象
        DataSource ds = new ComboPooledDataSource(); // 父类接口指向子类对象（多态）
        // 2、获取连接对象
        Connection conn = ds.getConnection();
        // 3、打印连接对象
        System.out.println(conn);
    }
}
