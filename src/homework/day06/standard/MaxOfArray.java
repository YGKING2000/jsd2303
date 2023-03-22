package homework.day06.standard;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName MaxOfArray
 * @Description 求数组元素最大值并放在最后一个元素的的下一个位置
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/22 17:36
 * @Version 1.0
 */
public class MaxOfArray {
    // 求数组元素最大值并放在最后一个元素的的下一个位置
    // 要求：声明整型数组并填充随机数据，找到最大值，将数组扩容并将最大值放末尾
    /*public static void main(String[] args) {
        int[] data = getIntArray(10, 100);
        System.out.print("数组data刚生成：");
        showArray(data);
        int max = getMax(data);
        System.out.println("数组data的最大值是：" + max);
        System.out.print("数组data扩容后：");
        data = Arrays.copyOf(data, data.length + 1);
        showArray(data);
        System.out.print("数组data填充数据后：");
        data[data.length - 1] = max;
        showArray(data);
    }
    
    public static int[] getIntArray(int length, int max) {
        Random random = new Random();
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max + 1);
        }
        return data;
    }
    
    public static void showArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            if (i != data.length - 1) {
                System.out.print(data[i] + ", ");
            } else {
                System.out.println(data[i] + "]");
            }
        }
    }
    
    public static int getMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }*/
    
    public static void main(String[] args) {
        // 生成数组并打印输出
        int[] data = getIntArray(19, 100);
        printArray(data);
        
        // 找到数组最大值并打印输出
        int max = getMax(data);
        System.out.println("数组打他中的最大值是：" + max);
        
        // 数组扩容后打印输出
        data = Arrays.copyOf(data, data.length + 1);
        printArray(data);
        
        // 数组最后一个元素赋最大值后打印输出
        data[data.length - 1] = max;
        printArray(data);
        
    }
    
    // 生成数组指定长度、指定范围的数组的方法
    public static int[] getIntArray(int length, int max) {
        Random random = new Random();
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max + 1);
        }
        return data;
    }
    
    // 打印输出数组的方法
    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                System.out.print("[" + data[i] + ", ");
            } else if (i == data.length - 1) {
                System.out.println(data[i] + "]");
            } else {
                System.out.println(data[i] + ", ");
            }
        }
    }
    
    // 获取数组最大值的方法
    public static int getMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            max = Math.max(max, data[i]);
        }
        return max;
    }
}
