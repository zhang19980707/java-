package cn.zskblog.demo05Consumer;

import java.util.function.Consumer;

/****************************************************************************
 * Package:cn.zskblog.demo05Consumer                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/3  10:32                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Consumer {
    // 定义一个方法，第一个参数用 String name，第二个参数用 Consumer<String> con
    // Consumer接口泛型是什么类型，accept就可以接收什么类型数据
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        // 调用method() 方法，传递字符串姓名，另一个参数时一个Consumer接口，可以传递Lambda表达式
        method("赵丽颖", (String name)->{
            // 对字符串进行消费
            System.out.println(name);
            // 把字符串反转输出
            String rename = new StringBuilder(name).reverse().toString(); // 链式编程
            System.out.println(rename);
        });
    }
}
