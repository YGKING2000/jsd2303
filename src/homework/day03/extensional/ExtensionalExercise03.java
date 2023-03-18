package homework.day03.extensional;

/**
 * @ClassName ExtensionalExercise03
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 19:54
 * @Version 1.0
 */
public class ExtensionalExercise03 {
    public static void main(String[] args) {
        /* 成绩等级判断
         * A: 成绩大于等于90
         * B: 成绩大于等于80并且小于90
         * C: 成绩大于等于60并且小于80
         * D: 成绩小于60
         * 注意事项: 需要考虑成绩的合法性，当不合法成绩时，输出"成绩不合法"
         */
        // int score = 100;
        // int score = 101;
        // int score = 89;
        int score = 60;
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("你的成绩等级是A");
            } else if (score >= 80) {
                System.out.println("你的成绩等级是B");
            } else if (score >= 60) {
                System.out.println("你的成绩等级是C");
            } else {
                System.out.println("你的成绩等级是D");
            }
        } else {
            System.out.println("成绩不合法");
        }
    }
}
