package homework.ooday02.standard;

/**
 * @Description 鱼的类
 * @ClassName Fish
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:15
 * @Version 1.0
 */
public class Fish extends Animal {
    Fish(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁小鱼" + name + "正在吃小虾...");
    }
}
