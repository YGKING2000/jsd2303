package homework.ooday05.second;

/**
 * @Description 静态代码块类
 * @ClassName StaticVar
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:24
 * @Version 1.0
 */
public class StaticBlock {
    int a;
    static int b;
    
    static {
        b = 100;
    }
    
    StaticBlock() {
        a++;
        b++;
    }
    
    void show() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
