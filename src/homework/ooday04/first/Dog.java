package homework.ooday04.first;

/**
 * @Description 狗的类
 * @ClassName Dog
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 17:49
 * @Version 1.0
 */
public class Dog extends Animal implements Swim {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在吃骨头...");
    }
    
    @Override
    public void swim() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在狗刨...");
    }
    
    void lookHome() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在看家...");
    }
}
