package homework.day03.standard;

/**
 * @ClassName BranchExercise01
 * @Description 分支结构if的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:14
 * @Version 1.0
 */
public class BranchExercise01 {
    public static void main(String[] args) {
        // 1.满500打8折
        // double price = 973;
        // double price = 500;
        // double price = 499;
        double price = -5;
        if (price >= 500) {
            price *= .8;
        }
        System.out.println("最终消费金额是：" + price);
        
        // 2.判断成绩是否合法
        // int score = 100;
        // int score = 0;
        // int score = 101;
        int score = -1000;
        if (score >= 0 && score <= 100) {
            System.out.println(score + "是合法成绩");
        }
        System.out.println("继续执行...");
    }
}
