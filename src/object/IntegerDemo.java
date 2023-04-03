package object;

/**
 * @Description 包装类的演示
 * @ClassName IntegerDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 16:38
 * @Version 1.0
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 自动装箱：仅限于限于相对应的类型之间
        // 下面这条语句会被编译成：Integer n = Integer.valueOf(127);
        Integer n = 127;
        // 自动拆箱：仅限于限于相对应的类型之间
        // 下面这条语句会被编译成：int m = n.intValue();
        int m = n;
        
        Integer i1 = new Integer(128);
        Integer i2 = new Integer(128);
        System.out.println(i1 == i2);// false
        System.out.println(i1.equals(i2));// true
        
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println(i3 == i4);// false
        System.out.println(i3.equals(i4));// true
        
        // valueOf()方法会复用1个字节以内的数据(-128~127)
        // 在使用包装类时建议使用valueOf()创建包装类对象
        Integer integer1 = new Integer(127);
        Integer integer2 = new Integer(127);
        System.out.println(integer1 == integer2);// false
        System.out.println(integer1.equals(integer2));// true
        
        Integer integer3 = Integer.valueOf(127);
        Integer integer4 = Integer.valueOf(127);
        System.out.println(integer3 == integer4);// true
        System.out.println(integer3.equals(integer4));// true
        System.out.println("-----------");
        
        // 将包装类型转换为对应的基本数据类型
        int i = integer1.intValue();
        System.out.println(i);// 127
        long l = integer1.longValue();
        System.out.println(l);// 127
        double d = integer1.doubleValue();
        System.out.println(d);// 127.0
        
        // 1.利用包装类获取基本数据类型的取值范围
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        // max = 2147483647, min = -2147483648
        System.out.println("max = " + max + ", min = " + min);
        long maxValue = Long.MAX_VALUE;
        long minValue = Long.MIN_VALUE;
        // maxValue = 9223372036854775807, minValue = -9223372036854775808
        System.out.println("maxValue = " + maxValue + ", minValue = " + minValue);
        
        // 2.包装类可以将字符串转换成基本数据类型
        String s = "123abc123";
        Integer num = Integer.parseInt(s);
        System.out.println(num.getClass().getSimpleName() + ": " + num);// Integer: 123
        
        // String s1 = "123.456";
        // Double num1 = Double.parseDouble(s);
        // Double num2 = Double.parseDouble(s1);
        // System.out.println(num1.getClass().getSimpleName() + ": " + num1);// Double: 123.0
        // System.out.println(num2.getClass().getSimpleName() + ": " + num2);// Double: 123.456
    }
}
