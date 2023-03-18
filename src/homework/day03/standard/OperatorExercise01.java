package homework.day03.standard;

/**
 * @ClassName Operator01
 * @Description 算术运算符的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 17:34
 * @Version 1.0
 */
public class OperatorExercise01 {
    public static void main(String[] args) {
        // 1.输出几个整数取模，验证结果
        // 结论: 取余的结果在不为0的情况下，与被除数的正负相同
        System.out.println(12 % 2);// 0
        System.out.println(12 % 5);// 2
        System.out.println(-12 % 5);// -2
        System.out.println(12 % -5);// 2
        System.out.println(-12 % -5);// -2
        System.out.println();
        
        // 2.声明两个整型变量，演示单独使用时的自增和自减
        int a = 3;
        int b = 5;
        a++;
        System.out.println(a);// 4
        ++a;
        System.out.println(a);// 5
        b--;
        System.out.println(b);// 4
        --b;
        System.out.println(b);// 3
        System.out.println();
        
        // 3.声明两个整型变量，演示被使用时的自增和自减
        int c = 7;
        int d = 9;
        System.out.println(++c);// 8
        System.out.println(c++);// 8
        System.out.println(--d);// 8
        System.out.println(d--);// 8
    }
}
