package cn.zskblog.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/****************************************************************************
 * Package:cn.zskblog.demo01                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/10  21:23                                
 * Version: 1.0                                                              
 * Description:
 *          JDBC 执行 SQL语句 添加一个数据记录
*****************************************************************************/

public class Demo02JDBC_Re {

    public static void main(String[] args) {
        // 提升变量作用域，用以在 finally 中去释放资源
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、定义sql
            String sql = "insert into account values(null, 'wangwu', 3000)";
            // 3、获取conn对象
            conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/db4", "root", "root");
            // 4、获取执行sql的对象
            stmt = conn.createStatement();
            // 5、执行sql
            int count = stmt.executeUpdate(sql);  // 该方法返回受影响行数
            // 6、处理数据
            if (count > 0){
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败！");
            }
        } catch (ClassNotFoundException e) { // 抓取异常
            e.printStackTrace();
        } catch (SQLException e) {  // 抓取异常
            e.printStackTrace();
        } finally {
            // 7、释放资源
            // 避免空指针异常
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
