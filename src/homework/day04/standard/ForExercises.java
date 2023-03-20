package homework.day04.standard;

/**
 * @ClassName ForExercises
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 18:02
 * @Version 1.0
 */
public class ForExercises {
    public static void main(String[] args) {
        // for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)、1到100的累加和
        /*for (int i = 0; i < 5; i++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println();
    
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
    
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
    
        for (int i = 9; i >= 1; i--) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
        
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);*/
    
        for (int i = 0; i < 5; i++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println();
        
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
    
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
    
        for (int i = 9; i >= 1; i--) {
            System.out.println(i + "*9=" + i * 9);
        }
        System.out.println();
        
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum =" + sum);
    }
}
