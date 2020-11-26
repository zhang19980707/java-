package cn.zskblog.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/****************************************************************************
 * Package:cn.zskblog.datasource.druid                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/11  23:10                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class DruidDemo01 {

    public static void main(String[] args) throws Exception {
        // 1、导入jar包
        // 2、定义配置文件
        // 3、加载配置文件
        Properties pro = new Properties();
        InputStream is = DruidDemo01.class.getClassLoader()
                .getResourceAsStream("druid.properties");
        pro.load(is);
        // 4、获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        // 5、获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }
}
