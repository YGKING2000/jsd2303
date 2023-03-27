package homework.ooday02.standard;

/**
 * @Description 动物测试类
 * @ClassName AnimalTest
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:20
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑", "褐色", 2);
        dog.eat();
        dog.drink();
        dog.lookHome();
        Dog dog1 = new Dog("小灰", "灰白色", 1);
        dog1.eat();
        dog1.drink();
        dog1.lookHome();
        Dog dog2 = new Dog("小紫", "紫色", 6);
        dog2.eat();
        dog2.drink();
        dog2.lookHome();
        System.out.println();
        
        Chick chick = new Chick("小白", "白灰色", 1);
        chick.eat();
        chick.drink();
        chick.layEggs();
        Chick chick1 = new Chick("小红", "红色", 2);
        chick1.eat();
        chick1.drink();
        chick1.layEggs();
        Chick chick2 = new Chick("小绿", "绿色", 3);
        chick2.eat();
        chick2.drink();
        chick2.layEggs();
        System.out.println();
        
        Fish fish = new Fish("小蓝", "蓝色", 18);
        fish.eat();
        fish.drink();
        Fish fish1 = new Fish("小青", "青色", 26);
        fish1.eat();
        fish1.drink();
    }
}
