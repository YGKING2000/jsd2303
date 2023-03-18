package homework.day03.standard;

/**
 * @ClassName Operator01
 * @Description 关系运算符的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 17:34
 * @Version 1.0
 */
public class OperatorExercise03 {
    public static void main(String[] args) {
        // 1.声明三个整型变量，演示&&和||，演示!
        int a = 3, b = 9, c = 7;
        System.out.println(b > c && a == b);// true && false ==> false
        System.out.println(b / a != a && a < b);// false && true ==> false
        System.out.println(b / a == a && b > c);// true && true ==> true
        System.out.println(b < c && a == b);// false && false ==> false
        System.out.println();
        System.out.println(a < c || b < c);// true || false ==> true
        System.out.println(b == c || a != c);// false || true ==> true
        System.out.println(a < c || b != c);// true || true ==> true
        System.out.println(a >= c || b + a <= c);// false || false ==> false
        System.out.println();
        System.out.println(!(a * a == b));// !true ==> false
        System.out.println(!(a +c <= b));// !false ==> true
        System.out.println();
        
        // 2.演示关系运算符和算术运算符联合使用的效果
        // (1)演示短路&&
        int d = 7;
        System.out.println(d > 9 && ++d != d);// false
        System.out.println(d);// 7
        // (2)演示短路||
        int e = 9;
        System.out.println(e != 10 || --e == 8);// true
        System.out.println(e);// 9
    }
}
