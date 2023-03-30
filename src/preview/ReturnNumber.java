package preview;

import java.util.Scanner;

/**
 * @ClassName Demo05
 * @Description 打印回型数
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/18 15:38
 * @Version 1.0
 */
public class ReturnNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入回型数的行数：");
        int num = scanner.nextInt();
        int[][] data = new int[num][num];
        int minX = 0, minY = 0;
        int maxX = num - 1, maxY = num - 1;
        int count = 1;
        while (count <= num * num) {
            for (int i = minY; i <= maxY; i++) {
                data[minX][i] = count++;
            }
            minX++;
            for (int i = minX; i <= maxX; i++) {
                data[i][maxY] = count++;
            }
            maxY--;
            for (int i = maxY; i >= minY; i--) {
                data[maxX][i] = count++;
            }
            maxX--;
            for (int i = maxX; i >= minX; i--) {
                data[i][minY] = count++;
            }
            minY++;
        }
        for (int[] item : data){
            for (int item1 : item) {
                if (item1 < 10) {
                    System.out.print(item1 + "  ");
                } else {
                    System.out.print(item1 + " ");
                }
            }
            System.out.println();
        }
        
    }
}
