package homework.day03.standard;

/**
 * @ClassName BranchExercise03
 * @Description 分支结构if...else if的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:35
 * @Version 1.0
 */
public class BranchExercise03 {
    public static void main(String[] args) {
        // 满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折
        // double price = 10000;
        // double price = 2000;
        // double price = 1500;
        // double price = 1000;
        // double price = 500;
        double price = 499;
        if (price >= 2000) {
            price *= .5;
        } else if (price >= 1000) {
            price *= .7;
        } else if (price >= 500) {
            price *= .8;
        } else {
            price *= .9;
        }
        System.out.println("你的消费金额最终是：" + price);
    }
}
