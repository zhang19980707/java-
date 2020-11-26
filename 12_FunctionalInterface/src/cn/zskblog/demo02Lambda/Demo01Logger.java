package cn.zskblog.demo02Lambda;
/****************************************************************************
 * Package:cn.zskblog.demo02Lambda                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  19:11                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Logger {

    private static void showlog(int leval, String message){
        if (leval == 1){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        String mess1 = "Hello";
        String mess2 = "Java";
        String mess3 = "World";
        showlog(1,mess1+mess2+mess3);
    }
}
