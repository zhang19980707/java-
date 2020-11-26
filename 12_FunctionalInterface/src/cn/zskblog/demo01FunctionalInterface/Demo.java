package cn.zskblog.demo01FunctionalInterface;
/****************************************************************************
 * Package:cn.zskblog.demo01FunctionalInterface                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  18:53                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo {
    // 定义一个方法，参数使用函数式接口MyFunctionalInterface
    private static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        // 1、通过接口实现类使用接口，传递接口实现类
        show(new MyFunctionalInterfaceIMPL());

        // 2、通过匿名内部类使用接口,重写接口中的方法
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现接口");
            }
        });

        //  3、使用Lambda表达式使用接口
        show(()->{
            System.out.println("使用Lambda表达式使用接口");
        });

        // 4、简化Lambda方法
        show(()-> System.out.println("使用简化Lambda方法使用接口"));

    }
}
