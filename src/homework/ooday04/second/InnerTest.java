package homework.ooday04.second;

/**
 * @Description 匿名内部类的测试
 * @ClassName InnerTest
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 21:25
 * @Version 1.0
 */
public class InnerTest {
    public static void main(String[] args) {
        Aoo o = new Aoo() {
        };
        Aoo o1 = new Aoo() {
        };
        
        Inner o2 = new Inner() {
            @Override
            void show() {
                System.out.println("Inner类的第一个匿名内部类");
            }
        };
        
        Inner o3 = new Inner() {
            @Override
            void show() {
                System.out.println("Inner类的第二个匿名内部类");
            }
        };
        
        Boo o4 = new Boo() {
            @Override
            public void test() {
                System.out.println("Boo类的第一个匿名内部类");
            }
        };
        
        Boo o5 = new Boo() {
            @Override
            public void test() {
                System.out.println("Boo类的第二个匿名内部类");
            }
        };
    }
}
