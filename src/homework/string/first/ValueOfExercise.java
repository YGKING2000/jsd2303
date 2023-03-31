package homework.string.first;

/**
 * @Description String.valueOf()静态方法的练习
 * @ClassName ValueOfExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 19:38
 * @Version 1.0
 */
public class ValueOfExercise {
    public static void main(String[] args) {
        int num = 123;
        double num2 = 3.1415926;
        boolean flag = false;
        boolean flag1 = true;
        
        String str = String.valueOf(num);
        String str1 = String.valueOf(num2);
        String str2 = String.valueOf(flag);
        String str3 = String.valueOf(flag1);
        System.out.println(str);// 123
        System.out.println(str1);// 3.1415926
        System.out.println(str2);// false
        System.out.println(str3);// true
    }
}
