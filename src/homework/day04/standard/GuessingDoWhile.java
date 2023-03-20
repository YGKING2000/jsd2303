package homework.day04.standard;

import java.util.Scanner;

/**
 * @ClassName GuessingDoWhile
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 17:51
 * @Version 1.0
 */
public class GuessingDoWhile {
    public static void main(String[] args) {
        // 要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用do...while来实现
        /*Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 1000) + 1;
        int guess;
        do {
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else if (guess < num) {
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
            }
        } while (guess != num);*/
        
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 1000) + 1;
        int guess;
        do {
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else if (guess < num) {
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
            }
        } while (guess != num);
    }
}
