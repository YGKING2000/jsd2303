package ooday04;

/**
 * @Description 多态性的演示
 * @ClassName Test
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 09:40
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 演示向上造型(多态)的第1点应用:
        
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("哈哈", 4, "褐色");
        animals[1] = new Dog("小灰", 5, "灰色");
        animals[4] = new Fish("小青", 8, "青色");
        animals[2] = new Chick("小兰", 6, "蓝色");
        animals[3] = new Chick("小金", 7, "金色");
        for (Animal animal : animals) {
            System.out.println(animal.name);
            System.out.println(animal.age);
            System.out.println(animal.color);
            animal.eat();
            animal.drink();
            
            if (animal instanceof Dog) {
                // Dog dog = (Dog) animal;
                // dog.swim();
                // dog.lookHome();
                ((Dog) animal).lookHome();
            }
            if (animal instanceof Chick) {
                // Chick chick = (Chick) animal;
                // chick.layEggs();
                ((Chick) animal).layEggs();
            }
            // if (animal instanceof Fish) {
            //     Fish fish = (Fish) animal;
            //     fish.swim();
            // }
            if (animal instanceof Swim) {
                ((Swim) animal).swim();
            }
        }
        System.out.println("---------------------------");
    
        /*// 演示向上造型(多态)的第2点应用:
        Master master = new Master();
        Dog dog = new Dog("小黑", 9, "黑色");
        Chick chick = new Chick("小白", 3, "白色");
        Fish fish = new Fish("小灰", 7, "灰色");
        // 在传递参数的时候，系统自动帮我们做了向上造型
        master.feed(dog);
        master.feed(chick);
        master.feed(fish);
        System.out.println("---------------------------");*/
    }
}
