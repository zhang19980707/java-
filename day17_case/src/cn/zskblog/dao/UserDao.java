package cn.zskblog.dao;

import cn.zskblog.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {

    public List<User> findall();
}
