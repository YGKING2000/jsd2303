package day05;

/**
 * @ClassName ForDemo
 * @Description 循环结构for的特殊结构以及break、continue的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 09:07
 * @Version 1.0
 */
public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0, j = 5; i <= 5; i += 2, j -= 2) {
            System.out.println(i + ", " + j);
        }
        System.out.println();
        
        // for循环的两种死循环格式
        /*for (;;) {
            System.out.println("哈哈哈");
        }*/
        /*for (;true;) {
            System.out.println("嘿嘿嘿");
        }*/
        
        // 关键字break的作用
        /*
         * 执行过程
         *  i = 1, false, 输出: 1*9=9
         *  i = 2, false, 输出: 2*9=18
         *  i = 3, false, 输出: 3*9=27
         *  i = 4, true, break
         */
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
        
        // 关键字continue的作用
        /*
         * 执行过程
         *  i = 1, false, 输出: 1*9=9
         *  i = 2, false, 输出: 2*9=18
         *  i = 3, true, continue
         *  i = 4, false, 输出: 4*9=36
         *  i = 5, false, 输出: 5*9=36
         *  i = 6, true, continue
         *  i = 7, false, 输出: 7*9=36
         *  i = 8, false, 输出: 8*9=36
         *  i = 9, true, continue
         *  i = 10
         */
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
        
        for (int i = 1; i < 10; i++) {
            if (i % 3 != 0) {
                System.out.println(i + "*9=" + i * 9);
            }
        }
        System.out.println();
    
        // 九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d ", j , i, i * j);
            }
            System.out.println();
        }
    }
}
