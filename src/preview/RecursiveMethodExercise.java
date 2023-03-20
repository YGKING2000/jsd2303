package preview;

/**
 * @ClassName RecursiveMethodExercise
 * @Description 递归方法的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/18 14:30
 * @Version 1.0
 */
public class RecursiveMethodExercise {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(factorial(10));
        System.out.println(method(10));
    }
    /**
     * @Description 计算1到n之间的自然数之和
     * @Return int
     * @Params [num]
     * @ParamsType [int]
     * @Author YGKING
     * @Date 2023/03/18 14:32:05
     */
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }
    
    /**
     * @Description 求阶乘n!的结果
     * @Return int
     * @Params [num]
     * @ParamsType [int]
     * @Author YGKING
     * @Date 2023/03/18 14:36:23
     */
    public static int factorial(int num) {
        if (num == 2) {
            return 2;
        } else {
            return num * factorial(num - 1);
        }
    }
    
    public static int method(int num) {
        if (num == 0 || num == 1) {
            if (num == 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            return method(num - 1) * 2 + method(num - 2);
        }
    }
}
