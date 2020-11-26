package cn.zskblog.demo01Object;
/****************************************************************************
* Package:cn.zskblog.demo01Object                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/17  16:05                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02Equals {

    public static void main(String[] args) {
        /*
         所有的类默认继承Object类
         类中的obj1.equals(obj2)方法用来比较两个对象：
               数值型：比较两对象的数值
               引用类型：比较两对象的地址
         */
        /*
         子类重写Object类中的equals()方法后
         类中的equals()方法用来比较两对象的属性
         */
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("古力娜扎",19);
        System.out.println("p1" + p1);
        System.out.println("p2" + p2);

        System.out.println(p1.equals(p2));
    }
}
