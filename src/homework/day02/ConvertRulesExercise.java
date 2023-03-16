package homework.day02;

/**
 * @ClassName ConvertRulesExercise
 * @Description 数据类型转换规则的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 18:43
 * @Version 1.0
 */
public class ConvertRulesExercise {
    public static void main(String[] args) {
        // 声明两个byte型变量b1和b2，并赋值为直接量
        byte b1 = 123;
        byte b2 = 111;
    
        // 声明一个byte型变量，并赋值为b1与b2的和
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);// -22，这里发生了溢出
    }
}
