package homework.day02;

/**
 * @ClassName LongExercise
 * @Description long数据类型的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 17:47
 * @Version 1.0
 */
public class LongExercise {
    public static void main(String[] args) {
        // 声明初始化两个以上的长整型变量
        long a = 100000000000L;
        long b = 100000000000l;
    
        // 声明变量存储几个较大数据的运算，演示: 若有可能溢出建议将L设计在第1个数字后
        int c = 2000000000;
        int d = 2000000000;
        long e = c + d;
        System.out.println(e);// -294967296
        long f = 2000000000L + 2000000000;
        System.out.println(f);// 4000000000
    }
}
