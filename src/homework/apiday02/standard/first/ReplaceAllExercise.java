package homework.apiday02.standard.first;

import java.util.Arrays;

/**
 * @Description replaceAll()方法的练习
 * @ClassName ReplaceAllExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 08:49
 * @Version 1.0
 */
public class ReplaceAllExercise {
    public static void main(String[] args) {
        String code = "fdf545fg8595d5654f41252sad9654ling5er15yao4454xiao";
        String data1 = code.replaceAll("[5]", "_");
        String data2 = code.replaceAll("[5-9]", "_");
        String data3 = code.replaceAll("[a-z]", "_");
        String data4 = code.replaceAll("[a-z0-9]", "_");
        System.out.println("_\\._");// _\$_
        System.out.println(data1);// fdf_4_fg8_9_d_6_4f412_2sad96_4ling_er1_yao44_4xiao
        System.out.println(data2);// fdf_4_fg____d___4f412_2sad___4ling_er1_yao44_4xiao
        System.out.println(data3);// ___545__8595_5654_41252___9654____5__15___4454____
        System.out.println(data4);// __________________________________________________
    }
}
