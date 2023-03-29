package homework.ooday03.first;

/**
 * @Description 鸡的类
 * @ClassName Chick
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 18:00
 * @Version 1.0
 */
public class Chick extends Animal {
    public Chick(String name, String color, int age) {
        super(name, color, age);
    }
    
    // 重写超类Animal中的抽象方法
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在吃小米...");
    }
    
    // 当前类独有的方法
    void layEggs() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在下蛋...");
    }
}
