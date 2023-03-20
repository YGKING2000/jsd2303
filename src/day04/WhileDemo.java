package day04;

/**
 * @ClassName WhileDemo
 * @Description 循环结构while的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 10:48
 * @Version 1.0
 */
public class WhileDemo {
    public static void main(String[] args) {
        // 打印输出5次”行动是成功的阶梯“
        int count = 0;
        while (count <= 4) {
            System.out.println("行动是成功的阶梯");
            count++;
        }
        
        // 打印输出9的乘法表
        int times = 1;
        while (times < 10) {
            System.out.println(times + "*9=" + times * 9);
            times++;
        }
        // System.exit(0);
        
        // 打印输出九九乘法表
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j <= i) {
                if (j == i) {
                    System.out.println(j + "*" + i + "=" + i * j);
                } else {
                    if (j == 2 && (i == 3 || i == 4)) {
                        System.out.print(j + "*" + i + "=" + i * j + "  ");
                    } else {
                        System.out.print(j + "*" + i + "=" + i * j + " ");
                    }
                }
                j++;
            }
            i++;
        }
        // for (int i = 1; i < 10; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + "*" + i + "=" + i * j + " ");
        //     }
        //     System.out.println();
        // }
    }
}
