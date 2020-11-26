package cn.zskblog.demo07Prop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/****************************************************************************
 * Package:cn.zskblog.demo07Prop                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/9/30  10:39                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class Demo01Prop {

    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("09_IOAndProperties\\prop.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

    private static void show02() throws IOException {
        // 1、创建prop集合，设置集合属性
        Properties prop = new Properties();
        prop.setProperty("张三丰","太极拳");  // 设置集合属性，调用Hashmap的 put方法
        prop.setProperty("张翠山","武当剑法");
        prop.setProperty("张无忌","通背拳");

        // 2、创建字符输入、输出流对象，绑定数据源
        FileWriter fw = new FileWriter("09_IOAndProperties\\prop.txt");

        // 3、使用properties集合中的store方法把集合中临时数据写入硬盘
        prop.store(fw,"sava_date");

        // 4、关闭流
        fw.close();
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("张三丰","太极拳");  // 设置集合属性，调用Hashmap的 put方法
        prop.setProperty("张翠山","武当剑法");
        prop.setProperty("张无忌","通背拳");

        Set<String> set = prop.stringPropertyNames(); // 返回键列表，相当于Map集合keyset方法
        for (String key : set) {
            System.out.println(prop.getProperty(key));  // 返回与键对应的值
        }
    }
}
