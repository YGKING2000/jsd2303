package homework.ooday03.third;

/**
 * @Description 鱼的类
 * @ClassName Fish
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 20:51
 * @Version 1.0
 */
public class Fish extends Animal implements Swim {
    public Fish(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鱼" + name + "正在吃小虾...");
    }
    
    @Override
    public void swim() {
        System.out.println(color + "的" + age + "岁小鱼" + name + "正在自由泳...");
    }
}
