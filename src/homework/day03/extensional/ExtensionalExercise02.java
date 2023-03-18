package homework.day03.extensional;

/**
 * @ClassName ExtensionalExercise02
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:47
 * @Version 1.0
 */
public class ExtensionalExercise02 {
    public static void main(String[] args) {
        // 声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年“
        int year = 2017;
        // 注意事项: &&的优先级比||高，逻辑运算符优先级从低到高: || ==> && ==> | ==> & ==> !
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年是平年");
        }
    }
}
