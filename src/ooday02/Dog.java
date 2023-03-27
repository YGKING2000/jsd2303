package ooday02;

/**
 * @Description 狗的类
 * @ClassName Dog
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 16:17
 * @Version 1.0
 */
public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在吃骨头...");
    }
    
    void lookHome() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在看家...");
    }
}
