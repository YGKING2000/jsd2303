package ooday03;

/**
 * @Description 狗的类
 * @ClassName Dog
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 16:17
 * @Version 1.0
 */
public class Dog extends Animal implements Swim  {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    
    // 当前类独有的方法
    void lookHome() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在看家...");
    }
    
    // 重写超类中的抽象方法
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在吃骨头...");
    }
    
    // 重写接口中的抽象方法
    @Override
    public void swim() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在狗刨...");
    }
}
