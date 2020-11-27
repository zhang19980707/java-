package cn.zskblog.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/****************************************************************************
 * Package:cn.zskblog.domain                                                                                        
 * @Author:ZhangShiKang                                                       
 * @Email: 845664960@qq.com                                                       
 * @Created: 2020/11/27  10:18                                
 * @Version: 1.0                                                              
 * @Description:                                                              
*****************************************************************************/

public class Person {
    private String name;
    private int age;
    private String gender;

//    @JsonIgnore  // 忽略该属性
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
