package cn.zskblog.demo04MyException;

import java.util.Scanner;

/****************************************************************************
* Package:cn.zskblog.demo04MyException                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  20:09                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01RegisterException {

    static String[] usernames = {"张三", "李四", "王五"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        checkUserName(username);
    }

    /**
      * Description: 校验用户名
      * Params: String username
      * Return: void
      * Date: 2020/9/25 20:13
    */
    private static void checkUserName(String username) /*throws RegisterException*/{
        for (String name : usernames) {
            if (username.equals(name)){
                try {
                    throw new RegisterException("用户名已存在");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜您，注册成功");
    }
}
