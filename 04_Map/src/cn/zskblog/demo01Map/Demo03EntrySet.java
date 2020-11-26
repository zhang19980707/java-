package cn.zskblog.demo01Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/****************************************************************************
* Package:cn.zskblog.demo01Map                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  06:27                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03EntrySet {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 178);
        map.put("杨颖", 158);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
