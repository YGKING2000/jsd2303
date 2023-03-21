package homework.day05.standard;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Addition
 * @Description Addition随机加法运算器
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 17:35
 * @Version 1.0
 */
public class Addition {
    public static void main(String[] args) {
        // 要求:由系统随机出10道加法题，而后由用户来答题，答题后输出"答对了"或"答错了"，答对1题得10分，答错1题不扣分，最后输出总分数
        /*// 实例化Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 实例化Random对象
        Random random = new Random();
        // 随机生成的两个加数
        int num1, num2;
        // 接收用户的答案
        int answer;
        // 记录分数
        int score = 0;
        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(100);
            num2 = random.nextInt(100);
            System.out.println(num1 + "+" + num2 + "=?");
    
            System.out.println("算吧！");
            System.out.print("请输入你的答案：");
            answer = scanner.nextInt();
            
            if (answer == num1 + num2) {
                System.out.println("答对了！");
                score += 10;
            } else {
                System.out.println("答错了！");
            }
        }
        System.out.println("你本次的得分是：" + score);*/
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1, num2;
        int score = 0;
        int answer;
        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(100);
            num2 = random.nextInt(100);
            System.out.printf("%d+%d=?", num1, num2);
    
            System.out.println("算吧！");
            System.out.print("请输入你的答案：");
            answer = scanner.nextInt();
            
            if (answer == num1 + num2) {
                System.out.println("答对了！");
                score += 10;
            } else {
                System.out.println("答错了！");
            }
        }
        System.out.println("你本次的得分是：" + score);
    }
}
