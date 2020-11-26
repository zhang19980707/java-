package cn.zskblog.demo04VarArgs;
/****************************************************************************
* Package:cn.zskblog.demo04VarArgs                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  15:14                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01VarArgs {

    public static void main(String[] args) {
        add();
        add(10, 20, 30);

    }

    public static int add(int...arr){
        /*
        System.out.println(arr); // [I@50cbc42f 底层是一个数组
        System.out.println(arr.length);
        */
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
