package day02;

/**
 * @ClassName DataTypeDemo
 * @Description 数据类型的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 11:35
 * @Version 1.0
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        // int: 整型，占4个字节，范围是-2147483648~2147483647(-2^31~2^31-1)
        // 在给变量赋值时直接量不能超过范围，超过范围则编译失败
        int a = 379;// 379为整数直接量，默认为int型
        int b = 2147483647;// int数据类型的最大值
        // int c = 2147483648;// 编译失败，超出范围
        int c = b + 1;// 编译成功，但是超出范围
        System.out.println(c);// -2147483648：int数据类型的最小值
        
        
        // long: 长整型，占8个字节，范围是-2^63~2^63-1
        long d = 25L;
        // long e = 100000000000;// 编译失败
        long e = 100000000000000L;
        // 运算时若有可能溢出，则在计算后溢出的两个数中的任一个数后面加上L
        long f = 1000000000 * 2 * 10L;// 20000000000
        System.out.println(f);
        long g = 1000000000 * 3 * 10L;// -12949672960，这里是先溢出后再乘以10L
        System.out.println(g);
        long h = 1000000000L * 3 * 10;// 30000000000
        System.out.println(h);
        
        
        // double: 双精度浮点型，占8个字节
        double i = 3.14;// 3.14为浮点型直接量
        float j = 3.14F;// 3.14F为float型直接量
        // float型变量做精确运算时可能会有舍入误差
        double k = 3.0, l = 2.9;
        System.out.println(k - l);// 0.10000000000000009
        double m = 6.0, n = 4.9;
        System.out.println(m - n);// 1.0999999999999996
        double o = 6.0, p = 1.9;
        System.out.println(o - p);// 4.1
        
        
        // boolean: 布尔型，占1个字节，布尔类型只有true和false两个值
        boolean b1 = true;// true为布尔型直接量
        boolean b2 = false;// false为布尔型直接量
        // boolean b3 = 25;// 编译失败
        
        
        // char: 字符型，占2个字节
        char c1 = 'A';
        char c2 = '男';
        char c3 = ' ';// 编译成功，char型变量可存储空格符
        // char c4 = 'AA';// 编译失败，char型变量不能2个及以上的字符
        // char c5 = '';// 编译失败，char型变量不能存储空
        char c6 = 64;
        System.out.println(c6);// @
        char c7 = '\'';
        System.out.println(c7);// '
        char c8 = '\\';
        System.out.println(c8);// \
        char c9 = '/';
        System.out.println(c9);// /
    }
}
