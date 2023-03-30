package ooday04;

/**
 * @Description 鸡的类
 * @ClassName Chick
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 16:22
 * @Version 1.0
 */
public class Chick extends Animal {
    public Chick(String name, int age, String color) {
        super(name, age, color);
    }
    
    // 当前类独有的方法
    void layEggs() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在下蛋...");
    }
    
    // 重写超类中的抽象方法
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在吃小米...");
    }
}
