package homework.day05.extensional;

import java.util.Random;

/**
 * @ClassName GetMaxAndMin
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 20:42
 * @Version 1.0
 */
public class GetMaxAndMin {
    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(201) - 100;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        int max = data[0];
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
            if (max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("数组的最大值是：" + max + "，最小值是：" + min);
    }
}
