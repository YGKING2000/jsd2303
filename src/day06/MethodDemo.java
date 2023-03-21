package day06;

/**
 * @ClassName MethodDemo
 * @Description 方法的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/22 10:36
 * @Version 1.0
 */
public class MethodDemo {
    public static void main(String[] args) {
        say();
        say();
    
        say("我是渣渣辉，是兄弟就来啃我！");
        say("我是练习时长两年半的练习生————蔡徐坤！");
        say("蔡徐坤", 18);
        
        int result = plus(10, 12);
        System.out.println(result);
        System.out.println(plus(3, 9));
        
        System.out.println();
        
        // 调用方法得到一个[-100, 100]之间的整数并将其打印输出
        System.out.println(getNum());
        
        // 调用方法创建一个长度为10的int型数组
        int[] data = getIntArray(10);
        
        // 输出数组
        outArray(data);
        // 给上面的数组排序
        quickSort(data, 0, data.length - 1);
        // 输出数组
        outArray(data);
        
        System.out.print("data中的最小值是：" + getMin(data));
        System.out.println("\t\tdata中的最大值是：" + getMax(data));
    }
    
    /* 1.无参无返回值 */
    public static void say() {
        System.out.println("大家好!");
    }
    
    /* 2.有参无返回值 */
    public static void say(String name) {
        System.out.println("大家好，" + name);
    }
    public static void say(String name, int age) {
        System.out.println("大家好，我是" + name + "今年" + age + "岁了！");
    }
    // 快速排序
    public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] < base) ;
                while (high > start && data[--high] > base) ;
                if (low < high) {
                    exchange(data, low, high);
                } else {
                    break;
                }
            }
            exchange(data, start, high);
            
            quickSort(data, start, high - 1);
            quickSort(data, high + 1, end);
        }
    }
    // 交换数组元素
    public static void exchange(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    // 输出数组
    public static void outArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            if (i != data.length - 1) {
                System.out.print(data[i] + ", ");
            } else {
                System.out.println(data[i] + "]");
            }
        }
    }
    
    /* 3.无参有返回值 */
    // 随机生成一个[-100, 100]之间的整数
    public static int getNum() {
        return (int) (Math.random() * 201) - 100;
    }
    
    /* 4.有参有返回值 */
    // 求两数之和
    public static int plus(int num1, int num2) {
        return num1 + num2;
    }
    // 求数组最大值
    public static int getMax(int[] data) {
        int max = data[0];
        for (int item : data) {
            max = Math.max(max, item);
        }
        return max;
    }
    // 求数组最小值
    public static int getMin(int[] data) {
        int min = data[0];
        for (int item : data) {
            min = Math.min(min, item);
        }
        return min;
    }
    // 随机生成一个指定长度，元素范围在[-100, 100]之间的int型数组
    public static int[] getIntArray(int num) {
        int[] data = new int[num];
        for (int i = 0; i < data.length; i++) {
            data[i] = getNum();
        }
        return data;
    }
}
