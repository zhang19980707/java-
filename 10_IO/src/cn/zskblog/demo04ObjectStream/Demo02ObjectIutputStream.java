package cn.zskblog.demo04ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/****************************************************************************
 * Package:cn.zskblog.demo04ObjectStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  20:23                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo02ObjectIutputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("10_IO\\Person.txt"));
        System.out.println(ois.readObject()); // Person{name='张三', age=18}
        Object o = ois.readObject();
        Person p = (Person)o; // 将Object类型强制转换为Person类型
        System.out.println(p.getAge() + p.getAge());
        ois.close();
    }
}
