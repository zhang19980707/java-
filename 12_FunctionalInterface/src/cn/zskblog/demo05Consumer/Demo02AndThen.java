package cn.zskblog.demo05Consumer;

import java.util.function.Consumer;

/****************************************************************************
 * Package:cn.zskblog.demo05Consumer                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/4  20:50                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02AndThen {

    public static void method(String s, Consumer<String> con1, Consumer<String> con2){
      /*  con1.accept(s);
        con2.accept(s);*/
      con1.andThen(con2).accept(s); // 使用 andThen() 方法，先消费 con1 然后 con2
    }
    
    public static void main(String[] args) {
        method("hello",
                (t)->System.out.println(t.toUpperCase()),
                (t)->System.out.println(t.toLowerCase())
        );
    }
}
