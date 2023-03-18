package homework.day03.standard;

/**
 * @ClassName Operator01
 * @Description 关系运算符的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 17:34
 * @Version 1.0
 */
public class OperatorExercise02 {
    public static void main(String[] args) {
        // 1.声明几个变量，演示最基本的>，<，>=，<=，==，!=操作
        int a = 3, b = 7, c = 9, d= 7;
        System.out.println(a > b);// false
        System.out.println(a < b);// true
        System.out.println(b >= c);// false
        System.out.println(b >= d);// true
        System.out.println(c <= d);// false
        System.out.println(b <= d);// true
        System.out.println(b == a);// false
        System.out.println(b == d);// true
        System.out.println(b != a);// true
        System.out.println(b != d);// false
        System.out.println();
        
        // 2.演示关系运算符和算术运算符联合使用的效果
        System.out.println(c % d >= a);// false
        System.out.println(a + b >= c);// true
        System.out.println(c / d == a);// false
        System.out.println(c / d != a);// true
        System.out.println(a > b % c);// false
        System.out.println(c - b + b / d == a);// true
    }
}
