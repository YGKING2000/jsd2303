package ooday02;

/**
 * @Description 动物类
 * @ClassName Animal
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 14:18
 * @Version 1.0
 */
public class Animal {
    String name;
    int age;
    String color;
    
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    void drink() {
        System.out.println(color + "的" + age + "岁" + name + "正在喝水...");
    }
    
    void eat() {
        System.out.println(color + "的" + age + "岁" + name + "正在进食...");
    }
}
