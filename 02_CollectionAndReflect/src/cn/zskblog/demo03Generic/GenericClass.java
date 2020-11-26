package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  08:23                                
* Version: 1.0                                                              
* Description:
 *        自定义一个含有泛型的类
 *        当不确定使用什么数据类型时可以使用泛型
 *        创建对象时再确定泛型的数据类型(可以是Integer、String。。。。。等类型)
*****************************************************************************/

public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
