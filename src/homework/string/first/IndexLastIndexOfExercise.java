package homework.string.first;

/**
 * @Description indexOf()和lastIndexOf()的练习
 * @ClassName IndexLastIndexOfExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 19:05
 * @Version 1.0
 */
public class IndexLastIndexOfExercise {
    public static void main(String[] args) {
        String str = "You don't tell me what direction you think I should take";
        System.out.println(str.indexOf("ou"));// 1
        System.out.println(str.indexOf("ou", 2));// 34
        
        System.out.println(str.indexOf("'"));// 7
        System.out.println(str.indexOf("h"));// 19
        System.out.println(str.lastIndexOf("ou"));// 47
        System.out.println(str.lastIndexOf(" t"));// 51
        System.out.println(str.lastIndexOf("d"));// 50
    }
}
