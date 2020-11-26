package cn.zskblog.demo01FunctionalInterface;
/****************************************************************************
 * Package:cn.zskblog.demo01FunctionalInterface                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  18:47                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class MyFunctionalInterfaceIMPL implements MyFunctionalInterface {
    @Override
    public void method() {
        System.out.println("接口实现类使用接口");
    }
}