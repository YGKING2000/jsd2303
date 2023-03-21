package homework.day05.standard;

/**
 * @ClassName MultiTable
 * @Description 输出九九乘法表
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 17:51
 * @Version 1.0
 */
public class MultiTable {
    public static void main(String[] args) {
        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }*/
        
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
