package cn.zskblog.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

/****************************************************************************
* Package:cn.zskblog.demo05Collections                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  15:29                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Collections {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");// 添加多个元素到集合
        System.out.println(list);
        Collections.shuffle(list); // 打乱集合元素顺序
        System.out.println(list);
    }
}
