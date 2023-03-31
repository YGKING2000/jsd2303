package homework.string.second;

/**
 * @Description substring()方法的练习
 * @ClassName SubstringExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:31
 * @Version 1.0
 */
public class SubstringExercise {
    public static void main(String[] args) {
        String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.substring(0));// You don't tell me what direction what you think I should take!
        System.out.println(str.substring(0, 14));// You don't tell
        System.out.println(str.substring(15, str.length()));// me what direction what you think I should take!
    }
}
