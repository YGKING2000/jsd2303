package homework.ooday05.first;

/**
 * @Description
 * @ClassName StaticMethod
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 19:50
 * @Version 1.0
 */
public class StaticMethod {
    int a;
    static int b;
    
    void say() {
        System.out.println(a);
    }
    
    static int plus(int num1, int num2) {
        return num1 + num2;
    }
    
    void show() {
        System.out.println("实例方法show执行中...");
        System.out.println(a);
        System.out.println(b);
    }
    
    static void test() {
        System.out.println("静态方法test执行中...");
        // System.out.println(a);
        System.out.println(b);
    }
}
