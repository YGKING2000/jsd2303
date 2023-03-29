package homework.ooday03.second;

/**
 * @Description 鸡的类
 * @ClassName Chick
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 20:26
 * @Version 1.0
 */
public class Chick extends Animal {
    public Chick(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在吃小米...");
    }
    
    void layEggs() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在下蛋...");
    }
}
