package cn.zskblog.test;

import cn.zskblog.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

/****************************************************************************
 * Package:cn.zskblog.test                                                                                        
 * @Author:ZhangShiKang                                                       
 * @Email: 845664960@qq.com                                                       
 * @Created: 2020/11/27  10:20                                
 * @Version: 1.0                                                              
 * @Description:                                                              
*****************************************************************************/

public class JacksonTest {

    // 演示：Java对象转换为JSON字符串
    @Test
    public void test1() throws Exception {
        // 1、创建person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");

        // 2、创建jackson和核心对象
        ObjectMapper mapper = new ObjectMapper();
        // 3、转换
        /*
           转换方法：
                  writeValue(参数1,obj):
                      参数1：
                        File：将对象转为json字符串，并保存到指定文件中
                        Writer：将对象转为json字符串，并将json数据填充到字符输出流中
                        OutputStream：将对象转为json字符串，将json数据填入字节输入流
                  writeValueAsString(obj)：将对象转为json字符串
         */
        String json = mapper.writeValueAsString(p);
//        System.out.println(json); // {"name":"张三","age":23,"gender":"男"}

    }

    @Test  // 测试使用注解来对json做约束和格式化
    public void test2() throws Exception {
        // 1、创建person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        // 2、转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);
    }


    @Test
    public void test3() throws Exception {
        // 1、创建person对象
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());

        Person p3 = new Person();
        p3.setName("张三");
        p3.setAge(23);
        p3.setGender("男");
        p3.setBirthday(new Date());

        // 创建List集合
        List<Object> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);

        // 2、将list转换为json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ps);

        System.out.println(json);
        // [{"name":"张三","age":23,"gender":"男","birthday":"2020-11-27"},{"name":"张三","age":23,"gender":"男","birthday":"2020-11-27"},{"name":"张三","age":23,"gender":"男","birthday":"2020-11-27"}]
    }


    @Test
    public void test4() throws Exception {
        // 1、创建person对象
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 23);
        map.put("gender", "男");

        // 2、将集合map转换为json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);

        System.out.println(json);
    }


    // 演示：将json转换为java对象
    @Test 
    public void test5() throws IOException {
        // 1、初始化json字符串
        String json = "{\"gender\":\"男\",\"name\":\"张三\",\"age\":23}";

        // 2、创建mapper对象
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        
        System.out.println(person);
    }

}
