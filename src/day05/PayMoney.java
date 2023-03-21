package day05;

/**
 * @ClassName MoneyPay
 * @Description 现在有充足的1元、2元、5元、10元和20元，有多少种方式支付100元
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 11:48
 * @Version 1.0
 */
public class PayMoney {
    public static void main(String[] args) {
        // 现在有充足的1元、2元、5元、10元和20元，有多少种方式支付100元
        int count = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 20; k++) {
                    for (int l = 0; l <= 50; l++) {
                        for (int m = 0; m <= 100; m++) {
                            if (i * 20 + j * 10 + k * 5 + l * 2 + m == 100) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("一共有" + count + "种方法");
    }
}
