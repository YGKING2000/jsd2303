package day06;

import java.util.Arrays;

/**
 * @ClassName MaxOfArrayDemo
 * @Description 找出数组最大值
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 15:48
 * @Version 1.0
 */
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // 对数组进行扩容将数组长度加1，并将最大值赋值到最后一位
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = max;
        System.out.println("数组arr中的最大值是：" + max);
        System.out.println(Arrays.toString(arr));
        // 1.冒泡排序
        /*for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    exchange(arr, j, j + 1);
                }
            }
        }*/
        
        // 2.选择排序
        /*for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    exchange(arr, i, j);
                }
            }
        }*/
        
        // 3.快速排序
        /*quickSort(arr, 0, arr.length - 1);*/
        
        // 4.插入排序
        /*for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    exchange(arr, j - 1, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
    }
    
    public static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int base = arr[0];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && arr[++low] < base) ;
                while (high > start && arr[--high] > base) ;
                if (low < high) {
                    exchange(arr, low, high);
                } else {
                    break;
                }
            }
            exchange(arr, start, high);
            
            quickSort(arr, start, high - 1);
            quickSort(arr, high + 1, end);
        }
    }
}
