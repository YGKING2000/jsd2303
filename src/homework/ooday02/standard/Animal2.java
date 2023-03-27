package homework.ooday02.standard;

/**
 * @Description 动物类
 * @ClassName Animal2
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:26
 * @Version 1.0
 */
public class Animal2 {
    String name;
    String color;
    int age;
    
    public Animal2(String name, String color, int age) {
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
