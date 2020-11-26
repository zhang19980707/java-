package cn.zskblog.demo04JDK;

import java.util.List;
import java.util.Map;
import java.util.Set;

/****************************************************************************
* Package:cn.zskblog.demo04JDK                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  10:30                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01JDK9 {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d");
        System.out.println(list);

        Set<String> set = Set.of("aaa", "bbb");
        System.out.println(set);

        Map<String, Integer> map = Map.of("张三",18,"李四",19);
        System.out.println(map);

    }
}
