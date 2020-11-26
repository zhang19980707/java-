package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  08:42                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03GenericMethod {

    public static void main(String[] args) {
        // 实例化泛型对象，调用实例化对象的泛型方法
        GenericMethod gm = new GenericMethod();
        gm.method01("张三");
        gm.method01(1);
        gm.method01(123);

        // 调用泛型静态方法
        GenericMethod.method02("王五");
        GenericMethod.method02(1);
    }
}
