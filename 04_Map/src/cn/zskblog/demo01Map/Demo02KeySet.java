package cn.zskblog.demo01Map;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/****************************************************************************
* Package:cn.zskblog.demo01Map                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  20:01                                
* Version: 1.0                                                              
* Description:
 *          Map集合 的第一种遍历方式：通过 Key 找 Value
 *            利用 while 配合 迭代器 遍历
 *            利用增强 for 遍历
*****************************************************************************/

public class Demo02KeySet {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 178);
        map.put("杨颖", 158);
        Set<String> set = map.keySet();
        /*
          使用迭代器遍历 Map 集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            Integer v = map.get(it.next());
            System.out.println(v);
        }
        */
        // 使用增强 for 循环遍历
        for (String key : set) {
            Integer v = map.get(key);
            System.out.println(v);
        }
    }
}
