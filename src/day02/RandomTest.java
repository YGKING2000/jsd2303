package day02;

import java.util.Random;

/**
 * @ClassName Test
 * @Description 测试随机数的生成
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 12:53
 * @Version 1.0
 */
public class RandomTest {
    public static void main(String[] args) {
        // 随机生成[0, 1)之间的一个double类型的浮点数
        double r = Math.random();
        System.out.println(r);
        
        // 生成一个(50, 80]之间的整数 ==> [51, 81)
        int num = (int) (Math.random() * 30) + 51;
        System.out.println(num);
        
        // 为了简化随机数的使用，Java提供了Random的API，封装了Math.random()生成随机数的算法，利用API提供的方法就可以方便的获得随机数
        // 1.导入Random API: import java.util.Random;
        // 2.创建Random对象: Random random = new Random();
        // 3.调用random的方法获得随机数: int n= random.nextInt(100);参数100表示随机数的最大值范围，此时方法返回随机数范是[0, 100)
        /* 生成一个(50, 80]之间的整数 ==> [51, 81) */
        // random.nextInt(max - min) + min;
        // random.nextInt(81 - 51) + 51;
        Random random = new Random();
        int num2 = random.nextInt(30) + 51;
        System.out.println(num2);
    }
}
