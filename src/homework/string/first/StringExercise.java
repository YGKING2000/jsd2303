package homework.string.first;

/**
 * @Description 字符串的创建和堆内存分配问题
 * @ClassName StringDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 17:54
 * @Version 1.0
 */
public class StringExercise {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str1 == str2);// true
        System.out.println(str2 == str3);// true
        System.out.println(str2 == str3);// true
        
        String s = "hello";
        String s1 = new String("hello");
        System.out.println(s == s1);// false
        System.out.println(s.equals(s1));// true
    }
}
