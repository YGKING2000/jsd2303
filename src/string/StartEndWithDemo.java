package string;

/**
 * @Description 判断当前字符串是否以指定字符串开头或者结尾
 * @ClassName StartEndWithDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 14:20
 * @Version 1.0
 */
public class StartEndWithDemo {
    public static void main(String[] args) {
        String str = "thinking in Java";
        System.out.println(str.startsWith("hi", 0));// false
        System.out.println(str.startsWith("hi", 1));// true
        System.out.println(str.startsWith("hi", 2));// false
    
        System.out.println(str.endsWith("ava"));// true
        System.out.println(str.endsWith(" Java"));// true
        System.out.println(str.endsWith("av"));// false
    }
}
