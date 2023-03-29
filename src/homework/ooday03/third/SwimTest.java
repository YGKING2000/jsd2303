package homework.ooday03.third;

/**
 * @Description 测试类
 * @ClassName SwimTest
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 20:54
 * @Version 1.0
 */
public class SwimTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小兰", "蓝色", 3);
        dog.eat();
        dog.swim();
        dog.drink();
        dog.lookHome();
        Dog dog1 = new Dog("小河", "褐色", 7);
        dog1.eat();
        dog1.swim();
        dog1.drink();
        dog1.lookHome();
        Dog dog2 = new Dog("小青", "青色", 9);
        dog2.eat();
        dog2.swim();
        dog2.drink();
        dog2.lookHome();
        System.out.println();
        
        Chick chick = new Chick("小吕", "绿色", 3);
        chick.eat();
        chick.drink();
        chick.layEggs();
        Chick chick1 = new Chick("小橙", "橙色", 7);
        chick1.eat();
        chick1.drink();
        chick1.layEggs();
        Chick chick2 = new Chick("小紫", "紫色", 9);
        chick2.eat();
        chick2.drink();
        chick2.layEggs();
        System.out.println();
        
        Fish fish = new Fish("小红", "红色", 3);
        fish.eat();
        fish.swim();
        fish.drink();
        Fish fish1 = new Fish("小金", "金色", 9);
        fish1.eat();
        fish1.swim();
        fish1.drink();
    }
}
