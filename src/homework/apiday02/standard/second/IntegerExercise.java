package homework.apiday02.standard.second;

import ooday03.Inter;

/**
 * @Description 包装类的练习
 * @ClassName IntegerExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 20:46
 * @Version 1.0
 */
public class IntegerExercise {
    public static void main(String[] args) {
        int i = 123;
        Integer integer = new Integer(127);
        int i1 = integer.intValue();
        Integer integer1 = new Integer(i);
        Integer integer2 = Integer.valueOf(i);
        
        Integer integer3 = i1;
        int i2 = integer;
        
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        System.out.println("max = " + max + ", min = " + min);// max = 9223372036854775807, min = -9223372036854775808
    
        String s = "123";
        String s1 = "123.456";
        String s2 = "123abc";
        int i3 = Integer.parseInt(s);
        double d = Double.parseDouble(s1);
        // int i4 = Integer.parseInt(s2);// 编译报错，数字格式转换异常NumberFormatException
        System.out.println("i3 = " + i3 + ", d = " + d);// i3 = 123, d = 123.456
    }
}
