package homework.apiday02.standard.third;

/**
 * @Description toString()和equals()方法的练习
 * @ClassName PointExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 21:02
 * @Version 1.0
 */
public class PointExercise {
    public static void main(String[] args) {
        Point point = new Point(3, 7);
        Point point1 = new Point(3, 7);
        Point point2 = point;
        // 重写toString()和equals()方法之前
        // System.out.println(point == point1);// false
        // System.out.println(point == point2);// true
        // System.out.println(point.equals(point1));// false
        // System.out.println(point.equals(point2));// true
        
        // 重写toString()和equals()方法之后
        System.out.println(point == point1);// false
        System.out.println(point == point2);// true
        System.out.println(point.equals(point1));// true
        System.out.println(point.equals(point2));// true
    }
}
