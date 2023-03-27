package extratask.extratask_1;

import java.util.Scanner;

/**
 * @ClassName CalAirPrice
 * @Description 计算机票的打折后的价格————练习分支和方法
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/25 08:37
 * @Version 1.0
 */
public class CalAirPrice {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        double price = scanner.nextInt();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("请选择舱位序号：");
        int type = scanner.nextInt();
        
        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票的最终价格是：" + finalPrice);
        }
    }
    
    public static double calFinalPrice(double price, int month, int type) {
        double discount;
        if (price < 0 || month > 12 || month < 1 || type > 3 || type < 1) {
            System.out.println("你输入的数据有误！");
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
        return discount * price;
    }*/
    
    public static void main(String[] args) {
        // 实例化Scanner类的对象scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        // 接收用输入的机票原价
        double price = scanner.nextDouble();
        System.out.print("请输入月份：");
        // 接收用户输入的月份
        int month = scanner.nextInt();
        System.out.println("舱位序号：1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("请选择舱位序号：");
        // 接受用户输入的舱位序号
        int type = scanner.nextInt();
        
        double finalPrice = calFinalPrice(price, month, type);
        // 判断用户的输入准确后再输出机票价格
        if (finalPrice != -1) {
            System.out.println("机票的最终价格是：" + finalPrice);
        }
    }
    
    // 计算机票最终价格的方法
    public static double calFinalPrice(double price, int month, int type) {
        double finalPrice =0.0;
        // 判断用户输入的数据是否符合要求
        if (price < 0 || month > 12 || month < 1 || type > 3 || type < 1) {
            System.out.println("你的输入有误！");
            return -1;
        }
        // 输入月份是旺季时
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
        } else {// 输入月份是淡季时
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
}
