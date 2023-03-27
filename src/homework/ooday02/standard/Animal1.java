package homework.ooday02.standard;

/**
 * @Description
 * @ClassName Animal1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:48
 * @Version 1.0
 */
public class Animal1 {
    String name;
    String color;
    int age;
    
    public Animal1(String name, String color, int age) {
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
