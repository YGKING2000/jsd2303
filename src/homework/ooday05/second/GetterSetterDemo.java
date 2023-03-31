package homework.ooday05.second;

/**
 * @Description getter/setter方法的练习
 * @ClassName GetterSetterDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:10
 * @Version 1.0
 */
public class GetterSetterDemo {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("x = " +  point.getX() + ", y = " + point.getY());
        point.setX(9.9);
        point.setY(6.6);
        System.out.println("x = " +  point.getX() + ", y = " + point.getY());
        
        Point point1 = new Point(8.8, 6.6);
        System.out.println("x = " + point1.getX() + ", y = " + point1.getY());
    }
}
