package homework.ooday02.standard;

/**
 * @Description 鱼的类
 * @ClassName Fish2
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:32
 * @Version 1.0
 */
public class Fish2 extends Animal2 {
    public Fish2(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鱼" + name + "正在吃小虾...");
    }
}
