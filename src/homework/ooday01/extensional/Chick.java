package homework.ooday01.extensional;

/**
 * @ClassName Chick
 * @Description 鸡的类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 18:59
 * @Version 1.0
 */
public class Chick {
    String type;
    String sex;
    double weight;
    double price;
    
    Chick() {
    }
    
    Chick(String type, String sex, double weight, double price) {
        this.type = type;
        this.sex = sex;
        this.weight = weight;
        this.price = price;
    }
    
    void eat() {
        System.out.println("这儿有一只" + type + "正在进食......");
    }
    
    void getPrice() {
        System.out.println("现在" + type + "的价格是" + price + "元/kg，这一只" + sex + "可以卖" + price * weight + "元");
    }
}
