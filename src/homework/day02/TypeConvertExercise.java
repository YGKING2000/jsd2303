package homework.day02;

/**
 * @ClassName TypeConvertExercise
 * @Description 数据类型转换方式的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 18:32
 * @Version 1.0
 */
public class TypeConvertExercise {
    public static void main(String[] args) {
        // 声明几个变量，演示自动类型转换和强制类型转换的语法
        // 1.自动类型转换/隐式类型转换
        // 1)int ==> long
        int a = 128;
        long b = a;
        // 2)float ==> double
        float c = 3.01415F;
        double d = c;
        // 3)int ==> double
        double e = a;
        
        // 2.强制类型转换
        // 1)int ==> short
        int f = 128;
        short s = (short) f;
        // 2)double ==> float
        double i = 3.05;
        float j = (float) i;
        // 3)float ==> byte
        float g = 3.14F;
        byte h = (byte) g;
        System.out.println(h);// 3
    
        // 声明一个较大类型的长整型变量，演示强转可能会发生的溢出问题
        int k =  128;
        byte l = (byte) k;
        System.out.println(l);// -128
    
        // 声明一个较大精度的浮点型变量，演示强转可能会发生的丢失精度问题
        double m = 3.141592653589;
        float n = (float) m;
        System.out.println(n);// 3.1415927
    }
}
