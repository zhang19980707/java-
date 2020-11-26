package cn.zskblog.demo06StringBuilder;
/****************************************************************************
* Package:cn.zskblog.demo06StringBuilder                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/16  20:58                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class demo02StringBuilder {

    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder bu = new StringBuilder();

        // 使用append方法往StringBuilder对象中添加数据
        bu.append("abc");
        bu.append(true);
        bu.append(8.8);
        bu.append("中");
        System.out.println(bu);

        // 链式编程法则
        bu.append(1).append("中国").append(120000L);
        System.out.println(bu);
    }
}
