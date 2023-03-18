package day03;

import java.util.Scanner;

/**
 * @ClassName IfElseDemo
 * @Description 分支结构if...else的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 16:37
 * @Version 1.0
 */
public class IfElseDemo {
    public static void main(String[] args) {
        // 满500打8折，不满500打9折
        double discount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的消费金额：");
        double price = scanner.nextDouble();
        if (price >= 0) {
            discount = price >= 500 ? .8 : .9;
            price *= discount;
            System.out.println("你的消费金额打" + (int)(discount * 10) +"折后是：" + price);
        } else {
            System.out.println("你输入的消费金额不合法");
        }
    
        // 判断用户输入的成绩是否合法
        System.out.print("请输入你的成绩：");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            System.out.println(score + "是合法成绩");
        } else {
            System.out.println(score + "是非法成绩");
        }
        System.out.println("继续执行...");
    }
}
