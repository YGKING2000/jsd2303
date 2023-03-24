package day07;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName getAverage
 * @Description 评委给选手打分: 去掉最高分、去掉最低分后的平均分
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 15:54
 * @Version 1.0
 */
public class calTotalAverage {
    public static void main(String[] args) {
        // 录入评委的分数
        int[] scores = generateArray(4, 100);
        System.out.println(Arrays.toString(scores));
        // 计算去掉最高分、最低分后的平均分
        double averageScore = calAverage(scores);
        System.out.println("此次平均分是：" + averageScore);
    }
    
    // 创建一个指定长度、指定范围的整型数组
    public static int[] generateArray(int length, int max) {
        Random random = new Random();
        int[] scores = new int[length];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(max + 1);
        }
        return scores;
    }
    
    // 求数组出去最大值、最小值之后的平均值
    public static double calAverage(int[] scores) {
        double total = calTotal(scores);
        return total / (scores.length - 2);
    }
    
    // 求数组去掉最大值、最小值之后的和
    public static double calTotal(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        double total = 0;
        for (int item : scores) {
            total += item;
            max = Math.max(max, item);
            min = Math.min(min, item);
        }
        return total - max - min;
    }
}
