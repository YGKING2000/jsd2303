package day02;

/**
 * @ClassName VarDemo
 * @Description  变量的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 09:20
 * @Version 1.0
 */
public class VarDemo {
    public static void main(String[] args) {
        /* 变量的的声明 */
        // 声明了一个变量：a
        int a;
        // 声明了三个变量：b、c、d
        int b, c, d;
        
        /* 变量的初始化 */
        // 声明初始化同时进行
        int e = 250;
        // 先声明再初始化
        int f;
        f = 250;
        // 修改变量f的值
        f = 360;
        // 同时声明初始化多个变量
        int g = 3, h = 7, i = 9;
        
        /* 变量的使用 */
        int j = 10;
        int k = j + 5;
        System.out.println("k = " + k);// 15
        System.out.println("k");// k
        k = k + 10;
        System.out.println("k = " + k);
    }
}
