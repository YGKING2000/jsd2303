package extratask.extratask_1;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName MaxOfArray
 * @Description 完成MaxOfArray求数组元素最大值并放在最后一位————练习数组、循环
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 20:38
 * @Version 1.0
 */
public class MaxOfArray {
    /*public static void main(String[] args) {
        int[] data = generateArray(10, 1000);
        outArray(data);
        int max = getMax(data);
        System.out.println("数组的最大值是：" + max);
        data = Arrays.copyOf(data, data.length + 1);
        outArray(data);
        data[data.length - 1] = max;
        outArray(data);
    }
    
    public static int getMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }
    
    public static void outArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            if (i != data.length - 1) {
                System.out.print(data[i] + ", ");
            } else {
                System.out.println(data[i] + "]");
            }
        }
    }
    
    public static int[] generateArray(int length, int max) {
        int[] data = new int[length];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max + 1);
        }
        return data;
    }*/
    
    public static void main(String[] args) {
        // 接收生成的数组
        int[] data = generateArray(10, 1000);
        // 在控制台输出数组
        outArray(data);
        // 获取数组最大值
        int max = getMax(data);
        // 输出数组最大值
        System.out.println("数组最大值：" + max);
        // 数组扩容
        data = Arrays.copyOf(data, data.length + 1);
        // 在控制台输出数组
        outArray(data);
        // 将最大值赋值给数组最后一位
        data[data.length - 1] = max;
        // 在控制台输出数组
        outArray(data);
    }
    
    // 在控制台输出数组的方法
    public static void outArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            if (i != data.length - 1) {
                System.out.print(data[i] + ", ");
            } else {
                System.out.println(data[i] + "]");
            }
        }
    }
    
    // 生成指定长度、指定范围的数组
    public static int[] generateArray(int length, int max) {
        Random random = new Random();
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max + 1);
        }
        return data;
    }
    
    // 判断数组的最大值并返回
    public static int getMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }
}
