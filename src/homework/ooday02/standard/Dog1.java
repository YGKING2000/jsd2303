package homework.ooday02.standard;

/**
 * @Description
 * @ClassName Dog1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:50
 * @Version 1.0
 */
public class Dog1 extends Animal1 {
    public Dog1(String name, String color, int age) {
        super(name, color, age);
    }
    
    @Override
    void eat() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在进食...");
    }
    
    void lookHome() {
        System.out.println(color + "的" + age + "岁狗狗" + name + "正在看家...");
    }
}
