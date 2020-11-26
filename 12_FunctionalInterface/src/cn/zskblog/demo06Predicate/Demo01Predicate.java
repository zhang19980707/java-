package cn.zskblog.demo06Predicate;

import java.util.function.Predicate;

/****************************************************************************
 * Package:cn.zskblog.demo06Predicate                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/5  21:17                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Predicate {

    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "abcde";
        boolean b = checkString(s, str->str.length() > 5);
        System.out.println(b);
    }
}
