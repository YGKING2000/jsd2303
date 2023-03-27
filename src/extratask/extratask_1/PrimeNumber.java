package extratask.extratask_1;

/**
 * @ClassName PrimeNumber
 * @Description 完成找到2到100之内的所有素数————练习嵌套循环
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 20:31
 * @Version 1.0
 */
public class PrimeNumber {
    public static void main(String[] args) {
        /*for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }*/
    
        /*for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag =false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }*/
    
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
