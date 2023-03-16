package homework.day02;

/**
 * @ClassName VariableExercise
 * @Description 变量的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 17:32
 * @Version 1.0
 */
public class VariableExercise {
    public static void main(String[] args) {
        // 声明一个变量
        int a;
        
        // 一次声明多个变量
        int b, c, d;
        
        // 声明变量直接初始化
        int e = 5;
        int f = 7;
        
        // 先声明变量，而后再给变量初始化
        int a1, b1;
        a1 = 9;
        b1 = 3;
    
        // 声明整型变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值
        int g = 15;
        int h = g + 10;
        System.out.println(h);// 25
    
        // 在g本身基础之上增10，输出变量g的值
        g = g + 10;
        System.out.println(g);// 25
    
        // 声明一些正确的和错误的变量名
        int num;
        int num10;
        int int10;
        int _10;
        int _$$$$__10515;
        
        // int 10do; // 不能以数字开头
        // int **10; // 不能包含26个英文字母大小写、0~9、_和$之外的字符
        // int do do; // 不能包含空格
        // int num; // 不能声明已经声明过的变量
        // int int; // 不能是关键字
        // int goto; // 不能是保留字
        // int const; // 不能是保留字
    }
}
