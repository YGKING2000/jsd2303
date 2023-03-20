package day04;

// 1.导包
import java.util.Scanner;

/**
 * @ClassName ScannerDemo
 * @Description 类Scanner使用的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 09:49
 * @Version 1.0
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // 实例化Scanner
        Scanner scanner = new Scanner(System.in);
        // 调用方法并接收用户的输入
        int num = scanner.nextInt();
        System.out.println(num);
    }
}
