package homework.ooday02.standard;

/**
 * @Description 鱼的类
 * @ClassName Fish1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:05
 * @Version 1.0
 */
public class Fish1 extends Animal1 {
    public Fish1(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鱼" + name + "正在进食...");
    }
}
