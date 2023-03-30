package homework.ooday04.second;

/**
 * @Description 测试类
 * @ClassName Test
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 19:30
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];
        animals[0] = new Dog("小黑", "黑色", 3);
        animals[1] = new Dog("小白", "白色", 7);
        animals[2] = new Dog("小灰", "灰色", 9);
        animals[3] = new Fish("小青", "青色", 10);
        animals[4] = new Fish("小澄", "橙色", 12);
        animals[5] = new Chick("小兰", "蓝色", 16);
        animals[6] = new Chick("小和", "褐色", 19);
        for (Animal animal : animals) {
            System.out.print(animal.name + ", ");
            System.out.print(animal.color + ", ");
            System.out.println(animal.age);
            animal.eat();
            animal.drink();
            if (animal instanceof Dog) {
                ((Dog) animal).lookHome();
            }
            if (animal instanceof Chick) {
                ((Chick) animal).layEggs();
            }
            if (animal instanceof Swim) {
                ((Swim) animal).swim();
            }
        }
        System.out.println();
        
        Master master = new Master();
        Dog dog = new Dog("小黑", "黑色", 3);
        Fish fish = new Fish("小白", "白色", 7);
        Chick chick = new Chick("小灰", "灰色", 9);
        master.feed(dog);
        master.feed(fish);
        master.feed(chick);
    }
}
