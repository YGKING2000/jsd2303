package homework.day03.standard;

/**
 * @ClassName OperatorExercise06
 * @Description 三目运算符/条件运算符的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:07
 * @Version 1.0
 */
public class OperatorExercise06 {
    public static void main(String[] args) {
        // 1.声明并初始化整型变量，使用条件运算符实现: 若>0则给flag赋值为1，否则赋值为0
        int num = 7;
        int flag = num > 0 ? 1 : 0;
        System.out.println(flag);// 1
        num = 0;
        flag = num > 0 ? 1 : 0;
        System.out.println(flag);// 0
        num = -9;
        flag = num > 0 ? 1 : 0;
        System.out.println(flag);// 0
        
        // 2.声明两个整型变量，使用条件运算符实现:求这两个变量的最大值
        int a = 10;
        int b = 165;
        int max = a > b ? a : b;
        System.out.println(max);// 165
        a = 165;
        max = a > b ? a : b;
        System.out.println(max);// 165
        a = 379;
        max = a > b ? a : b;
        System.out.println(max);// 379
    }
}
