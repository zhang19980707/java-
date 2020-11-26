package cn.zskblog.JDBCTemplete;

import cn.zskblog.datasource.druid.DruidDemo01;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/****************************************************************************
 * Package:cn.zskblog.JDBCTemplete                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/12  09:14                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class JdbcTemplete01 {
    public static void main(String[] args) throws Exception {
        // 1、导入jar包
        // 2、创建jdbcTemplete对象
        Properties pro = new Properties();
        InputStream is = DruidDemo01.class.getClassLoader()
                .getResourceAsStream("druid.properties");
        pro.load(is);
        // 4、获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        // 5、获取连接
        JdbcTemplate templete = new JdbcTemplate(ds);
        // 6、定义SQL语句
        String sql = "update account set balance = 500 where id = ?";
        int count = templete.update(sql, 2);
        System.out.println(count);
    }
}
