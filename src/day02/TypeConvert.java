package day02;

/**
 * @ClassName TypeConverse
 * @Description 类型转换
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 16:10
 * @Version 1.0
 */
public class TypeConvert {
    public static void main(String[] args) {
        /* 1.自动转换 */
        int num = 100;
        long num1 = num;
        
        float num2 = 3.14F;
        double num3 = num2;
        
        /* 2.强制转换 */
        // (1)强制转换数据类型会可能发生溢出
        long l = 10000000000L;
        int i = (int) l;
        System.out.println(i);// 1410065408
        // (2)强制转换数据类型会可能发生精度丢失
        double d = 3.1415926;
        int i1 = (int) d;
        System.out.println(i1);// 3
        float f = (float) d;
        System.out.println(f);// 3.1415925
        
        /* 3.整型直接量可以直接赋值给byte、short、char */
        char c = 56;
        short s = 56;
        byte b = 56;
        
        /* 4.数据类型byte、short、char在运算时会转换成int数据类型 */
        short s1 = 55;
        short s2 = (short) (s + s1);
        System.out.println(s2);// 111
        System.out.println(2 + 2);// 4
        System.out.println(2 + '2');// 52
        System.out.println('2' + '2');// 100
        System.out.println('2');// 2
        
        /* 5.查看字符对应的码 */
        int a = '*';
        System.out.println(a);// 42
        
        /* 6.查看码对应的字符 */
        char a1 = 63;
        System.out.println(a1);// ?
    }
}
