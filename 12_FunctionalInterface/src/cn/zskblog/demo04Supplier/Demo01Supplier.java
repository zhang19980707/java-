package cn.zskblog.demo04Supplier;

import java.util.function.Supplier;

/****************************************************************************
 * Package:cn.zskblog.demo04Supplier                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/3  09:55                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Supplier {

    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->"胡歌");
        System.out.println(s);
    }
}
