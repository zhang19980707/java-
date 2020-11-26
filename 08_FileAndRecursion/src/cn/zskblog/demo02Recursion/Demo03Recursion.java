package cn.zskblog.demo02Recursion;
/****************************************************************************
* Package:cn.zskblog.demo02Recursion                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/29  10:06                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo03Recursion {

    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    private static int jc(int num) {
        if (num==1) {
            return 1;
        }
        return num * jc(num-1);
    }
}
