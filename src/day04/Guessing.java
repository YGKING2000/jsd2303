package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Guessing
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 14:01
 * @Version 1.0
 */
public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 生成随机数的方式一：
        // int num = (int) (Math.random() * 100) + 1;
        // 生成随机数的方式二：
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.print("请输入你猜的数字：");
        int guess = scanner.nextInt();
        while (true) {
            if (guess > num) {
                System.out.println("你猜的数字大了");
            } else if (guess < num){
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
        }
        /*for (;;) {
            if (guess > num) {
                System.out.println("你猜的数字大了");
            } else if (guess < num){
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
        }*/
    }
    
    
}