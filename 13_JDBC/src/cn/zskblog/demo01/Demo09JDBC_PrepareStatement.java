package cn.zskblog.demo01;

import java.sql.*;
import java.util.Scanner;

/****************************************************************************
 * Package:cn.zskblog.demo01                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/11  10:32                                
 * Version: 1.0                                                              
 * Description:
 *       使用 PrepareStatement 对象优化 login2 案例,防止 SQL 注入
*****************************************************************************/

public class Demo09JDBC_PrepareStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        boolean flag = new Demo09JDBC_PrepareStatement().login2(username, password);
        if (flag){
            System.out.println("登录成功！");
        } else{
            System.out.println("用户名或者密码错误！");
        }
    }

    private boolean login2(String username, String password){
        if (username == null || password == null){
            return false;
        }
        // 提升变量作用域
        Connection conn = null;
//        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        // 1、注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取 Connection 连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
            // 3、定义sql语句
            String sql = "select * from user where username = ? and password = ?";
            // 4、获取 statement 对象
            pstmt = conn.prepareStatement(sql);
            // 给？赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            // 5、执行 SQL 得到查询结果集对象
//            rs = stmt.executeQuery(sql);
            rs = pstmt.executeQuery();
            // 6、判断
            return rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 7、关闭资源
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null){
                try {
                    pstmt.close();
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
        return false;
    }
}
