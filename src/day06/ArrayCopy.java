package day06;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArrayCopy
 * @Description 数组复制的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/22 09:11
 * @Version 1.0
 */
public class ArrayCopy {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("arr: " + Arrays.toString(arr));// arr: [53, 47, 64, 42, 8, 17, 19, 30, 33]
        // 1.System.arraycopy(被复制的数组, 从被复制数组的复制开始的位置, 接收数据的数组, 接受数据数组的接收数据起始下标, 需要接受几个元素);
        // System.arraycopy(Object src, int scrPosition, Object destination, int destinationPosition, int length);
        // 注意事项：不管是被复制数组的元素不够截取还是接收数组的长度不够，都会报数组索引越界异常(ArrayIndexOutOfBoundsException)
        int[] data = new int[10];
        System.arraycopy(arr, 0, data, 0, 9);
        System.out.println("data: " + Arrays.toString(data));// data: [53, 47, 64, 42, 8, 17, 19, 30, 33, 0]
        
        // 2.int[] arr2 = Array.copyOf(arr, data.length);
        // int[] arr2 = Array.copyOf(被复制的数组, 目标数组的长度);
        /*
         * 注意事项：
         * 被复制数组的长度 > 目标数组的长度，截取掉末尾的元素
         * 被复制数组的长度 < 目标数组的长度，不够的部分用默认值补位
         */
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, 15);
        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        
        // 数组的长度定义后就不能改变了，因为数组在内存里是一段连续的空间
        // 数组扩容：实际上没有对data的原数组进行扩容，只是在底层重新new了一个新数组，并将这个新数组赋值给了data
        data = Arrays.copyOf(data, 19);
        System.out.println("data:" + Arrays.toString(data));
    }
}
