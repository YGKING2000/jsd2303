package ooday05;

/**
 * @Description
 * @ClassName StaticDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 11:36
 * @Version 1.0
 */
public class StaticDemo {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();
        StaticVar staticVar2 = new StaticVar();
        staticVar2.show();
        // a = 1, b = 1
        // a = 1, b = 2
        // a = 1, b = 3
        
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock staticBlock1 = new StaticBlock();
        StaticBlock staticBlock2 = new StaticBlock();
        // 静态代码块代码执行中...
        // 构造方法执行中...
        // 构造方法执行中...
        // 构造方法执行中...
    }
}
