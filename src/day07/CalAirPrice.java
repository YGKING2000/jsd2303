package day07;

import java.util.Scanner;

/**
 * @ClassName CalAirPrice
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 14:32
 * @Version 1.0
 */
public class CalAirPrice {
    /*
     * 机票价格按照季节(淡季、旺季)、舱位(头等舱、商务舱、经济舱)收费
     * 输入机票原价、月份和舱位，实现不同的折扣
     * ---旺季5~10月，头等舱9折、商务舱85折、经济舱8折
     * ---淡季11月~来年4月，头等舱7折，商务舱65折，经济舱6折
     */
    public static void main(String[] args) {
        // 实例化Scanner类的对象
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价：");
        double price = scanner.nextDouble();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("舱位展示：1.头等舱\t2.商务舱\t3.经济舱");
        System.out.print("请输入你想选择的仓位序号：");
        int type = scanner.nextInt();
        
        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票最终价格是：" + finalPrice);
        }
    }
    
    // 计算机票最终价格并将其值返回的方法
    public static double calFinalPrice(double price, int month, int type) {
        // 机票打折的力度
        double discount;
        // 只要用户输入错误，就返回-1，结束方法执行
        if (price < 0 || month > 12 || month < 1 || type > 3 || type < 1) {
            System.out.println("输入错误！");
            return -1;
        }
        // 同一舱位，淡季与旺季的折扣差为2折
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
    }
}
