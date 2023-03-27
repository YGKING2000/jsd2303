package ooday01;

/**
 * @ClassName Car
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 16:10
 * @Version 1.0
 */
public class Car {
    String brand;
    String color;
    double price;
    
    public Car() {
    }
    
    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    
    public void start() {
        System.out.println(color + brand + "正在启动......");
    }
    
    public void run() {
        System.out.println(color + brand + "正在奔驰......");
    }
    
    public void stop() {
        System.out.println(color + brand + "正在刹车......");
    }
}
