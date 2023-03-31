package homework.string.first;

/**
 * @Description trim()方法的练习
 * @ClassName TrimExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 18:56
 * @Version 1.0
 */
public class TrimExercise {
    public static void main(String[] args) {
        String str = "    hello   world  !   ";
        str = str.trim();
        System.out.println(str);// hello   world  !
        
        String str2 = "\tds\tsa";
        System.out.println(str2);// 	ds	sa
        str2 = str2.trim();
        System.out.println(str2);// ds	sa
    }
}
