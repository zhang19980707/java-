package cn.zskblog.demo01;

import java.sql.*;

/****************************************************************************
 * Package:cn.zskblog.demo01                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/10  22:16                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo06JDBC_ResultSet {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rst = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取 Connection 连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");
            //3、定义sql语句
            String sql = "SELECT * FROM account";
            // 4、获取 Statement 对象
            stmt = conn.createStatement();
            // 5、执行 SQl 语句，返回结果集 ResultSet 对象
            rst = stmt.executeQuery(sql);
            // 6、处理数据。
            // 6.1、游标向下移动一行（游标默认在第一行数据之前）
            // 判断是否还有数据行
            while (rst.next()){
                // 6.2、获取数据
                int id = rst.getInt(1);
                String name = rst.getString("name");
                double balance = rst.getDouble(3);

                System.out.println(id + "----->" + name + "------>" + balance);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 7、释放资源
            if (rst != null){  // 关闭结果集对象
                try {
                    rst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){ // 关闭执行 sql 的 statement 对象
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){ // 关闭 conn 连接对象
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
