package homework.day03.standard;

/**
 * @ClassName OperatorExercise05
 * @Description 字符串连接运算符的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:00
 * @Version 1.0
 */
public class OperatorExercise05 {
    public static void main(String[] args) {
        // 1.声明整型变量age和字符串型变量name，输出字符串连接的结果
        int age = 23;
        String name = "HXD";
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了");// 大家好，我叫HXD，今年23岁了
        
        // 2.输出几个数据的拼接，演示字符串连接的同化作用
        System.out.println(10 + 20 + 30 + "");// 60
        System.out.println(10 + 20 + "" + 30);// 3030
        System.out.println(10 + "" + 20 + 30);// 102030
        System.out.println('*' + "\t" + '*');// *   *
        System.out.println("*" + "\t" + '*');// *   *
        System.out.println('*' + '\t' + "*");// 51*
        System.out.println("*" + ('\t' + '*'));// *51
        System.out.println("*\t*");// *   *
    }
}
