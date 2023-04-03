package homework.apiday02.standard.first;

/**
 * @Description matches()方法的练习
 * @ClassName MatchesExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 17:47
 * @Version 1.0
 */
public class MatchesExercise {
    public static void main(String[] args) {
        String code = "18960706057@163.com";
        String code1 = "hxd18960706057@163.com";
        String code2 = "189$6070$6057@163.com.com";
        String code3 = "18960706057@163.cn.com";
        // [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.com|\.cn)+
        String regExp = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.com|\\.cn)+";
        System.out.println(code.matches(regExp));// true
        System.out.println(code1.matches(regExp));// true
        System.out.println(code2.matches(regExp));// false
        System.out.println(code3.matches(regExp));// true
    }
}
