package homework.string.third;

/**
 * @Description valueOf()方法的练习
 * @ClassName ValueOfExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 21:05
 * @Version 1.0
 */
public class ValueOfExercise {
    public static void main(String[] args) {
        int num = 16556325;
        float num2 = 156655.15F;
        boolean flag = true;
        boolean flag1 = false;
        String s = String.valueOf(num);
        String s1 = String.valueOf(num2);
        String s2 = String.valueOf(flag);
        String s3 = String.valueOf(flag1);
        System.out.println(s);// 16556325
        System.out.println(s1);// 156655.16
        System.out.println(s2);// true
        System.out.println(s3);// false
    }
}
