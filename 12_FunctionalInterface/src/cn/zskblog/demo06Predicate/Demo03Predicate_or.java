package cn.zskblog.demo06Predicate;

import java.util.function.Predicate;

/****************************************************************************
 * Package:cn.zskblog.demo06Predicate                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/5  21:29                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo03Predicate_or {

    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(s) || pre2.test(s);   一个成立就返回true
        return pre1.or(pre2).test(s);  // or 方法的使用，等价于上一行代码
    }

    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s,str->str.length() > 5, str->str.contains("a"));
        System.out.println(b);
    }
}
