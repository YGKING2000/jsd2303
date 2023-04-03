package homework.apiday02.standard.first;

/**
 * @Description 包装类的练习
 * @ClassName IntegerExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 19:50
 * @Version 1.0
 */
public class IntegerExercise {
    public static void main(String[] args) {
        Integer integer = new Integer(128);
        int i = 9;
        // int ==> Integer
        Integer integer1 = new Integer(i);
        Integer integer2 = Integer.valueOf(i);
        // Integer ==> int
        int i1 = integer1.intValue();
        
        // 自动装箱
        Integer integer3 = i1;
        // 自动拆箱
        int i2 = integer1;
        
        // 获取整型变量的取值范围
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max + ", min = " + min);// max = 2147483647, min = -2147483648
        
        String s = "123";
        String s1 = "123.456";
        int i3 = Integer.parseInt(s);
        // int i4 = Double.parseDouble(s1);// 编译失败，返回值类型为double
        double d = Double.parseDouble(s1);
        System.out.println("i3 = " + i3 + ", d = " + d);// i3 = 123, d = 123.456
    }
}

