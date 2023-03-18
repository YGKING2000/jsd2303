package day03;

import java.util.Scanner;

/**
 * @ClassName IfDemo
 * @Description 分支结构if的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 15:44
 * @Version 1.0
 */
public class IfDemo {
    public static void main(String[] args) {
        // 满500打8折
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 接收用户输入的消费金额
        System.out.print("请输入你的消费金额：");
        double price = scanner.nextDouble();// 消费金额
        if (price >= 500) {// 判断消费金额是否满500
            price *= .8;// 满足时消费金额打8折
        }
        System.out.println("最终消费金额是：" + price);
    
        // 判断成绩是否合法
        System.out.print("请输入你的成绩：");
        // 接收用户输入的成绩
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            System.out.println("成绩合法");
        }
        System.out.println("继续执行...");
    }
}
