package day07;

import java.sql.Array;
import java.util.ArrayList;

/**
 * @ClassName PrimeNumber
 * @Description 查找素数
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 11:10
 * @Version 1.0
 */
public class PrimeNumber {
    public static void main(String[] args) {
        getPrimeNumber(2, 100);
    }
    
    // 打印输出指定范围内的素数的方法
    public static void getPrimeNumber(int min, int max) {
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }
        for (int i = min; i <= max; i++) {
            boolean flag = true;
            for (int j = 2; j <= (int) (Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && i != 1) {
                System.out.print(i + " ");
            }
        }
    }
}
