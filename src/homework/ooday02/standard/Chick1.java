package homework.ooday02.standard;

/**
 * @Description 鸡的类
 * @ClassName Chick1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:03
 * @Version 1.0
 */
public class Chick1 extends Animal1 {
    public Chick1(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在进食...");
    }
    
    void layEggs() {
        System.out.println(color + "的" + age + "岁小鸡" + name + "正在小鸡...");
    }
}
