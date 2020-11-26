package cn.zskblog.demo01Map;

import java.util.HashMap;
import java.util.Map;

/****************************************************************************
* Package:cn.zskblog.demo01Map                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  19:29                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Map {

    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

     /**
        * Description: 测试 Map类 的 put() 方法
        * Params: []
        * Return: void
        * Date: 2020/9/24 19:47
        */
    private static void show01() {
        // 创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();
        map.put("李晨", "范冰冰1");
//        map.put("李晨", "范冰冰2"); // 重复的key会被重新赋值
        map.put("赵丽颖", "范冰冰1");
        System.out.println(map);
    }

    /**
      * Description: 测试 Map类 中的 remove() 方法
      * Params: []
      * Return: void
      * Date: 2020/9/24 19:50
    */
    private static void show02(){
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 178);
        map.put("杨颖", 158);
        System.out.println(map);
        Integer v1 = map.remove("杨颖");
        System.out.println(v1);
        System.out.println(map);
    }

    /**
      * Description: 测试 Map类 中的 get() 方法
      * Params: []
      * Return: void
      * Date: 2020/9/24 19:51
    */
    private static void show03(){
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 178);
        map.put("杨颖", 158);
        Integer v2 = map.get("杨颖");
        System.out.println(v2);
        Integer v1 = map.get("林志颖"); // 使用包装类Integer接收返回值防止空指针异常
        System.out.println(v1);  // null
    }

    /**
      * Description: 测试 Map类 中的 constainsKey() 和 constainsValue() 方法
      * Params: []
      * Return: void
      * Date: 2020/9/24 19:56
    */
    private static void show04(){
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("林志玲", 178);
        map.put("杨颖", 158);
        System.out.println(map.containsKey("赵丽颖"));
        System.out.println(map.containsKey("张靓颖"));
        System.out.println(map.containsValue("178"));
        System.out.println(map.containsValue("190"));
    }
}
