package homework.day02;

/**
 * @ClassName CharExercise
 * @Description char数据类型的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 18:02
 * @Version 1.0
 */
public class CharExercise {
    public static void main(String[] args) {
        // 1.声明初始化五个以上的字符型变量
        char b = 64;
        char c = '9';
        char d = 'd';
        char e = ';';
        char f = '"';
        char i = '男';
        System.out.println(b);// @
        System.out.println(c);// 9
        System.out.println(d);// d
        System.out.println(e);// ;
        System.out.println(f);// "
        System.out.println(i);// 男
    
    
        // 2.声明字符型变量，演示转义符
        char a = '\'';
        System.out.println(a);// '
        char g = '\n';
        System.out.println(g);// 换行符
        char h = '\\';
        System.out.println(h);// \
    }
}
