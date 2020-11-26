package cn.zskblog.demo01FunctionalInterface;

/*
    函数式接口：有且只有一个抽象方法的接口
    接口中可以包含其他（默认、静态、私有）方法
*/
@FunctionalInterface  // 注解，标记接口中只能有一个抽象方法  
public interface MyFunctionalInterface {
    public abstract void method();
}
