package homework.string.third;

/**
 * @Description String类的对象的两种创建方式以及内存分配地址的练习
 * @ClassName StringDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:52
 * @Version 1.0
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str1 == str2);// true
        System.out.println(str1 == str3);// true
        System.out.println(str3 == str2);// true
        
        String s = "hello";
        String s1 = new String("hello");
        System.out.println(s == s1);// false
        System.out.println(s.equals(s1));// true
    }
}
