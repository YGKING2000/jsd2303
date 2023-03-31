package homework.ooday05.second;

/**
 * @Description 点的类
 * @ClassName Point
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:07
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
