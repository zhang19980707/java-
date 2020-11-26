package cn.zskblog.demo03Sleep;
/****************************************************************************
* Package:cn.zskblog.demo03Sleep                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/26  15:48                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01Sleep {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
