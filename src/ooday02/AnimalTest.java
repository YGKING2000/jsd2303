package ooday02;

/**
 * @Description 动物测试类
 * @ClassName AnimalTest
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 16:26
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小金", 3, "金色");
        dog.eat();
        dog.drink();
        dog.lookHome();
        Dog dog1 = new Dog("小白", 2, "白色");
        dog1.eat();
        dog1.drink();
        dog1.lookHome();
        Dog dog2 = new Dog("小黑", 1, "黑色");
        dog2.eat();
        dog2.drink();
        dog2.lookHome();
        Dog dog3 = new Dog("小灰", 4, "灰色");
        dog3.eat();
        dog3.drink();
        dog3.lookHome();
        System.out.println();
        
    
        Chick chick = new Chick("小黑", 2, "黑色");
        chick.eat();
        chick.drink();
        chick.layEggs();
        Chick chick1 = new Chick("小橙", 3, "橙红色");
        chick1.eat();
        chick1.drink();
        chick1.layEggs();
        Chick chick2 = new Chick("小白", 4, "白色");
        chick2.eat();
        chick2.drink();
        chick2.layEggs();
        Chick chick3 = new Chick("小玉", 1, "玉色");
        chick3.eat();
        chick3.drink();
        chick3.layEggs();
        System.out.println();
        
        Fish fish = new Fish("小蓝", 6, "蓝色");
        fish.eat();
        fish.drink();
        Fish fish1 = new Fish("小格陵兰鲨", 400, "灰色");
        fish1.eat();
        fish1.drink();
        Fish fish2 = new Fish("小青", 6, "青色");
        fish2.eat();
        fish2.drink();
        Fish fish3 = new Fish("小红", 7, "红色");
        fish3.eat();
        fish3.drink();
    }
}
