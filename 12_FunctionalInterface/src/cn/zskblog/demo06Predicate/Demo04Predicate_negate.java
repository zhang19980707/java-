package cn.zskblog.demo06Predicate;

import java.util.function.Predicate;

/****************************************************************************
 * Package:cn.zskblog.demo06Predicate                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/5  21:30                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo04Predicate_negate {

    public static boolean checkString(String s, Predicate<String> pre){
//        return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";
        boolean b = checkString(s, str->str.length() > 5);
        System.out.println(b);
    }
}
