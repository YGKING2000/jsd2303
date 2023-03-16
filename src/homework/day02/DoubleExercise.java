package homework.day02;

/**
 * @ClassName DoubleExercise
 * @Description double数据类型的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 17:52
 * @Version 1.0
 */
public class DoubleExercise {
    public static void main(String[] args) {
        // 声明初始化两个以上的浮点型变量
        double a = 3.4;
        double b = 3.1415926;
        double c = 3.0;
    
        // 声明几个浮点型变量并将它们做数学操作，演示double运算的舍入误差问题
        // 1.输出的比正确的值小
        double d = 6.0;
        double e = 4.9;
        System.out.println(d - e);// 1.0999999999999996
        
        // 2.输出的值比正确的值大
        double f = 3.0;
        double g = 2.9;
        System.out.println(f - g);// 0.10000000000000009
        
        // 3.没有舍入误差
        double h = 6.0;
        double i = 1.9;
        System.out.println(h - i);// 4.1
    }
}
