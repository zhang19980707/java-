package cn.zskblog.demo01Exception;

import java.util.Objects;

/****************************************************************************
* Package:cn.zskblog.demo01Exception                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  15:43                                
* Version: 1.0                                                              
* Description:
 *              利用Objects类的静态方法 requireNonNull 判断是否为空。
 *              requireNonNull 支持两种重载方式：
 *                    public static <T> T requireNonNull(T obj) {
                        if (obj == null)
                           throw new NullPointerException();
                         return obj;
                     public static <T> T requireNonNull(T obj, String message) {
                        if (obj == null)
                            throw new NullPointerException(message);
                        return obj;
*****************************************************************************/

public class Demo04Objects {

    public static void main(String[] args) {
        Objects.requireNonNull(null, "传递的对象为空");
    }
}
