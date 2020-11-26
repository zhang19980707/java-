package cn.zskblog.demo01WaitAndNotify;
/****************************************************************************
* Package:cn.zskblog.demo01WaitAndNotify                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  16:56                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class ChiHuo extends Thread{

    private BaoZi bz;


    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "包子！");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把" + bz.pi + bz.xian + "包子吃完了，通知包子铺");
                System.out.println("========================");

            }
        }
    }
}
