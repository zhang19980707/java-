package cn.zskblog.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/****************************************************************************
 * Package:cn.zskblog.demo01                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/10  21:46                                
 * Version: 1.0                                                              
 * Description:
 *    JDBC 执行 SQL语句 更新一个数据记录
*****************************************************************************/

public class Demo03JDBC {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取 Connection 连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");
            //3、定义sql语句
            String sql = "update account set balance = 1500 where id = 3";
            // 4、获取 Statement 对象
            stmt = conn.createStatement();
            // 5、执行 SQl 语句
            int count = stmt.executeUpdate(sql);
            // 6、处理数据。
            if (count > 0 ){
                System.out.println("更改成功！");
            } else {
                System.out.println("更改失败！");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 7、释放资源
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
