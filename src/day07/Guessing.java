package day07;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Guessing
 * @Description 猜数字游戏
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 09:11
 * @Version 1.0
 */
public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(101) + 1;
        // 猜数字————while(条件表达式)
        /*System.out.print("请输入你猜的数字：");
        int guess = scanner.nextInt();
        while (guess != num) {
            if (guess > num) {
                System.out.println("你猜的数字大了");
            } else {
                System.out.println("你猜的数字小了");
            }
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
        }
        System.out.println("恭喜你，猜对了！");*/
        
        // 猜数字————while(true)
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else if (guess < num){
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
