package homework.day04.standard;

import java.util.Scanner;

/**
 * @ClassName GuessingWhile
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 17:41
 * @Version 1.0
 */
public class GuessingWhile {
    public static void main(String[] args) {
        // 要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用while来实现
        /*Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 1000) + 1;
        System.out.print("请输入你猜的数字：");
        int guess = scanner.nextInt();
        while (guess != num) {
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else {
                System.out.println("你猜的数字小了！");
            }
            System.out.print("请再次输入你猜的数字：");
            guess = scanner.nextInt();
        }
        System.out.println("恭喜你，猜对了！");*/
        
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 1000) + 1;
        System.out.print("请输入你猜的数字：");
        int guess = scanner.nextInt();
        while (guess != num) {
            if (guess > num) {
                System.out.println("你猜的数字大了！");
            } else {
                System.out.println("你猜的数字小了！");
            }
            System.out.print("请再输入你猜的数字：");
            guess = scanner.nextInt();
        }
        System.out.println("好想你，猜对了！");
    }
}
