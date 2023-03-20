package day04;

import java.util.Scanner;

/**
 * @ClassName CommandBySwitch
 * @Description 根据用户输入的操作序号办理业务
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 09:36
 * @Version 1.0
 */
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("操作序号：1.取款\t2.存款\t3.查询余额\t4.购买基金\t5.取卡");
        System.out.print("请输入你想要办理的业务序号：");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("存款业务...");
                break;
            case 2:
                System.out.println("取款业务...");
                break;
            case 3:
                System.out.println("查询余额业务...");
                break;
            case 4:
                System.out.println("购买基金...");
                break;
            case 5:
                System.out.println("取卡...");
                break;
            default:
                System.out.println("输入错误...");
        }
    }
}
