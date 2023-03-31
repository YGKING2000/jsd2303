package string;

/**
 * @Description String类的演示
 * @ClassName StringDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 09:53
 * @Version 1.0
 */
public class StringDemo {
    public static void main(String[] args) {
        String s;
        // 使用字面量双引号""来创建字符串对象时，JVM会检查常量池中是否有该对象:
        // 1)若没有，则会创建字符串对象，并将其引用存入到常量池中
        // 2)若有，则直接将常量池中的引用返回，并不会创建新的字符串对象
        String s1 = "123abc";
        String s2 = "123abc";
        // String s3 = "123abc";
        // ==比较对象时其实比较的是两者的地址值
        // System.out.println(s1 == s2);// true
        // System.out.println(s1 == s3);// true
        // System.out.println(s2 == s3);// true
        
        // 下面这句语句并没有修改s1对象，而是创建了一个新对象并重新将地址值赋给s1
        s1 = s1 + "!";
        System.out.println(s1 == s2);// false
        System.out.println("---------");
        
        
        
        String s4 = "123abc";// 在堆中创建123abc字面量对象
        // 在编译后下面这句话等于：String s5 = "123abc";
        String s5 = "123" + "abc";
        System.out.println(s4 == s5);// true
        
        String s6 = "123";
        // 因为有个s6这个变量，所以下面这句话不会编译成：“String s7 = "123" + "abc";”，s6在字节码文件中还是一个变量，
        // 只有在执行时才会加载s6具体的值
        String s7 = s6 + "abc";
        System.out.println(s6 == s7);// false
        System.out.println("------------");
        
        String s8 = "hello";
        String s9 = new String(s8);
        String s10 = new String("hello");
        System.out.println(s8 == s9);//false
        System.out.println(s8 == s10);//false
        // equals()方法比较的是字符串内容
        System.out.println(s8.equals(s9));// true
        System.out.println(s8.equals(s10));// true
    }
}
