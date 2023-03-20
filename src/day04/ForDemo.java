package day04;

/**
 * @ClassName ForDemo
 * @Description 循环结构for的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 16:05
 * @Version 1.0
 */
public class ForDemo {
    public static void main(String[] args) {
        /*
         * 执行过程：
         *      time = 0, true, 输出
         *      time = 1, true, 输出
         *      time = 2, true, 输出
         *      time = 3, true, 输出
         *      time = 4, true, 输出
         *      time = 5, false
         */
        for (int time = 0; time < 5; time++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续执行...\n");
        
        /*
         * 执行过程：
         *  i = 1, true, 输出
         *  i = 2, true, 输出
         *  i = 3, true, 输出
         *  i = 4, true, 输出
         *  i = 5, true, 输出
         *  i = 6, true, 输出
         *  i = 7, true, 输出
         *  i = 8, true, 输出
         *  i = 9, true, 输出
         *  i = 10, false
         */
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
    
        /*
         * 执行过程：
         *  i = 1, true, 输出
         *  i = 3, true, 输出
         *  i = 5, true, 输出
         *  i = 7, true, 输出
         *  i = 9, true, 输出
         *  i = 11,  false
         */
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i +"*9=" + i * 9);
        }
        System.out.println();
        
        /*
         * 执行过程：
         *  i = 9, true, 输出
         *  i = 8, true, 输出
         *  i = 7, true, 输出
         *  i = 6, true, 输出
         *  i = 5, true, 输出
         *  i = 4, true, 输出
         *  i = 3, true, 输出
         *  i = 2, true, 输出
         *  i = 1, true, 输出
         *  i = 0, false
         */
        for (int i = 9; i > 0; i--) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
    
        /*
         * 执行过程：
         *               sum = 0
         *  i = 1, true, sum = 1
         *  i = 2, true, sum = 1 + 2
         *  i = 3, true, sum = 1 + 2 + 3
         *  i = 4, true, sum = 1 + 2 + 3 + 4
         *  ......
         *  i = 98, true, sum = 1 + 2 + 3 + 4 + ... + 98
         *  i = 99, true, sum = 1 + 2 + 3 + 4 + ... + 98 + 99
         *  i = 100, true, sum = 1 + 2 + 3 + 4 + ... + 98 + 99 + 100
         *  i = 101, false
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(getSum(100));
        
        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d ", j, i, i * j);
            }
            System.out.println();
        }*/
    }
    
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + getSum(num - 1);
        }
    }
}
