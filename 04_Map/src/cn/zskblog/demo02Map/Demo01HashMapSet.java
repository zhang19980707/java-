package cn.zskblog.demo02Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/****************************************************************************
* Package:cn.zskblog.demo02Map                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  06:52                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01HashMapSet {

    public static void main(String[] args) {
        HashMap<String, Person> map01 = new HashMap<>();
        // 往 map01 中添加元素
        map01.put("北京", new Person("张三", 18));
        map01.put("上海", new Person("李四", 19));
        map01.put("广州", new Person("王五", 20));
        map01.put("北京", new Person("赵六", 18));
        System.out.println(map01);
        Set<String> set = map01.keySet();
        for (String key : set) {
            Person value = map01.get(key);
            System.out.println("value：" + value);
        }
        System.out.println("=======================");

        HashMap<Person, String> map02 = new HashMap<>();
        map02.put(new Person("女王", 18), "英国");
        map02.put(new Person("女王", 19), "法国");
        map02.put(new Person("女王", 18), "美国");
        map02.put(new Person("国王", 20), "英国");
        Set<Map.Entry<Person, String>> entries = map02.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "----->" + value);
        }
    }
}

