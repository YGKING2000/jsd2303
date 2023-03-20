package day04;

import java.util.Scanner;

/**
 * @ClassName SwitchCaseDemo
 * @Description 分支结构switch-case的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 09:10
 * @Version 1.0
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println(111);
                break;
            case 2:
                System.out.println(222);
                break;
            case 3:
                System.out.println(333);
                break;
            case 4:
                System.out.println(444);
                break;
            case 5:
                System.out.println(555);
                break;
            case 6:
                System.out.println(666);
                break;
            case 7:
                System.out.println(777);
                break;
            default:
                System.out.println("哈哈哈");
        }
    }
}
