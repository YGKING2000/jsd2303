package stringregex;

/**
 * @Description match()方法的演示
 * @ClassName MatchesDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 10:42
 * @Version 1.0
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String regExp = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.com|\\.cn)+";
        // [a-zA-Z0-8_]+@[a-zA-Z0-9]+(\.com|\.cn)+
        String email1 = "hrd18960706057@163.com";
        String email2 = "hrd1896$0706057@163.com";
        String email3 = "hrd18960706057@163.com.cn";
        String email4 = "hrd_18_960706057@163.cn.com.cn.com";
        boolean match1 = email1.matches(regExp);
        boolean match2 = email2.matches(regExp);
        boolean match3 = email3.matches(regExp);
        boolean match4 = email4.matches(regExp);
        System.out.println(match1);// true
        System.out.println(match2);// false
        System.out.println(match3);// true
        System.out.println(match4);// true
    }
}
