package homework.ooday02.standard;

/**
 * @Description 狗的类
 * @ClassName Dog
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:03
 * @Version 1.0
 */
public class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在吃骨头...");
    }
    
    void lookHome() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在看家...");
    }
}
