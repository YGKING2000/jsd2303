package object;

import homework.ooday05.second.Seasons;
import ooday04.Dog;

/**
 * @Description Object类的演示
 * @ClassName ObjectDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 14:29
 * @Version 1.0
 */
public class ObjectDemo {
    public static void main(String[] args) {
        /*System.out.println(point.getClass());
        System.out.println(point.getClass().getName());
        Seasons seasons = Seasons.SPRING;
        System.out.println(seasons.getClass());
        System.out.println(seasons.getClass().getName());
        
        Aoo aoo = new Aoo();
        Object aoo1 = new Aoo();
        
        Boo boo = new Boo();
        Aoo boo1 = new Boo();
        Object boo2 = new Boo();*/
    
        // 重新toString()方法之前
        // Point point = new Point();
        // System.out.println(point);// object.Point@14ae5a5
        // System.out.println(point.toString());// object.Point@14ae5a5
        
        // 重新toString()方法之后
        Point point = new Point(9.9, 7.7);
        System.out.println(point);// Point{x=9.9, y=7.7}
        System.out.println(point.toString());// Point{x=9.9, y=7.7}
        
        // 重新equals()方法之前
        // Point point1 = new Point(9.9, 7.7);
        // System.out.println(point == point1);// false
        // System.out.println(point.equals(point1));// false
    
        // 重新equals()方法之后
        Point point1 = new Point(9.9, 7.7);
        System.out.println(point == point1);// false
        System.out.println(point.equals(point1));// true
        
        String s = null;
        String s1 = null;
        System.out.println(s == s1);// true
        
        Coo coo = new Coo();
        Boo boo = new Boo();
        System.out.println(coo.getClass() == boo.getClass());
        System.out.println(boo.getClass());
        
        StringBuilder stringBuilder = new StringBuilder("111");
        StringBuilder stringBuilder2 = new StringBuilder("111");
        System.out.println(stringBuilder.equals(stringBuilder2));
    }
}

class Aoo {}

class Boo extends Aoo {}

class Coo extends Boo {}