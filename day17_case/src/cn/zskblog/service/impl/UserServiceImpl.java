package cn.zskblog.service.impl;

import cn.zskblog.dao.UserDao;
import cn.zskblog.dao.impl.UserDaoImpl;
import cn.zskblog.domain.User;
import cn.zskblog.service.UserService;

import java.util.List;

/****************************************************************************
 * Package:cn.zskblog.service.impl                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/30  09:08                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class UserServiceImpl implements UserService {
    /**
     * 调用dao完成查询
     * @return
     */
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return dao.findall();
    }
}
