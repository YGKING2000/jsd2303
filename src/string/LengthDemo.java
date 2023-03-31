package string;

/**
 * @Description length()方法
 * @ClassName LengthDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 11:15
 * @Version 1.0
 */
public class LengthDemo {
    public static void main(String[] args) {
        String s = "好好学习，天天向上！";
        int length = s.length();
        System.out.println(length);
        // String s = "好好学习，天天向上！";
        String s1 = "好好学习，\t天天向上！";
        String s2 = "好好学习 天天向上！";
        System.out.println(s.length());// 10
        System.out.println(s1.length());// 11
        System.out.println(s2.length());// 10
        System.out.println("xxxxx\txx".length());// 8
    }
}
