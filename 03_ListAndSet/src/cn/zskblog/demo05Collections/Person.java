package cn.zskblog.demo05Collections;
/****************************************************************************
* Package:cn.zskblog.demo05Collections                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/24  15:43                                
* Version: 1.0                                                              
* Description:                                                              
*****************************************************************************/

public class Person implements Comparable<Person>{
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

    // 重写Person对象排序规则
    @Override
    public int compareTo(Person o){
//        return 0; 默认返回0
        return this.getAge() - o.getAge(); // 按照age升序排序
    }
}
