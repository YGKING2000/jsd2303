package homework.day04.standard;

import java.util.Scanner;

/**
 * @ClassName CommandBySwitch
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 17:27
 * @Version 1.0
 */
public class CommandBySwitch {
    public static void main(String[] args) {
        // 要求：接收用户输入的命令，依据命令做不同的操作
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("操作指引：1.取款\t2.存款\t3.查询余额\t4.退卡");
        System.out.print("请输入你想要办理的业务序号：");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("取款业务...");
                break;
            case 2:
                System.out.println("存款业务...");
                break;
            case 3:
                System.out.println("查询余额业务...");
                break;
            case 4:
                System.out.println("退卡...");
                break;
            default:
                System.out.println("输入错误！");
        }*/
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("操作指引：1.取款\t2.存款\t3.查询余额\t4.退卡");
        System.out.print("请输入你想要办理的业务序号：");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("取款...");
                break;
            case 2:
                System.out.println("存款...");
                break;
            case 3:
                System.out.println("查询余额...");
                break;
            case 4:
                System.out.println("退卡...");
                break;
            default:
                System.out.println("输入错误！");
        }
    }
}
