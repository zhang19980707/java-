package cn.zskblog.demo03LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/****************************************************************************
 * Package:cn.zskblog.demo03LambdaTest                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/3  09:32                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02Comparator {

    public static Comparator<String> getComparator(){
        // 方法返回值是一个接口,那么可以返回接口的匿名内部类
        /*
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 降序排序
                return o2.length() - o1.length();
            }
        };
        */
        // 返回值是一个函数式接口,使用lambda表达式优化方法返回值
        return (o1, o2)-> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbbbbb", "c"};
        // 输出排序前的字符串数组
        System.out.println(Arrays.toString(arr));
        // 调用方法对数组降序排序
        Arrays.sort(arr, getComparator());
        // 排序后的数组
        System.out.println(Arrays.toString(arr));

    }
}
