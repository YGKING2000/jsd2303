package homework.apiday02.standard.third;

/**
 * @Description matches()方法的练习
 * @ClassName MatchesExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 21:06
 * @Version 1.0
 */
public class MatchesExercise {
    public static void main(String[] args) {
        String regExp = "[0-9a-zA-Z_]+@[0-9a-zA-Z]+(\\.com|\\.cn)+";
        String data1 = "159ds345f@sads.mskds.com";
        String data2 = "th_15_AdFC9ds345f@sads.cn.com";
        String data3 = "159ds__$#345f@sads.cmo.com.com";
        String data4 = "159ds345__aDXsf@sads.com";
        System.out.println(data1.matches(regExp));// false
        System.out.println(data2.matches(regExp));// true
        System.out.println(data3.matches(regExp));// false
        System.out.println(data4.matches(regExp));// true
    }
}
