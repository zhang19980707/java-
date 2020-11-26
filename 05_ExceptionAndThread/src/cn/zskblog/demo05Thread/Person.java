package cn.zskblog.demo05Thread;
/****************************************************************************
* Package:cn.zskblog.demo05Thread                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  20:59                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + "----->" + i);
        }
    }
}
