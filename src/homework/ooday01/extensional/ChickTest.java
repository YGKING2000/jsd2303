package homework.ooday01.extensional;

/**
 * @ClassName ChickTest
 * @Description 鸡的测试类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 19:06
 * @Version 1.0
 */
public class ChickTest {
    public static void main(String[] args) {
        Chick chick = new Chick("杏花鸡", "公鸡", 2.6, 36.9);
        chick.eat();
        chick.getPrice();
        System.out.println();
        
        Chick chick1 = new Chick("大石鸡", "母鸡", 2.1, 46.8);
        chick1.eat();
        chick1.getPrice();
        System.out.println();
        
        Chick chick2 = new Chick("贵妃鸡", "公鸡", 3.6, 69.0);
        chick2.eat();
        chick2.getPrice();
        System.out.println();
        
        Chick chick3 = new Chick("清远鸡", "公鸡", 3.3, 99.3);
        chick3.eat();
        chick3.getPrice();
    }
}
