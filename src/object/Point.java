package object;

import java.util.Objects;

/**
 * @Description 点的类
 * @ClassName Point
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 14:12
 * @Version 1.0
 */
public class Point {
    private double x;
    private double y;
    
    public Point() {
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // o这个对象被向上造型成Object类型，所以不能调用x和y属性，所以这里应该需要将o向下造型成Point类型
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
}
