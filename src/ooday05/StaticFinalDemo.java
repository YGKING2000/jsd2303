package ooday05;

/**
 * @Description 常量的演示
 * @ClassName StaticFinalDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 15:59
 * @Version 1.0
 */
public class StaticFinalDemo {
    public static void main(String[] args) {
        // 1.加载Loo.class到方法区中
        // 2.将PI一并加载到方法区中
        // 3.去方法区中取到PI的值然后输出
        System.out.println(Loo.PI);// 一般通过类名访问
        // Loo.PI = 3.1514927;// 常量的值不能修改
    
        // 常量在编译时就被替换成具体的值，下面的两条语句编译后一样
        System.out.println(Loo.NUM);
        System.out.println(379);
    }
}

/* 演示常量 */
class Loo {
    public static final double PI = 3.1415906;
    public static final int NUM = 379;
    // public static final int NUM;// 常量声明的同时必须赋值
}