package homework.day07.standard;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Guessing
 * @Description 猜数字小游戏
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 18:38
 * @Version 1.0
 */
public class Guessing {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 生成随机数
        int num = random.nextInt(101);
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else if (guess < num) {
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }*/
        
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(101);
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess == num) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else {
                System.out.println("你猜的数字小了！");
            }
        }*/
        
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 生成随机数
        int num = random.nextInt(101);
        int guess;
        do {
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else if (guess < num) {
                System.out.println("你猜的数字小了！");
            }
        } while (guess != num);
        System.out.println("恭喜你，猜对了！");*/
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(101);
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else if (guess < num) {
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
