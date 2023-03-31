package homework.ooday05.first;

/**
 * @Description 常量测试类
 * @ClassName StaticFinalDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 19:57
 * @Version 1.0
 */
public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(StaticFinal.PI);// 3.1415926
        System.out.println(StaticFinal.NUM);// 379
        // StaticFinal.PI = 3.1115927;
        StaticFinal.NUM = 973;
        System.out.println(StaticFinal.NUM);// 973
    }
}

/* 常量类 */
class StaticFinal {
    public static final double PI = 3.1415926;
    public static int NUM = 379;
}