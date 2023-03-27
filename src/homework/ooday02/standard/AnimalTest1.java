package homework.ooday02.standard;

/**
 * @Description
 * @ClassName AnimalTest1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:06
 * @Version 1.0
 */
public class AnimalTest1 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("小黑", "黑色", 3);
        dog1.eat();
        dog1.drink();
        dog1.lookHome();
        Dog1 dog11 = new Dog1("小虎", "黄色", 6);
        dog11.eat();
        dog11.drink();
        dog11.lookHome();
        Dog1 dog12 = new Dog1("小黄", "黄褐色", 16);
        dog12.eat();
        dog12.drink();
        dog12.lookHome();
        System.out.println();
        
        Chick1 chick1 = new Chick1("小红", "红色", 4);
        chick1.eat();
        chick1.drink();
        chick1.layEggs();
        Chick1 chick11 = new Chick1("小赤", "赤褐色", 1);
        chick11.eat();
        chick11.drink();
        chick11.layEggs();
        Chick1 chick12 = new Chick1("小蓝", "灰蓝色", 2);
        chick12.eat();
        chick12.drink();
        chick12.layEggs();
        System.out.println();
        
        Fish1 fish1 = new Fish1("小格", "灰黑色", 444);
        fish1.eat();
        fish1.drink();
        Fish1 fish11 = new Fish1("小红", "红色", 270);
        fish11.eat();
        fish11.drink();
    }
}
