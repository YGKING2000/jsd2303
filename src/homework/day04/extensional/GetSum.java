package homework.day04.extensional;

/**
 * @ClassName GetSum
 * @Description 利用循环语句while计算数字1到100的和，并输出
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 19:20
 * @Version 1.0
 */
public class GetSum {
    public static void main(String[] args) {
        // 利用循环语句while计算数字1到100的和，并输出
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }
        System.out.println("sum = " + sum);
    }
}
