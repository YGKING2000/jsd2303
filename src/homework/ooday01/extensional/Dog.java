package homework.ooday01.extensional;

/**
 * @ClassName Dog
 * @Description 狗的类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 18:01
 * @Version 1.0
 */
public class Dog {
    String type;
    String name;
    String color;
    
    Dog() {
    }
    
    public Dog(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    
    void bark() {
        System.out.println("汪汪汪汪汪汪汪！");
    }
    
    void eat() {
        System.out.println("一条名为" + name + "的" + color + type + "正在进食......");
    }
}
