package homework.day06.extensional;

import homework.day06.standard.MethodExercise;

import java.util.Arrays;

/**
 * @ClassName MethodTest
 * @Description 方法的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/22 19:23
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        // 1.定义一个方法getMax0fArray()，用于获取数组元素的最大值并返回，测试方法
        int[] data = MethodExercise.generateArray(10, 100);
        int max = getMax(data);
        System.out.println(max + "\n");
        
        // 2.定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法
        printArrayData(data);
    }
    
    // 1.定义一个方法getMax0fArray()，用于获取数组元素的最大值并返回
    public static int getMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            // if (max < data[i]) {
                // max = data[i];
                // max = max > data[i] ? max : data[i];
                max = Math.max(max, data[i]);
            // }
        }
        return max;
    }
    
    // 2.定义一个printArrayData()，用于输出整型数组的每一个元素的值
    public static void printArrayData(int[] data) {
        /*for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }*/
        for (int item : data) {
            System.out.print(item + " ");
        }
    }
}
