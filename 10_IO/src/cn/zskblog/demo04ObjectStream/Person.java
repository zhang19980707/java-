package cn.zskblog.demo04ObjectStream;

import java.io.Serializable;

/****************************************************************************
 * Package:cn.zskblog.demo04ObjectStream                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  20:03                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

// 序列化和反序列化时，会抛出NotSerializableException没有序列化异常
// 通过实现 java.io.Serializable 标记型接口实现序列化和反序列化
public class Person implements Serializable{
    // 手动指定UID 防止类发生改变没有序列化时直接反序列化引发异常
    private static final long serialVersonUID = 43L; 
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
