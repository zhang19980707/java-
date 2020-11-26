package cn.zskblog.demo01WaitAndNotify;
/****************************************************************************
* Package:cn.zskblog.demo01WaitAndNotify                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  16:41                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class BaoZiPu extends Thread{

    private BaoZi bz;

    // 使用构造方法，传递参数
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                // 判断包子状态
                if (bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0){
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "的包子！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产好了" + bz.pi + bz.xian + "包子，吃货开始开始吃了");
            }
        }

    }
}
