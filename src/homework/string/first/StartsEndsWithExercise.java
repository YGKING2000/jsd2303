package homework.string.first;

/**
 * @Description startsWith()和endsWith()方法的练习
 * @ClassName StartsEndsWith
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 19:23
 * @Version 1.0
 */
public class StartsEndsWithExercise {
    public static void main(String[] args) {
        String str = "thinking in Java";
        System.out.println(str.startsWith("thi"));// true
        System.out.println(str.startsWith("this"));// false
        System.out.println(str.startsWith("ink"));// false
        System.out.println(str.startsWith("ink", 2));// true
    
        System.out.println(str.endsWith("ava"));// true
        System.out.println(str.endsWith("script"));// false
    }
}
