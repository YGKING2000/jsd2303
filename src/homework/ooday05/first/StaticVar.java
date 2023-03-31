package homework.ooday05.first;

/**
 * @Description 静态变量类
 * @ClassName StaticVar
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 18:51
 * @Version 1.0
 */
public class StaticVar {
    int a;
    static int b;
    
    StaticVar() {
        a++;
        b++;
    }
    
    void show() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
