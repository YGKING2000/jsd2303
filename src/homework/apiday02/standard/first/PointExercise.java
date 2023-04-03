package homework.apiday02.standard.first;

/**
 * @Description toString()和equals()方法的练习
 * @ClassName PointDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 19:33
 * @Version 1.0
 */
public class PointExercise {
    public static void main(String[] args) {
        Point point = new Point(3, 7);
        Point point2 = new Point(3, 7);
        Point point3 = point;
        // 重新toString()和equals()方法之前
        // System.out.println(point);// homework.apiday02.standard.first.Point@14ae5a5
        // System.out.println(point2);// homework.apiday02.standard.first.Point@7f31245a
        // System.out.println(point3);// homework.apiday02.standard.first.Point@14ae5a5
        // System.out.println(point == point2);// false
        // System.out.println(point.equals(point2));// false
        // System.out.println(point.equals(point3));// true
    
        // 重新toString()和equals()方法之前
        System.out.println(point);// Point{x=3, y=7}
        System.out.println(point2);// Point{x=3, y=7}
        System.out.println(point3);// Point{x=3, y=7}
        System.out.println(point == point2);// false
        System.out.println(point.equals(point2));// true
        System.out.println(point.equals(point3));// true
    }
}
