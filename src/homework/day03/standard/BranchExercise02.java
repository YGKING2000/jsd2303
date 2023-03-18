package homework.day03.standard;

/**
 * @ClassName BranchExercise02
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:23
 * @Version 1.0
 */
public class BranchExercise02 {
    public static void main(String[] args) {
        // 满500打8折，不满500打9折
        // double price = 500;
        // double price = 499;
        // double price = 0;
        double price = 12306;
        if (price >= 500) {
            price *= .8;
        } else {
            price *= .9;
        }
        System.out.println("你的消费金额最终是：" + price);
        
        // 判断成绩合法还是不合法
        // 1.使用&&运算符
        // int score = 100;
        // int score = 0;
        // int score = 1000;
        int score = -1000;
        if (score >= 0 && score <= 100) {
            System.out.println(score + "是合法成绩");
        } else {
            System.out.println(score + "是不合法成绩");
        }
        System.out.println();
        // 2.使用||运算符
        if (score < 0 || score > 100) {
            System.out.println(score + "是不合法成绩");
        } else {
            System.out.println(score + "是合法成绩");
        }
    }
}
