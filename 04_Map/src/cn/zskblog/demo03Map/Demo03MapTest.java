package cn.zskblog.demo03Map;

import java.util.HashMap;
import java.util.Scanner;

/****************************************************************************
* Package:cn.zskblog.demo03Map                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  10:14                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03MapTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                Integer value = map.get(aChar);
                value++;
                map.put(aChar, value);
            } else {
                map.put(aChar, 1);
            }
        }
        System.out.println(map);
    }
}
