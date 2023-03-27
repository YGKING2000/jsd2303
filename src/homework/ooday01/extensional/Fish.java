package homework.ooday01.extensional;

/**
 * @ClassName Fish
 * @Description 鱼的类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 18:45
 * @Version 1.0
 */
public class Fish {
    String type;
    double weight;
    double length;
    double price;
    
    Fish() {
    }
    
    Fish(String type, double weight, double length, double price) {
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.price = price;
    }
    
    void eat() {
        System.out.println("一条" + type + "正在进食......");
    }
    
    void getInfo() {
        System.out.println("这条" + type + "重" + weight + "kg，体长为" + length + "cm，价格为" + price + "元/kg");
    }
}
