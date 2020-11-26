package cn.zskblog.demo05Consumer;

import java.util.function.Consumer;

/****************************************************************************
 * Package:cn.zskblog.demo05Consumer                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/4  21:00                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo03Test {
     public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
         for (String s : arr) {
             con1.andThen(con2).accept(s); // 消费传入的字符串
         }
     }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴, 女", "古力娜扎, 女", "巴尔扎哈, 男"};
        printInfo(arr, (s)->{
            String name = s.split(",")[0];
            System.out.print("姓名:" + name);
        }, (s)->{
            String sex = s.split(",")[1];
            System.out.println("性别:" + sex);
        });
    }
}
