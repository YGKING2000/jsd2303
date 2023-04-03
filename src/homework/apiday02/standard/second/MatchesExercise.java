package homework.apiday02.standard.second;

/**
 * @Description matches()方法的练习
 * @ClassName MatchesExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 20:24
 * @Version 1.0
 */
public class MatchesExercise {
    public static void main(String[] args) {
        String email1 = "18960706057@163.com";
        String email2 = "1896$0706057@163.cn.com";
        String email3 = "189asd60weg_706057@163.com";
        String email4 = "189fdf$60706057@sad163.com.com.cn.cn";
        String regExp = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.com|\\.cn)+";
        System.out.println(email1.matches(regExp));// true
        System.out.println(email2.matches(regExp));// false
        System.out.println(email3.matches(regExp));// true
        System.out.println(email4.matches(regExp));// false
    }
}
