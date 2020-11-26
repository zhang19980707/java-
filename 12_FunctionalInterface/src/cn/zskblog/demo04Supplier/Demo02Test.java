package cn.zskblog.demo04Supplier;

import java.util.function.Supplier;

/****************************************************************************
 * Package:cn.zskblog.demo04Supplier                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/3  10:00                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02Test {
    // 定义一个方法用来返回最大值元素
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型数组
        int[] arr = {100, 0, -50, 88, 99, 33, -30};
        // 调用 getMax() 方法传递lambda表达式，定义比较方法，返回 max 并接收
        int maxvalue = getMax(()->{
            // 获取数组最大值，并返回
            int max = arr[0];
            // 遍历arr数组
            for (int i : arr) {
                if (i > max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中元素最大值是：" + maxvalue);
    }
}
