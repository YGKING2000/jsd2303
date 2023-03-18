package day03;

import java.util.Scanner;

/**
 * @ClassName IfElseIfDemo
 * @Description 分支结构if...else if的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 17:12
 * @Version 1.0
 */
public class IfElseIfDemo {
    public static void main(String[] args) {
        // 满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折
        double discount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的消费金额：");
        double price = scanner.nextDouble();
        if (price >= 2000) {
            discount = .5;
        } else if (price >= 1000) {
            discount = .7;
        } else if (price >= 500) {
            discount = .8;
        } else {
            discount = .9;
        }
        System.out.println("你的消费金额打" + (int)(discount * 10) + "折后是：" + price * discount);
    }
}
