package homework.day06.standard;

import java.util.Random;

/**
 * @ClassName MethodExercise
 * @Description 方法的练习
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/22 18:45
 * @Version 1.0
 */
public class MethodExercise {
    /*public static void main(String[] args) {
        // 1.定义say()无参无返回值方法，调用测试
        say();// 大家好，我是练习时长两年半的个人练习生————蔡徐坤！
        // 2.定义say()有一个参无返回值方法，调用测试
        say("蔡徐坤");// 大家好，我是蔡徐坤，今年18岁了！
        say("渣渣辉");// 大家好，我是渣渣辉，今年18岁了！
        // 3.定义say()有两个参无返回值的方法，调用测试
        say("梅西", 36);// 大家好，我是梅西，我今年36岁了！
        say("蔡徐坤", 16);// 大家好，我是蔡徐坤，我今年16岁了！
        say("李逍遥", 17);// 大家好，我是李逍遥，我今年17岁了！
        // 4.定义getNum()无参有返回值方法，演示return的用法，调用测试
        System.out.println(getNum());// 9527
        // 5.定义plus()两个参有返回值方法，调用测试
        int a = 3, b = 9;
        System.out.println(plus(a, b));// 12
        System.out.println(plus(7, 9));// 16
        // 6.定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
        int[] data = generateArray(19, 100);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");// 42 90 9 18 64 78 99 9 34 51 25 98 43 85 77 39 30 17 34
        }
    }
    
    // 1.定义say()无参无返回值方法
    public static void say() {
        System.out.println("大家好，我是练习时长两年半的个人练习生————蔡徐坤！");
    }
    
    // 2.定义say()有一个参无返回值方法
    public static void say(String name) {
        System.out.println("大家好，我是" + name + "，今年18岁了！");
    }
    
    // 3.定义say()有两个参无返回值的方法
    public static void say(String name, int age) {
        System.out.println("大家好，我是" + name + "，我今年" + age + "岁了！");
    }
    
    // 4.定义getNum()无参有返回值方法，演示return的用法
    public static int getNum() {
        return 9257;
    }
    
    // 5.定义plus()两个参有返回值方法
    public static int plus(int num1, int num2) {
        return num1 + num2;
    }
    
    // 6.定义generateArray()用于生成整型数组填充随机数并返回数组
    public static int[] generateArray(int length, int max) {
        Random random = new Random();
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max + 1);
        }
        return data;
    }*/
    
    public static void main(String[] args) {
        // 1.定义say()无参无返回值方法，调用测试
        say();// 大家好，我是渣渣辉，是兄弟就来啃我！
        
        // 2.定义say()有一个参无返回值方法，调用测试
        say("梅长苏");// 大家好，我是梅长苏，我今年18岁！
        say("赵灵儿");// 大家好，我是赵灵儿，我今年18岁！
        say("赵盼儿");// 大家好，我是赵盼儿，我今年18岁！
        
        // 3.定义say()有两个参无返回值的方法，调用测试
        say("霓凰郡主", 28);// 大家好，我是霓凰郡主,我今年28岁了！
        say("林殊", 30);// 大家好，我是林殊,我今年30岁了！
        say("萧景琰", 27);// 大家好，我是萧景琰,我今年27岁了！
        // 4.定义getNum()无参有返回值方法，演示return的用法，调用测试
        System.out.println(getNum());// 3.1415926
        
        // 5.定义plus()两个参有返回值方法，调用测试
        double a = 3.1415962, b = 1314.521;
        System.out.println(plus(a, b));// 1317.6625962
        System.out.println(plus(2.7, 63.264));// 65.964
        
        // 6.定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
        generateArray(3, 10);// 4	1	7
        generateArray(7, 50);// 37	45	21	28	41	19	0
        generateArray(9, 100);// 0	19	79	7	16	22	57	28	92
    }
    
    // 1.定义say()无参无返回值方法
    public static void say() {
        System.out.println("大家好，我是渣渣辉，是兄弟就来啃我！");// 大家好，我是渣渣辉，是兄弟就来啃我！
    }
    
    // 2.定义say()有一个参无返回值方法
    public static void say(String name) {
        System.out.println("大家好，我是" + name + "，我今年18岁！");
    }
    
    // 3.定义say()有两个参无返回值的方法
    public static void say(String name, int age) {
        System.out.println("大家好，我是" + name + ",我今年" + age + "岁了！");
    }
    
    // 4.定义getNum()无参有返回值方法，演示return的用法
    public static double getNum() {
        return 3.1415926;
    }
    
    // 5.定义plus()两个参有返回值方法
    public static double plus(double num1, double num2) {
        return num1 + num2;
    }
    
    // 6.定义generateArray()用于生成整型数组填充随机数并返回数组
    public static int[] generateArray(int length, int max) {
        Random random = new Random();
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max + 1);
            System.out.print(data[i] + "\t");
        }
        System.out.println();
        return data;
    }
}
