package homework.apiday01_string.third;

/**
 * @Description trim()方法的练习
 * @ClassName TrimExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:59
 * @Version 1.0
 */
public class TrimExercise {
    public static void main(String[] args) {
        String str = "   Hello CD  1  ";
        String str1 = "\tdd\t";
        System.out.println(str.trim());// Hello CD  1
        System.out.println(str1.trim());// dd
    }
}
