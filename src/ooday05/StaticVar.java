package ooday05;

/**
 * @Description 静态变量的演示
 * @ClassName StaticVar
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 11:35
 * @Version 1.0
 */
public class StaticVar {
    static {
        b = 100;
    }
    int a;
    static int b;
    
    public StaticVar() {
        a++;
        b++;
    }
    
    void show() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
