package cn.zskblog.demo01WaitAndNotify;
/****************************************************************************
* Package:cn.zskblog.demo01WaitAndNotify                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  16:39                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo {

    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
