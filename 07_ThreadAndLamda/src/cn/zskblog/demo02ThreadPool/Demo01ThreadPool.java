package cn.zskblog.demo02ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/****************************************************************************
* Package:cn.zskblog.demo02ThreadPool                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/28  17:35                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.shutdown();

    }
}
