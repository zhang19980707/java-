package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  08:40                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class GenericMethod {

     /**
        * Description: 含有泛型的实例方法
        * Params: 泛型
        * Return: []
        * Date: 2020/9/19 08:49
        */
    public <M> void method01(M m){
        System.out.println(m);
    }

     /**
        * Description: 使用泛型的静态方法，推荐使用类名.方法名调用
        * Params: 泛型
        * Return: []
        * Date: 2020/9/19 08:50
        */
    public static <M> void method02(M m){
        System.out.println(m);
    }
}
