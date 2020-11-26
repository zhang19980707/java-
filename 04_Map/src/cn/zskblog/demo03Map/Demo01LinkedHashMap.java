package cn.zskblog.demo03Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/****************************************************************************
* Package:cn.zskblog.demo03Map                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  09:30                                
* Version: 1.0                                                              
* Description:
 *          LinkedHashMap集合中元素是按照 put 进去的顺序有序排放的
*****************************************************************************/

public class Demo01LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> Lmap = new LinkedHashMap<>();
        Lmap.put(1, 21);
        Lmap.put(3, 21);
        Lmap.put(2, 21);
        Lmap.put(7, 21);
        Set<Map.Entry<Integer, Integer>> entries = Lmap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "---->" + value);
        }

    }
}
