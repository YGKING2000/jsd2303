package extratask.extratask_1;

import java.util.Scanner;

/**
 * @ClassName CalAvg
 * @Description 完成评委打分:去掉最高分和最低分之后的平均分——————练习数组、循环和方法
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/25 09:42
 * @Version 1.0
 */
public class CalAvg {
    /*public static void main(String[] args) {
        double[] scores = inputData(6);
        double avg = calAvg(scores);
        System.out.println("平均分是：" + avg);
    }
    
    // 录入指定位数评委的评分的方法
    public static double[] inputData(int length) {
        double[] scores = new double[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的评分：");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }
    
    // 计算除去最高分和最低分的平均分
    public static double calAvg(double[] scores) {
        double total = calTotal(scores);
        return total / (scores.length - 2);
    }
    
    // 计算除去最高分和最低分的总分
    public static double calTotal(double[] scores) {
        double total = 0.0;
        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        return total - max - min;
    }*/
    
    public static void main(String[] args) {
        // 接收评分数组
        double[] scores = inputData(6);
        // 计算平均分
        double avg = calAvg(scores);
        System.out.println("平均分是" + avg);
    }
    
    // 计算除去最高分和最低分后的平均分的方法
    public static double calAvg(double[] scores) {
        double total = calTotal(scores);
        return total / (scores.length - 2);
    }
    
    // 计算除去最高分和最低分后的总分的方法
    public static double calTotal(double[] scores) {
        double total = 0.0;
        double max = scores[0];
        double min = scores[0];
        // 遍历评分数组，计算最高分、最低分和总分
        for (double score : scores) {
            total += score;
            max = Math.max(max, score);
            min = Math.min(min, score);
        }
        //
        return total - max - min;
    }
    
    // 录入指定位数评委的评分的方法
    public static double[] inputData(int length) {
        double[] scores = new double[length];
        Scanner scanner = new Scanner(System.in);
        // 依次录入评委的评分添加进入数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的评分：");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }
}
