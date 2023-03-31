package homework.ooday05.first;

/**
 * @Description 静态成员的演示
 * @ClassName StaticDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 18:50
 * @Version 1.0
 */
public class StaticDemo {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();// a = 1, b = 1
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();// a = 1, b = 2
        StaticVar staticVar2 = new StaticVar();
        staticVar2.show();// a = 1, b = 3
        System.out.println("---------------");
        
        StaticBlock staticBlock = new StaticBlock();
        staticBlock.show();// a = 1, b = 101
        StaticBlock staticBlock1 = new StaticBlock();
        staticBlock1.show();// a = 1, b = 102
        StaticBlock staticBlock2 = new StaticBlock();
        staticBlock2.show();// a = 1, b = 103
        System.out.println("---------------");
        
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.show();
        staticMethod.test();// 不推荐
        StaticMethod.test();// 推荐
        System.out.println(StaticMethod.plus(3, 7));
    }
}
