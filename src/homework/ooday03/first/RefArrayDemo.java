package homework.ooday03.first;

/**
 * @Description 引用类型数组的赋值、遍历和调用
 * @ClassName RefArrayDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 21:03
 * @Version 1.0
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小黑", "黑色", 3);
        dogs[1] = new Dog("小灰", "灰色", 9);
        dogs[2] = new Dog("小白", "白色", 7);
        dogs[1].age = 12;
        dogs[2].name = "黑子";
        dogs[0].color = "蓝色";
        for (Dog dog : dogs) {
            System.out.println(dog.name + ", " + dog.age);
            dog.swim();
            dog.drink();
            dog.lookHome();
        }
    }
}
