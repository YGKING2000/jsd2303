package ooday05;

/**
 * @Description 静态块的演示
 * @ClassName StaticBlock
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 14:13
 * @Version 1.0
 */
public class StaticBlock {
    StaticBlock() {
        System.out.println("构造方法执行中...");
    }
    
    {
        System.out.println("配套方面看");
    }
    
    static {
        System.out.println("静态代码块代码执行中...");
    }
}
