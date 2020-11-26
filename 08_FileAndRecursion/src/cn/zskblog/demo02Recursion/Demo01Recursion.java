package cn.zskblog.demo02Recursion;
/****************************************************************************
* Package:cn.zskblog.demo02Recursion                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  21:50                                
* Version: 1.0                                                              
* Description:
 *          递归求解1-n的和
*****************************************************************************/

public class Demo01Recursion {

    public static void main(String[] args) {
        int sum = calc(10000);
        System.out.println(sum);
    }
    
    /**
     * Description: 使用递归 求解
     * Params: n
     * Return: void
     * Date: 2020/9/28 21:51
     */
    private static int calc(int n) {
        if (n==1){
            return n;
        } else{
            return n + calc(n-1);
        }
    }
}
