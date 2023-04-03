package stringregex;

import java.sql.Array;
import java.util.Arrays;

/**
 * @Description split()方法的演示
 * @ClassName SplitDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 11:31
 * @Version 1.0
 */
public class SplitDemo {
    public static void main(String[] args) {
        String line = "sfc5gf1541s5df4s54g1wd5fs4";
        String[] lineArray = line.split("[0-9]+");
        System.out.println(Arrays.toString(lineArray));// [sfc, gf, s, df, s, g, wd, fs]
        String[] lineArray2 = line.split("[0-9]");
        System.out.println(Arrays.toString(lineArray2));// [sfc, gf, , , , s, df, s, , g, wd, fs]
        String line2 = ".213...243.43...";
        String[] lineArray3 = line2.split("\\.");
        System.out.println(Arrays.toString(lineArray3));// [, 213, , , 243, 43]
    }
}
