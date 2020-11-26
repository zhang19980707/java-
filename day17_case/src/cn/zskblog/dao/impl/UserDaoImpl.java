package cn.zskblog.dao.impl;

import cn.zskblog.dao.UserDao;
import cn.zskblog.domain.User;
import cn.zskblog.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/****************************************************************************
 * Package:cn.zskblog.dao.impl                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/30  09:11                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findall() {
        // 使用JDBC操作数据库
        // 1、定义sql
        String sql = "select * from user";
        // 2、使用template
        List<User> users = template.query(sql, new
                BeanPropertyRowMapper<User>(User.class));
        return users;
    }
}
