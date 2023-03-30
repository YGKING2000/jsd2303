package ooday04;

/**
 * @Description 鱼的类
 * @ClassName Fish
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 16:25
 * @Version 1.0
 */
public class Fish extends Animal implements Swim {
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }
    
    // 重写超类中的抽象方法
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鱼" + name + "正在吃小虾...");
    }
    
    // 重写接口中的抽象方法
    @Override
    public void swim() {
        System.out.println(color + "的" + age + "岁的小鱼" + name + "正在自由泳...");
    }
}
