package homework.apiday01_string.third;

/**
 * @Description substring()方法的练习
 * @ClassName SubstringExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 21:02
 * @Version 1.0
 */
public class SubstringExercise {
    public static void main(String[] args) {
        String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.substring(0, str.length()));// String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.substring(0, 22));// You don't tell me what
        System.out.println(str.substring(22));//  direction what you think I should take!
    }
}
