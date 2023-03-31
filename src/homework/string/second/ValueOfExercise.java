package homework.string.second;

/**
 * @Description String类的静态方法valueOf()的练习
 * @ClassName ValueOfExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:38
 * @Version 1.0
 */
public class ValueOfExercise {
    public static void main(String[] args) {
        int num = 123456789;
        double num1 = .01415926;
        boolean flag = true;
        boolean flag1 = false;
        String s = String.valueOf(num);
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(flag);
        String s3 = String.valueOf(flag1);
        System.out.println(s);// 123456789
        System.out.println(s1);// 3.1415926
        System.out.println(s2);// true
        System.out.println(s3);// false
    }
}
