package homework.day04.extensional;

import java.util.Scanner;

/**
 * @ClassName JudgeDay
 * @Description 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 19:11
 * @Version 1.0
 */
public class JudgeDay {
    public static void main(String[] args) {
        // 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        /*if (month != 2) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("公元" + year + "年" + month + "月有31天");
                    break;
                default:
                    System.out.println("公元" + year + "年" + month + "月有30天");
            }
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("公元" + year + "年2月有29天");
            } else {
                System.out.println("公元" + year + "年2月有28天");
            }
        }*/
        /*switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("公元" + year + "年2月有29天");
                } else {
                    System.out.println("公元" + year + "年2月有28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("公元" + year + "年" + month + "月有30天");
                break;
            default:
                System.out.println("公元" + year + "年" + month + "月有31天");
        }*/
        int days;
        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        System.out.println("公元" + year + "年" + month + "月有" + days + "天");
    }
}
