package cn.zskblog.demo01Exception;
/****************************************************************************
* Package:cn.zskblog.demo01Exception                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  15:33                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03Throw {

    public static void main(String[] args) {
        int[] arr = {9, 7, 5};
        getElement(arr, 2);
    }

    private static void getElement(int[] arry, int index) {
         if (arry == null){
             // 抛出异常给JVM虚拟机
             throw new NullPointerException("传入的数组为空指针");
         }
         if (index < 0 || index > arry.length){
             throw new ArrayIndexOutOfBoundsException("越界异常");
         }
         int ele = arry[index];
        System.out.println(ele);
    }
}
