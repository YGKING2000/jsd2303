package homework.apiday02.standard.first;

import java.util.Arrays;

/**
 * @Description split()方法的练习
 * @ClassName SplitExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 17:58
 * @Version 1.0
 */
public class SplitExercise {
    public static void main(String[] args) {
        String code = "fdf545fg8595d5654f41252sad9654ling5er15yao4454xiao";
        String[] data = code.split("[0-9]+");
        String[] data2 = code.split("[0-5]+");
        String[] data3 = code.split("[a-z]+");
        String[] data4 = code.split("[5]");
        System.out.println(Arrays.toString(data));// [fdf, fg, d, f, sad, ling, er, yao, xiao]
        System.out.println(Arrays.toString(data2));// [fdf, fg8, 9, d, 6, f, sad96, ling, er, yao, xiao]
        System.out.println(Arrays.toString(data3));// [, 545, 8595, 5654, 41252, 9654, 5, 15, 4454]
        System.out.println(Arrays.toString(data4));// [fdf, 4, fg8, 9, d, 6, 4f412, 2sad96, 4ling, er1, yao44, 4xiao]
    }
}
