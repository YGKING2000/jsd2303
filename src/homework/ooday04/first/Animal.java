package homework.ooday04.first;

/**
 * @Description 动物类
 * @ClassName Animal
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 17:47
 * @Version 1.0
 */
public abstract class Animal {
    String name;
    String color;
    int age;
    
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    
    abstract void eat();
    
    void drink() {
        System.out.println(color + "的" + age + "岁" + name + "正在喝水...");
    }
}
