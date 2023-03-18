package homework.day02;

/**
 * @ClassName IntExercise
 * @Description int数据类型的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 17:43
 * @Version 1.0
 */
public class IntExercise {
    public static void main(String[] args) {
        // 1.声明初始化两个以上整数变量，并且输出两个整数变量的除法结果
        int a = 5;
        int b = 3;
        System.out.println(a / b);// 1
    
        // 2.声明两个很大的变量，然后相加，输出运算结果，测试运算溢出现象
        int c = 2000000000;
        int d = 2000000000;
        int e = c + d;
        System.out.println(e);// -294967296
    }
}
