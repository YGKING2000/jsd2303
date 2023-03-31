package ooday05;

/**
 * @Description getter/setter方法的演示
 * @ClassName GetterSetterDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 10:11
 * @Version 1.0
 */
public class GetterSetterDemo {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.getX());// 0
        System.out.println(point.getY());// 0
        point.setX(16);
        point.setY(19);
        System.out.println(point.getX());// 16
        System.out.println(point.getY());// 19
    }
}
