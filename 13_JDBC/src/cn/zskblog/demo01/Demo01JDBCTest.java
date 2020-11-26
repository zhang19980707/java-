package cn.zskblog.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/****************************************************************************
 * Package:cn.zskblog.demo01                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/10  14:16                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01JDBCTest {

    public static void main(String[] args) throws Exception {
        // 1、导入驱动jar包
        // 2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");  // 5.0 以后的版本的包可以省略注册步骤
        // 3、获取数据库连接对象
        Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/db4", "root", "root");
        // 4、定义sql语句
        String sql = "update account set balance = 200 where id = 2";
        // 5、获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        // 6、执行sql
        int i = stmt.executeUpdate(sql);
        // 7、处理结果
        System.out.println(i);
        // 8、释放资源
        stmt.close();
        conn.close();
    }
}
