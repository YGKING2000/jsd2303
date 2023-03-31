package homework.ooday05.second;

/**
 * @Description 静态成员的练习
 * @ClassName StaticDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:22
 * @Version 1.0
 */
public class StaticDemo {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();// a = 1, b = 1
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();// a = 1. b = 2
        StaticVar staticVar2 = new StaticVar();
        staticVar2.show();// a = 1, b = 3
    
        StaticBlock staticBlock = new StaticBlock();
        staticBlock.show();// a = 1, b = 101
        StaticBlock staticBlock1 = new StaticBlock();
        staticBlock1.show();// a = 1. b = 102
        StaticBlock staticBlock2 = new StaticBlock();
        staticBlock2.show();// a = 1, b = 103
        
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.show();// 0, 0
        staticMethod.test();// 0
        StaticMethod.test();// 0
        System.out.println(StaticMethod.plus(1, StaticMethod.b));// 1
    }
}
