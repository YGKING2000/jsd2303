package homework.ooday02.standard;

/**
 * @Description 动物测试类
 * @ClassName AnimaTest2
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:33
 * @Version 1.0
 */
public class AnimaTest2 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("粽子", "棕色", 6);
        dog2.eat();
        dog2.drink();
        dog2.lookHome();
        Dog2 dog21 = new Dog2("黑子", "深灰色", 5);
        dog21.eat();
        dog21.drink();
        dog21.lookHome();
        Dog2 dog22 = new Dog2("小河", "褐色", 4);
        dog22.eat();
        dog22.drink();
        dog22.lookHome();
        System.out.println();
        
        Chick2 chick2 = new Chick2("大灰", "灰色", 3);
        chick2.eat();
        chick2.drink();
        chick2.layEggs();
        Chick2 chick21 = new Chick2("小紫", "紫色", 4);
        chick21.eat();
        chick21.drink();
        chick21.layEggs();
        Chick2 chick22 = new Chick2("小橙", "橙色", 5);
        chick22.eat();
        chick22.drink();
        chick22.layEggs();
        System.out.println();
        
        Fish2 fish2 = new Fish2("小白", "白色", 365);
        fish2.eat();
        fish2.drink();
        Fish2 fish21 = new Fish2("小银", "银色", 300);
        fish21.eat();
        fish21.drink();
    }
}
