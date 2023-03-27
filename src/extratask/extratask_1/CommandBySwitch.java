package extratask.extratask_1;

import java.util.Scanner;

/**
 * @ClassName CommandBySwitch
 * @Description 完成CommandBySwitch命令解析程序————练习switch
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 19:18
 * @Version 1.0
 */
public class CommandBySwitch {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("操作序号：1.存款\t2.取款\t3.查看余额\t4.退卡");
        System.out.print("请输入你的操作序号：");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("存款业务正在进行中......");
                break;
            case 2:
                System.out.println("取款业务正在进行中......");
                break;
            case 3:
                System.out.println("查询余额业务正在进行中......");
                break;
            case 4:
                System.out.println("退卡业务正在进行中......");
                break;
            default:
                System.out.println("你输入的操作序号有误！");
        }*/
        
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("操作序号：1.存款\t2.取款\t3.查询余额\t4.退卡");
        System.out.print("请输入操作序号：");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("存款业务正在进行中...");
                break;
            case 2:
                System.out.println("取款业务正在进行中...");
                break;
            case 3:
                System.out.println("查询余额业务正在进行中...");
                break;
            case 4:
                System.out.println("退卡业务正在进行中...");
                break;
            default:
                System.out.println("你的操作序号输入有误！");
        }*/
        
        // 实例化Scanner类的对象scanner
        Scanner scanner = new Scanner(System.in);
        // 账户初始余额
        double balance = 10000;
        // 用于接收用户的操作序号
        int num;
        // 用于接收用户存取款时钱的数目
        double money;
        out:do {
            System.out.println("操作序号：1.存款\t2.取款\t3.查询余额\t4.退卡");
            System.out.print("请输入操作序号：");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("存款业务正在进行中...");
                    System.out.print("请输入你的存款数：");
                    money = scanner.nextDouble();
                    balance += money;
                    System.out.println("存款业务已经完成！");
                    break ;
                case 2:
                    System.out.println("取款业务正在进行中...");
                    System.out.print("请输入你的存款数：");
                    money = scanner.nextDouble();
                    if (money > balance) {// 判断用户想要取钱的数目是否大于账户余额
                        System.out.println("你的账户余额不足，请重新操作！");
                    } else {
                        balance -= money;
                        System.out.println("取款业务已经完成！");
                    }
                    break;
                case 3:
                    System.out.println("查询余额业务正在进行中...");
                    System.out.println("你的账户当前余额是：" + balance);
                    System.out.println("查询余额业务已经完成！");
                    break;
                case 4:
                    System.out.println("退卡业务正在进行中...");
                    System.out.println("退卡业务已经完成！");
                    break out;
                default:
                    System.out.println("你输入的操作序号有误，请重新输入！");
            }
            System.out.println("-----------------------------------------");
        } while (true);
    }
}
