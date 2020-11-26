package cn.zskblog.demo01Object;

import java.util.Objects;

/****************************************************************************
* Package:cn.zskblog.demo01Object                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/17  15:53                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     /**
        * Description: 重写toString()方法
        * Params: []
        * Return: void
        * Date: 2020/9/17 15:59
        */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

     /**
        * Description: 重写equals()方法
        * Params: []
        * Return: void
        * Date: 2020/9/17 16:27
        */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  // 防止Null
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
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
