package ooday03;

/**
 * @Description
 * @ClassName SwimTest
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 14:14
 * @Version 1.0
 */
public class SwimTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑", 6, "黑色");
        dog.eat();     // 重写超类Animal的方法
        dog.drink();   // 继承自Animal类的方法
        dog.swim();    // 重写接口Swim的方法
        dog.lookHome();// Dog类特有的方法
    
        Chick chick = new Chick("小白", 2, "白色");
        chick.eat();    // 重写超类Animal的方法
        chick.drink();  // 继承自Animal类的方法
        chick.layEggs();// Dog类特有的方法
        
        Fish fish = new Fish("小灰", 444, "灰色");
        fish.eat();     // 重写超类Animal的方法
        fish.drink();   // 继承自超类Animal的方法
        fish.swim();    // 重写接口Swim的方法
    }
}
