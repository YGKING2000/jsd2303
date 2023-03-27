package ooday02;

/**
 * @Description 人类
 * @ClassName Person
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 09:30
 * @Version 1.0
 */
public class Person {
    /*String name;
    int age;
    String address;
    
    void eat() {
        System.out.println(name + "正在吃饭...");
    }
    
    void sleep() {
        System.out.println(name + "正在睡觉...");
    }
    
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了，家住" + address + "！");
    }*/
    
    String name;
    int age;
    String address;
    
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    void eat() {
        System.out.println(name + "正在吃饭...");
    }
    
    void sleep() {
        System.out.println(name + "正在睡觉...");
    }
    
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了，家住" + address + "！");
    }
}
