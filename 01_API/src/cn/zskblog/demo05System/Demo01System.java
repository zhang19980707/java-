package cn.zskblog.demo05System;

import java.util.Arrays;

/****************************************************************************
 * Package:cn.zskblog.demo05System
 * Author:ZhangShiKang
 * Email: 845664960@qq.com
 * Created_at_data:2020/9/16  16:26                             
 * Version: 1.0    
 * Description:                                                     
 *****************************************************************************/

public class Demo01System {

    public static void main(String[] args) {
//        demo01Map();
        demo02();
    }

     /**
        * Description: demo06Lambda
        * Params: []
        * Return: void
        * Date: 2020/9/16 17:45
        */
    private static void demo01() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行用了" + (end - start) + "毫秒");  //程序运行用了392毫秒
    }
    
     /**
        * Description: demo02: System.arraycopy()方法
        * Params: src--原数组；  srcPos--源数组起始位置； dest--目标数组；  destPos--目标数组起始位置；   length--要复制数组元素数量
        * Return: void
        * Date: 2020/9/16 19:54
        */
    private static void demo02(){
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前" + Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后" + Arrays.toString(dest));
    }
}

