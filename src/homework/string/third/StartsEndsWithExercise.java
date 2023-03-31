package homework.string.third;

/**
 * @Description
 * @ClassName StartsEndsWithExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 21:17
 * @Version 1.0
 */
public class StartsEndsWithExercise {
    public static void main(String[] args) {
        String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.startsWith("You"));// true
        System.out.println(str.startsWith("df"));// false
        System.out.println(str.endsWith("!"));// true
        System.out.println(str.endsWith("take!"));// true
        System.out.println(str.endsWith("!ekat"));// false
    }
}
