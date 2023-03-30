package homework.ooday04.first;

/**
 * @Description 测试类
 * @ClassName Test
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 17:58
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("小黑", "黑色", 3);
        animals[1] = new Dog("小灰", "灰色", 4);
        animals[2] = new Fish("小青", "青色", 5);
        animals[3] = new Fish("小白", "白色", 6);
        animals[4] = new Chick("小花", "花色", 7);
        animals[5] = new Chick("小兰", "蓝色", 9);
        for (Animal animal : animals) {
            System.out.print(animal.name + ", ");
            System.out.print(animal.color + ", ");
            System.out.println(animal.age);
            animal.eat();
            animal.drink();
            if (animal instanceof Swim) {
                ((Swim) animal).swim();
            }
            if (animal instanceof Dog) {
                ((Dog) animal).lookHome();
            }
            if (animal instanceof Chick) {
                ((Chick) animal).layEggs();
            }
        }
        System.out.println();
        
        Master master = new Master();
        Dog dog = new Dog("小橙", "橙色", 12);
        Chick chick = new Chick("小河", "褐色", 16);
        Fish fish = new Fish("小紫", "紫色", 19);
        master.feed(dog);
        master.feed(chick);
        master.feed(fish);
    }
}
