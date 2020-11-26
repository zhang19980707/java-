package cn.zskblog.demo04ObjectStream;

import java.io.*;
import java.util.ArrayList;

/****************************************************************************
 * Package:cn.zskblog.demo04ObjectStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  20:43                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo03test {

    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        // 1、闯将list列表，添加Person对象到列表中
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        // 2、使用序列化输出对象列表
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("10_IO\\list.txt"));
        // 3、调用writeObject() 方法
        oos.writeObject(list);
        // 4、使用反序列化读取文件中的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("10_IO\\list.txt"));
        // 5、将 Object 对象强制转换成 Person 对象,存入新列表
        Object o = ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        System.out.println(list2);
        // 6、遍历新列表中存储的 Person 对象
        for (Person p : list2) {
            System.out.println(p.getName() + "---->"+ p.getAge());
        }
        // 7、关闭流
        ois.close();
        oos.close();
    }
}
