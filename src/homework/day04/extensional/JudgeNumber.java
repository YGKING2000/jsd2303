package homework.day04.extensional;

import java.util.Scanner;

/**
 * @ClassName JudgeNumber
 * @Description 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 19:07
 * @Version 1.0
 */
public class JudgeNumber {
    public static void main(String[] args) {
        // 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("0");
        } else if (num > 0){
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
