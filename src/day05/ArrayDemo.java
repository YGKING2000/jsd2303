package day05;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArrayDemo
 * @Description 数组的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 14:03
 * @Version 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 1.数组的定义
        // (1)静态初始化
        // int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // double[] array2 = new double[] {3.14, 2.56, 3.0, 15.0, 0.12};
        double[] array2 = {3.14, 2.56, 3.0, 15.0, 0.12};
        // boolean[] array4 = new boolean[] {false, true, false, true, true, true, false};
        boolean[] array4 = {false, true, false, true, true, true, false};
        // (2)动态初始化
        // 声明了一个int型数组名为array1，包含10个元素，每个元素都是int型，默认值是0
        int[] array1 = new int[10];
        // 声明了一个double型数组名为array3，包含9个元素，每个元素都是double型，默认值是0.0
        double[] array3 = new double[9];
        // 声明了一个boolean型数组名为array5，包含7个元素，每个元素都是boolean型，默认值是false
        boolean[] array5 = new boolean[7];
        
        // 2.数组的访问
        int[] arr = new int[3];
        System.out.println("数组arr的长度是：" + arr.length);
        System.out.println(arr[0]);// 输出数组arr第一个元素
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr[arr.length - 1]);// 输出数组arr最后一个元素
        // arr[3] = 400;// ArrayIndexOutOfBoundsException:数组索引越界异常
        
        // 3.数组的遍历/迭代
        int[] arr2 = new int[10];
        // System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            // arr2[i] = 100;
            arr2[i] = (int) (Math.random() * 100);
            // System.out.print(arr2[i] + " ");
        }
        // Arrays.fill(arr2, 100);
        
        // 4.数组的排序
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        /*for (int i = 0; i < arr2.length / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }*/
        System.out.println(Arrays.toString(arr2));
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }
        
        // 5.Random的使用
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(data));
    }
}
