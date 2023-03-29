package homework.ooday03.second;

/**
 * @Description 动物类
 * @ClassName Animal
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 18:59
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
    
    void drink() {
        System.out.println(color + "的" + age + "岁" + name + "正在喝水...");
    }
    
    abstract void eat();
}
