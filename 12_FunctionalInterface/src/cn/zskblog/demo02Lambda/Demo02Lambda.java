package cn.zskblog.demo02Lambda;
/****************************************************************************
 * Package:cn.zskblog.demo02Lambda                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/1  19:20                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/
/*
   使用Lambda优化Logger
 */
public class Demo02Lambda {
    private static void  showlog(int level, MessageBuilder mb){
        if (level == 1){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String mess1 = "Hello";
        String mess2 = "Java";
        String mess3 = "World";
        showlog(1,()-> mess1 + mess2 + mess3);
    }
}
