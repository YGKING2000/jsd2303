package extratask.extratask_1;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Addition
 * @Description 完成Addition随机加法运算器————练习for循环
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 20:09
 * @Version 1.0
 */
public class Addition {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int num1, num2, answer;
        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(101);
            num2 = random.nextInt(101);
            System.out.println("算吧：" + num1 + "+" + num2 + "=?");
    
            System.out.print("请输入你的答案：");
            answer = scanner.nextInt();
            if (answer == num1 + num2) {
                score += 10;
                System.out.println("恭喜你，答对了！");
            } else {
                System.out.println("很遗憾，答错了！");
            }
        }
        System.out.println("你本次答题分数为：" + score);*/
        
        // 实例化Scanner类的对象scanner
        Scanner scanner = new Scanner(System.in);
        // 实例化Random类的对象random
        Random random = new Random();
        // 初始化答题的分数
        int score = 0;
        // 声明接收随机生成的两个加数和用户输入的答案
        int num1, num2, answer;
        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(101);
            num2 = random.nextInt(101);
            System.out.println("算吧：" + num1 + "+" + num2 + "=?");
            
            System.out.print("请你输入答案：");
            answer = scanner.nextInt();
            // 判断用户回答是否正确
            if (answer == num1 + num2) {
                score += 10;
                System.out.println("恭喜你，答对了！");
            } else {
                System.out.println("很遗憾，答错了！");
            }
        }
        System.out.println("你本次答题的分数是" + score);
    }
}
