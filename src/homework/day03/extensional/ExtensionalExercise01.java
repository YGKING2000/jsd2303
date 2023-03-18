package homework.day03.extensional;

/**
 * @ClassName ExtensionalExercise01
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:42
 * @Version 1.0
 */
public class ExtensionalExercise01 {
    public static void main(String[] args) {
        // 声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现:条件运算符、if..else分支结构
        // 方式一: 条件运算符
        int a = 7;
        int b = 9;
        int max = a > b ? a : b;
        System.out.println(max);// 9
        
        // 方式二: if...else分支结构
        int c = 156;
        int d = 116;
        int max1 = c;
        if (c < d) {
            max1 = d;
        }
        System.out.println(max1);// 156
        
        // 方式三: Math.max(参数1, 参数2);
        int e = 196;
        int f = 202;
        int max2 = Math.max(e, f);
        System.out.println(max2);// 202
    
        double x = 1000 / 3.0;
        System.out.printf("%8.3f", x);
    }
}
