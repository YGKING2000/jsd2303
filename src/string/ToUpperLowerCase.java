package string;

/**
 * @Description 转换为全大写/全小写
 * @ClassName ToUpperCase
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 14:08
 * @Version 1.0
 */
public class ToUpperLowerCase {
    public static void main(String[] args) {
        String str = "我爱Java！";
        String upper = str.toLowerCase();
        String lower = str.toLowerCase();
        System.out.println(upper);// 我爱JAVA！
        System.out.println(lower);// 我爱java！
    }
}
