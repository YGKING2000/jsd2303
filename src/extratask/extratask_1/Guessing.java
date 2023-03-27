package extratask.extratask_1;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Guessing
 * @Description 练习Guessing猜数字游戏————练习while自造死循环
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 19:51
 * @Version 1.0
 */
public class Guessing {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(101);
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("猜大了！");
            } else if (guess < num) {
                System.out.println("猜小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }*/
        
        // 实例化Scanner类的对象scanner
        Scanner scanner = new Scanner(System.in);
        // 实例化Random类的对象random
        Random random = new Random();
        // 生成一个随机数
        int num = random.nextInt(101);
        while (true) {
            // 接受用户输入的数字
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("猜大了！");
            } else if (guess < num) {
                System.out.println("猜小了！");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
