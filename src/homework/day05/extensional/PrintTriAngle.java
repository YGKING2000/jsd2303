package homework.day05.extensional;

/**
 * @ClassName PrintTriAngle
 * @Description 打印一个三角
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 20:34
 * @Version 1.0
 */
public class PrintTriAngle {
    public static void main(String[] args) {
        /*
         * *
         * ***
         * *****
         * *******
         * *********
         * ***********
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
