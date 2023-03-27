package homework.ooday02.standard;

/**
 * @Description 人类
 * @ClassName Person2
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:12
 * @Version 1.0
 */
public class Person2 {
    String name;
    String address;
    int age;
    
    public Person2(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    void eat() {
        System.out.println(name + "正在吃饭...");
    }
    
    void sleep() {
        System.out.println(name + "正在睡觉...");
    }
    
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁了，家住" + address);
    }
}
