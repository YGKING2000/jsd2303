package homework.ooday02.standard;

/**
 * @Description 动物类
 * @ClassName Animal
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 18:58
 * @Version 1.0
 */
public class Animal {
    String name;
    String color;
    int age;
    
    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    
    void eat() {
        System.out.println(color + "的" + age + "岁" + name + "正在进食...");
    }
    
    void drink() {
        System.out.println(color + "的" + age + "岁" + name + "正在喝水...");
    }
}
