package homework.day05.extensional;

/**
 * @ClassName GetSum
 * @Description 利用for循环计算：求数字1到100之内，所有偶数的和，并输出
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 20:14
 * @Version 1.0
 */
public class GetSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            /*if (i % 2 == 0) {
                sum += i;
            }*/
            sum += i % 2 == 0 ? i : 0;
        }
        System.out.println("数字1到100之内，所有偶数的和是：" + sum);
    }
}
