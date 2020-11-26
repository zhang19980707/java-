package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  08:57                                
* Version: 1.0                                                              
* Description:
 *        含有泛型的接口的第 1 种使用方式：定义接口实现类
*****************************************************************************/

public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
