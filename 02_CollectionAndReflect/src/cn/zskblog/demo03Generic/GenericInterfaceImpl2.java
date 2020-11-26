package cn.zskblog.demo03Generic;
/****************************************************************************
* Package:cn.zskblog.demo03Generic                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/19  09:07                                
* Version: 1.0                                                              
* Description:
 *      含有泛型接口的第 2 种使用方法：实现类和接口使用同一种泛型，创建对象时再指定泛型
*****************************************************************************/

public class GenericInterfaceImpl2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
