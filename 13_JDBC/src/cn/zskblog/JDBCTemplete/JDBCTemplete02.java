package cn.zskblog.JDBCTemplete;

import cn.zskblog.datasource.druid.DruidDemo01;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/****************************************************************************
 * Package:cn.zskblog.JDBCTemplete                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/12  09:34                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class JDBCTemplete02 {
    /* 使用Junit单元测试各项功能函数 */

    /**
     * Description: 使用druid获取数据库连接池的方法
     * Params:
     * Return:
     * Date: 2020/10/12 上午 09:49
     */
    public JdbcTemplate getDatasource(){
        // 1、导入jar包
        // 2、创建jdbcTemplete对象
        Properties pro = new Properties();
        InputStream is = DruidDemo01.class.getClassLoader()
                .getResourceAsStream("druid.properties");
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4、获取连接池对象
        DataSource ds = null;
        try {
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 5、获取连接
        JdbcTemplate templete = new JdbcTemplate(ds);
        return templete;
    }
    // 获取JdbcTemplate对象
    private JdbcTemplate template = getDatasource();

    /**
     * Description:  1、 修改数据
     * Params:
     * Return:
     * Date: 2020/10/12 上午 09:38
     */
    @Test // 测试注解
    public void update_data(){
        // 定义sql语句
        String sql = "update account set balance = 2500 where id = ?";
        // 执行sql
        int count = template.update(sql, 3);
        System.out.println(count);
    }

    /**
      * Description:  2、添加一条记录
      * Params: 
      * Return: 
      * Date: 2020/10/12 上午 09:39
    */
    @Test
    public void insert_data(){
        // 定义sql
        String sql = "insert into account values(?,?,?)";
        int count = template.update(sql,5,"zhaosi",1500);
        System.out.println(count);
    }

    /**
      * Description:  3、删除数据库中的一条记录
      * Params: 
      * Return: 
      * Date: 2020/10/12 上午 09:58
    */
    @Test
    public void delete_data(){
        // 定义sql语句
        String sql = "delete from account where id = ?";
        int count = template.update(sql, 5);
        System.out.println(count);
    }

    /**
      * Description: 4、 查询id为1的记录，结果封装为map集合，该方法的查询结果只能是1条记录
      * Params:
      * Return:
      * Date: 2020/10/12 上午 10:04
    */
    @Test
    public void select_data_id1(){
        // 定义sql
        String sql = "select * from account where id = ?";
        // 执行sql
        // queryForMap 方法把查询结果集封装成map集合
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map); // {id=1, name=zhangsan, balance=1000}
    }

    /**
      * Description: 5、 将查询结果的每一条记录封装成 map 集合 再装到 list 集合
      * Params:
      * Return:
      * Date: 2020/10/12 上午 10:10
    */
    @Test
    public void select_data_forlist(){
        String sql = "select * from account";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> smpo : list) {
            System.out.println(smpo);
        }
    }

    /**
      * Description: 7 、查询总记录数
      * Params: 
      * Return: 
      * Date: 2020/10/12 上午 10:20
    */
    @Test
    public void select_count(){
        String sql = "select count(id) from account";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
    
}
