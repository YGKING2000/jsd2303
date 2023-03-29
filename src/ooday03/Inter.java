package ooday03;

/**
 * @Description 抽象类只能有抽象方法、默认方法、常量
 * @InterfaceName Inter
 * @Author YGKING  E-mail:hrd18960706057@163.com
 * @Date 2023/03/28 10:42
 * @Version 1.0
 */
public interface Inter {
    // 1.抽象方法
    /* public */abstract void show();
    
    
    // 2.普通方法: 但实际上是抽象方法，前面会被默认加上abstract
    /* public abstract */ void test();
    
    // void say() {}
    // 编译失败，接口中的普通方法都是抽象方法，普通方法前面会被默认加上abstract关键字，所以say()方法在这里是抽象方法，而抽象方法不能有方法体
    
    
    // 3.默认方法
    default void eat() {
        System.out.println("正在吃饭...");
    }
    
    // 4.静态方法
    static void sleep() {
        System.out.println("正在睡觉...");
    };
}
