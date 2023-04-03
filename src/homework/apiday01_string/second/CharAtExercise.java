package homework.apiday01_string.second;

/**
 * @Description charAt()方法的练习
 * @ClassName CharAtExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:35
 * @Version 1.0
 */
public class CharAtExercise {
    public static void main(String[] args) {
        String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.charAt(11));// e
        System.out.println(str.charAt(0));// Y
        System.out.println(str.charAt(0) + str.charAt(15) + str.charAt(str.length() - 1));// 231
    }
}
