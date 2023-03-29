package ooday03;

/**
 * @Description 动物类
 * @ClassName Animal
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 14:18
 * @Version 1.0
 */
public abstract class Animal {
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
    
    // 抽象方法
    abstract void eat();
}
