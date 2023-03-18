package homework.day03.standard;

/**
 * @ClassName OperatorExercise04
 * @Description 赋值运算符的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 18:53
 * @Version 1.0
 */
public class OperatorExercise04 {
    public static void main(String[] args) {
        // 1.声明一个整型变量，演示扩展赋值+=、-=、*=、/=、%=的效果
        int num = 9;
        System.out.println(num);
        num += 3;
        System.out.println(num);// 12
        num -= 6;
        System.out.println(num);// 6
        num *= num;
        System.out.println(num);// 36
        num /= 4;
        System.out.println(num);// 9
        num %= 12;
        System.out.println(num);// 9
        num %= 4;
        System.out.println(num);// 1
        
        // 2.声明short型变量S，演示简单赋值运算的自增10，演示扩展赋值运算的自增10
        short s = 379;
        s = (short) (s + 10);
        System.out.println(s);// 389
        s += 10;
        System.out.println(s);// 399
    }
}
