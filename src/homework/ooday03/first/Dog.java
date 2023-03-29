package homework.ooday03.first;

/**
 * @Description 狗的类
 * @ClassName Dog
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 17:56
 * @Version 1.0
 */
public class Dog extends Animal implements Swim {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    
    // 重写超类Animal中的抽象方法
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在吃骨头...");
    }
    
    // 重写接口Swim中的抽象方法
    @Override
    public void swim() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在狗刨...");
    }
    
    // 当前类独有的方法
    void lookHome() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在看家...");
    }
}
