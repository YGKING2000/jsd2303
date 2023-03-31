package homework.ooday05.first;

/**
 * @Description getter/setter方法的练习
 * @ClassName GetterSetterDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 18:42
 * @Version 1.0
 */
public class GetterSetterDemo {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("x = " + point.getX() + ", y = " + point.getY());
        point.setX(9.7);
        point.setY(7.3);
        System.out.println("x = " + point.getX() + ", y = " + point.getY());
    
        Point point1 = new Point();
        System.out.println("x1 = " + point1.getX() + ", y1 = " + point1.getY());
        point1.setX(3.7);
        point1.setY(7.9);
        System.out.println("x1 = " + point1.getX() + ", y1 = " + point1.getY());
    }
}
