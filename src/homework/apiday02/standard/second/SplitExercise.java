package homework.apiday02.standard.second;

import java.util.Arrays;

/**
 * @Description split()的练习
 * @ClassName SplitExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 20:31
 * @Version 1.0
 */
public class SplitExercise {
    public static void main(String[] args) {
        String code = "asf45ddf4SdDFd85sdf8aBDF5";
        String[] data = code.split("[0-9]+");
        String[] data2 = code.split("[0-9a-z]+");
        String[] data3 = code.split("[0-9A-Z]+");
        String[] data4 = code.split("[0-5]+");
        System.out.println(Arrays.toString(data));// [asf, ddf, SdDFd, sdf, aBDF]
        System.out.println(Arrays.toString(data2));// [, S, DF, BDF]
        System.out.println(Arrays.toString(data3));// [asf, ddf, d, d, sdf, a]
        System.out.println(Arrays.toString(data4));// [asf, ddf, SdDFd8, sdf8aBDF]
    }
}
