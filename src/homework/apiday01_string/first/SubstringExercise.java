package homework.apiday01_string.first;

/**
 * @Description substring()的练习
 * @ClassName SubstringExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 19:32
 * @Version 1.0
 */
public class SubstringExercise {
    public static void main(String[] args) {
        String str = "All For Love";
        System.out.println(str.substring(0, 2));// Al
        System.out.println(str.substring(0, 3));// All
        System.out.println(str.substring(4));// For Love
        System.out.println(str.substring(0));// All For Love
    }
}
