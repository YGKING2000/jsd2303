package homework.apiday02.standard.third;

import java.util.Arrays;

/**
 * @Description split()方法的练习
 * @ClassName SplitExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 21:11
 * @Version 1.0
 */
public class SplitExercise {
    public static void main(String[] args) {
        String code = "sdf4959sfs834555ddw8w8CFdaHG765rFX";
        String[] data = code.split("[0-9]");
        String[] data1 = code.split("[0-9]+");
        String[] data2 = code.split("[0-9a-z]");
        String[] data3 = code.split("[0-9A-Z]+");
        System.out.println(Arrays.toString(data));// [sdf, , , , sfs, , , , , , ddw, w, CFdaHG, , , rFX]
        System.out.println(Arrays.toString(data1));// [sdf, sfs, ddw, w, CFdaHG, rFX]
        System.out.println(Arrays.toString(data2));// [, , , , , , , , , , , , , , , , , , , , , , CF, , HG, , , , FX]
        System.out.println(Arrays.toString(data3));// [sdf, sfs, ddw, w, da, r]
    }
}
