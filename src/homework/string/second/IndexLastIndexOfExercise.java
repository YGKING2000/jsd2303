package homework.string.second;

/**
 * @Description indexOf()和lastIndexOf()方法的练习
 * @ClassName IndexLastIndexOfExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:23
 * @Version 1.0
 */
public class IndexLastIndexOfExercise {
    public static void main(String[] args) {
        String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.indexOf("ou"));// 1
        System.out.println(str.indexOf("ou "));// 1
        System.out.println(str.indexOf("you"));// 38
        System.out.println(str.indexOf(""));// 0
        System.out.println(str.indexOf("is"));// -1
    
        System.out.println(str.lastIndexOf("you"));// 38
        System.out.println(str.lastIndexOf("ou"));// 52
    }
}
