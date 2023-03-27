package homework.day07.standard;

import java.util.Scanner;

/**
 * @ClassName CalTotalAvg
 * @Description 计算去掉最高分和最低分后的平均分
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 20:50
 * @Version 1.0
 */
public class CalTotalAvg {
    /*public static void main(String[] args) {
        double[] scores = inputData(6);
        double avg = calAvg(scores);
        System.out.println("平均分是：" + avg);
    }
    
    //计算平均分
    public static double calAvg(double[] scores) {
        double total = calTotal(scores);
        return total / (scores.length - 2);
    }
    
    // 录入评委的分数的方法
    public static double[] inputData(int length) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[length];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的分数：");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }
    
    // 计算去掉最高分和最低分的总分
    public static double calTotal(double[] scores) {
        double total = 0.0;
        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
            total += scores[i];
        }
        return total - max - min;
    }*/
    
    /*public static void main(String[] args) {
        double[] scores = inputData(6);
        double score = calAvg(scores);
        System.out.println("最终评分是：" + score);
    }
    
    // 计算除去最高分、最低分的平均分
    public static double calAvg(double[] scores) {
        double total = calTotal(scores);
        return total / (scores.length - 2);
    }
    
    // 录入各位评委的分数
    public static double[] inputData(int length) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[length];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的分数：");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }
    
    // 计算除去最高分、最低分的总分
    public static double calTotal(double[] scores) {
        double total = 0.0;
        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
            total += scores[i];
        }
        return total - max - min;
    }*/
    
    /*public static void main(String[] args) {
        double[] scores = inputData(6);
        double avg = calAvg(scores);
        System.out.println("最终评分是：" + avg);
    }
    
    // 录入各位评委的评分
    public static double[] inputData(int length) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[length];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第"+ (i + 1) + "位评委的评分：");
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
        double[] scores = inputData(7);
        double avg = calAvg(scores);
        System.out.println("最终评分是：" + avg);
    }
    
    public static double calAvg(double[] scores) {
        double total = calTotal(scores);
        return total / (scores.length - 2);
    }
    
    public static double calTotal(double[] scores) {
        double total = 0.0;
        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
            total += scores[i];
        }
        return total - max - min;
    }
    
    public static double[] inputData(int length) {
        double[] scores = new double[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的分数：");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }
}
