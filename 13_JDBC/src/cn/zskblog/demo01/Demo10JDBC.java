package cn.zskblog.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/****************************************************************************
 * Package:cn.zskblog.demo01                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/11  20:14                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo10JDBC {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");
            // 开启事务
            conn.setAutoCommit(false);
            // 定义SQL语句
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            // 获取 PrepareStatement 对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            // 设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);
            // 执行sql语句
            pstmt1.executeUpdate();
            int i = 3/0;
            pstmt2.executeUpdate();
            // 提交事务
            conn.commit();
        } catch (Exception e) {
            // 出现异常，进行事务回滚
            try {
                if (conn != null){
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                pstmt1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pstmt2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
