package ooday05;

/**
 * @Description
 * @ClassName StaticMethod
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 14:52
 * @Version 1.0
 */
public class StaticMethod {
    int a;
    static int b;
    
    void show() {
        // 有系统提供默认的this指向当前对象
        System.out.println(a);
        System.out.println(b);
    }
    
    static void test() {
        // 因为静态方法是属于类的，一般不会传递对象进来，即使this没有当前对象可以指向
        // 所以静态方法中没有this，又因为静态方法中没有this，所以静态方法中不能使用非静态变量和方法
        // System.out.println(a);
        System.out.println(b);
    }
    
    // 因为方法的执行中不需要使用实例方法和实例变量，所以将plus方法设计成静态方法，使得调用时不用创建对象更快捷
    static int plus(int num1, int num2) {
        return num1 + num2;
    }
}
