package homework.day05.standard;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArraySort
 * @Description 数组排序
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 19:20
 * @Version 1.0
 */
public class ArraySort {
    public static void main(String[] args) {
        /*Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(201) - 100;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }*/
    
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(201) - 100;
        }
        System.out.println("排序前是：" + Arrays.toString(data));
        // 1.冒泡排序
        /*for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j+1] = temp;
                }
            }
        }*/
        
        // 2.选择排序
        /*for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }*/
        
        // 3.插入排序
        /*for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                } else {
                    break;
                }
            }
        }*/
        
        // 4.快速排序
        quickSort(data, 0, data.length - 1);
        System.out.println("排序后是：" + Arrays.toString(data));
    }
    
    public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] < base);
                while (high > start && data[--high] > base);
                if (low < high) {
                    exchange(data, low, high);
                } else {
                    break;
                }
            }
            exchange(data, start, high);
            
            quickSort(data, start, high - 1);
            quickSort(data, high + 1, end);
        }
    }
    
    public static void exchange(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
