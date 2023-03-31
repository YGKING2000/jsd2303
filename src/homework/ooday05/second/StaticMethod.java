package homework.ooday05.second;

/**
 * @Description 静态方法类
 * @ClassName StaticMethod
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:33
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
        System.out.print(a + ", ");
        System.out.println(b);
    }
    
    static void test() {
        // 静态方法中不能使用非静态的成员
        // System.out.println(a);
        System.out.println(b);
    }
}
