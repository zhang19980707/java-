package cn.zskblog.demo02Set;

import java.util.HashSet;

/****************************************************************************
* Package:cn.zskblog.demo02Set                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  13:54                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

/*
  set集合不允许存储元素重复的原理
 */
public class Demo02HashSetSaveString {

    public static void main(String[] args) {
        // 创建HashSet对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
    
}
