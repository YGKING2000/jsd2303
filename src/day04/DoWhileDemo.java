package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName DoWhileDemo
 * @Description 循环结构do...while的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 15:18
 * @Version 1.0
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 实例化Random类
        Random random = new Random();
        // random.nextInt(100): 生成[0, 100)之间的整数
        int num = random.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了");
            } else if (guess < num) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("恭喜你，猜对了！");
            }
        } while (guess != num);
    }
}
