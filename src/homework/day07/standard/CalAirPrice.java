package homework.day07.standard;

import java.awt.*;
import java.util.Scanner;

/**
 * @ClassName CalAirPrice
 * @Description 计算机票价格
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 19:48
 * @Version 1.0
 */
public class CalAirPrice {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        double price = scanner.nextDouble();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("舱位序号：1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("请选择舱位序号：");
        int type = scanner.nextInt();
        
        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票的最终价格是：" + finalPrice);
        }
    }
    
    // 计算机票最终价格的方法
    public static double calFinalPrice(double price, int month, int type) {
        double finalPrice = 0.0;
        if (price < 0) {
            System.out.println("机票原价输入错误！");
            return -1;
        }
        if (month > 12 || month < 1) {
            System.out.println("月份输入错误！");
            return -1;
        }
        if (type > 3 || type < 1) {
            System.out.println("舱位序号输入错误！");
            return -1;
        }
        if (month >= 5 && month <= 10) {
            switch (type) {
                case 1:
                    finalPrice = price * 0.9;
                    break;
                case 2:
                    finalPrice = price * 0.85;
                    break;
                case 3:
                    finalPrice = price * 0.8;
                    break;
            }
        } else {
            switch (type) {
                case 1:
                    finalPrice = price * 0.7;
                    break;
                case 2:
                    finalPrice = price * 0.65;
                    break;
                case 3:
                    finalPrice = price * 0.6;
                    break;
            }
        }
        return finalPrice;
    }*/
    
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        double price = scanner.nextDouble();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("舱位序号：1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("请选择舱位序号：：");
        int type = scanner.nextInt();
        
        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票的最终价格是：" + finalPrice);
        }
    }
    // 计算机票最终价格的方法
    public static double calFinalPrice(double price, int month, int type) {
        double finalPrice = 0.0;
        if (price < 0) {
            System.out.println("机票的原价输入错误！");
            return -1;
        }
        if (month > 12 || month < 1) {
            System.out.println("月份输入错误！");
            return -1;
        }
        if (type > 3 || type < 1) {
            System.out.println("舱位序号选择错误！");
            return -1;
        }
        if (month >= 5 && month <= 10) {
            switch (type) {
                case 1:
                    finalPrice = price * 0.9;
                    break;
                case 2:
                    finalPrice = price * 0.85;
                    break;
                case 3:
                    finalPrice = price * 0.8;
                    break;
            }
        } else {
            switch (type) {
                case 1:
                    finalPrice = price * 0.7;
                    break;
                case 2:
                    finalPrice = price * 0.65;
                    break;
                case 3:
                    finalPrice = price * 0.6;
                    break;
            }
        }
        return finalPrice;
    }*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        double price = scanner.nextDouble();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("舱位序号：1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("请选择舱位序号：");
        int type = scanner.nextInt();
        
        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票的最终价格是：" + finalPrice);
        }
    }
    
    // 计算机票最终价格的方法
    public static double calFinalPrice(double price, int month, int type) {
        double finalPrice = 0.0;
        if (price < 0 || month > 12 || month < 1 || type > 3 || type < 1) {
            System.out.println("你的输入有误！");
            return -1;
        }
        if (month >= 5 && month <= 10) {
            switch (type) {
                case 1:
                    finalPrice = price * 0.9;
                    break;
                case 2:
                    finalPrice = price * 0.85;
                    break;
                case 3:
                    finalPrice = price * 0.8;
                    break;
            }
        } else {
            switch (type) {
                case 1:
                    finalPrice = price * 0.7;
                    break;
                case 2:
                    finalPrice = price * 0.65;
                    break;
                case 3:
                    finalPrice = price * 0.6;
                    break;
            }
        }
        return finalPrice;
    }
    
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        double price = scanner.nextDouble();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("舱位序号：1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("选择舱位序号：");
        int type = scanner.nextInt();

        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票的最终价格是：" + finalPrice);
        }
    }

    public static double calFinalPrice(double price, int month, int type) {
        double discount;
        if (price < 0 || month > 12 || month < 1 || type > 3 || type < 1) {
            System.out.println("你的输入有误！");
            return -1;
        }
        switch (type) {
            case 1:
                discount = 0.7;
                break;
            case 2:
                discount = 0.65;
                break;
            default:
                discount = 0.6;
        }
        if (month >= 5 && month <= 10) {
            discount += 0.2;
        }
        return price * discount;
    }*/
}
