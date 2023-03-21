package day05;

/**
 * @ClassName MultipleTable
 * @Description 九九乘法表的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 10:50
 * @Version 1.0
 */
public class MultipleTable {
    public static void main(String[] args) {
        // 九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int k = 9 - i; k > 0 ; k--) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }
        System.out.println();
        
        /*
         * 执行过程：
         *  i = 1, true
         *      j = 1, 1*1=1
         *      j = 2, false
         *  i = 2, true
         *      j = 1, 1*2=2
         *      j = 2, 2*2=4
         *      j = 3, false
         *  i = 3, true
         *      j = 1, 1*3=3
         *      j = 2, 2*3=6
         *      j = 3, 3*3=9
         *      j = 4, false
         *  ....
         *  i = 9
         *      j = 1, 1*9=9
         *      j = 2, 2*9=19
         *      j = 3, 3*9=27
         *      j = 4, 4*9=36
         *      j = 5, 5*9=45
         *      j = 6, 6*9=54
         *      j = 7, 7*9=63
         *      j = 8, 8*9=72
         *      j = 9, 9*9=81
         *      j = 10, false
         *  i = 10, false
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.printf("%d*%d=%d\n", j, i, i * j);
                } else {
                    System.out.printf("%d*%d=%d\t", j, i, i * j);
                }
            }
        }
        
        
        int[][] data = new int[11][];
        for (int i = 0; i < data.length; i++) {
            data[i] = new int[i + 1];
            data[i][0] = data[i][i] = 1;
            for (int j = 1; j < i; j++) {
                data[i][j] = data[i - 1][j] + data[i - 1][j - 1];
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
