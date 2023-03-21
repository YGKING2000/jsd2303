package day05;

import java.util.Scanner;

/**
 * @ClassName AnswerTopics
 * @Description 随机加法测试的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 09:53
 * @Version 1.0
 */
public class AnswerTopics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 两个加数
        int num1, num2;
        // 接收用户的答案
        int answer;
        // 得分初始值设置为0
        int score = 0;
        for (int i = 1; i <= 10; i++) {
            num1 = (int) (Math.random() * 100);
            num2 = (int) (Math.random() * 100);
            // System.out.println("(" + i + ")" + num1 + "+" + num2 + "=?");
            System.out.printf("(%d)%d+%d=?\n", i, num1, num2);
            System.out.println("算吧！");
            System.out.print("请输入你的答案：");
            answer = scanner.nextInt();
            if (answer == num1 + num2) {
                score += 10;
                System.out.println("答对了！");
            } else {
                System.out.println("答错了！");
            }
        }
        System.out.println("你的本次得分：" + score);
    }
}
