package cn.zskblog.demo04Lambda;
/****************************************************************************
* Package:cn.zskblog.demo04Lambda                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  19:05                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Cook {

    public static void main(String[] args) {
        // 使用匿名内部类传递接口，重写抽象方法
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        // 使用lambda表达式写
        invokeCook(()->{                         
            System.out.println("吃饭了");
        });

        // 省略格式
        invokeCook(()->System.out.println("吃饭了"));
    }

    public static void invokeCook(Cook cook){
         cook.makeFood();
    }
}
