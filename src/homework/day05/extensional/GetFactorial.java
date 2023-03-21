package homework.day05.extensional;

import java.util.Scanner;

/**
 * @ClassName Factorial
 * @Description 求8的阶乘
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 20:19
 * @Version 1.0
 */
public class GetFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        long num = scanner.nextInt();
        long result = 1L;
        for (long i = 2L; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + "的阶乘是：" + result);
    }
}
