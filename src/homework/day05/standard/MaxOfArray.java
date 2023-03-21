package homework.day05.standard;

import java.util.Random;

/**
 * @ClassName MaxOfArray
 * @Description 求数组元素最大值
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 19:10
 * @Version 1.0
 */
public class MaxOfArray {
    public static void main(String[] args) {
        /*Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("数组的最大值是：" + max);*/
        
        /*Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        System.out.println("数组中的最大值是：" + max);*/
    
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("数组中的最大值是：" + max);
    }
}

