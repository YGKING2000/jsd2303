package homework.apiday02.standard.third;

/**
 * @Description 包装类的演示
 * @ClassName IntegerExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 21:19
 * @Version 1.0
 */
public class IntegerExercise {
    public static void main(String[] args) {
        Integer integer = new Integer(128);
        int i = 379;
        
        int i1 = integer.intValue();
        
        Integer integer1 = new Integer(i);
        Integer integer2 = Integer.valueOf(i);
        
        short max = Short.MAX_VALUE;
        short min = Short.MIN_VALUE;
        System.out.println("max = " + max + ", min = " + min);// max = 32767, min = -32768
        
        String s = "123456";
        String s1 = "123456.789101112";
        double d = Double.parseDouble(s1);
        int i2 = Integer.parseInt(s);
        System.out.println("d = " + d + ", i2 = " + i2);// d = 123456.789101112, i2 = 123456
    }
}
