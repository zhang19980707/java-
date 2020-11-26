package cn.zskblog.demo01Exception;
/****************************************************************************
* Package:cn.zskblog.demo01Exception                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  15:21                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {9, 8, 6};
        getElement(arr, 3);
    }

    private  static void getElement(int[] arry, int index){
        int ele = arry[index];
        System.out.println(ele);
    }
}
