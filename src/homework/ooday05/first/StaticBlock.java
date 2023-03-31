package homework.ooday05.first;

/**
 * @Description 静态块类
 * @ClassName StaticBlock
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 18:55
 * @Version 1.0
 */
public class StaticBlock {
    int a;
    static int b;
    
    static {
        b = 100;
        // a = 1;// 静态代码块中不能使用非静态成员
    }
    
    StaticBlock() {
        a++;
        b++;
    }
    
    void show() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
