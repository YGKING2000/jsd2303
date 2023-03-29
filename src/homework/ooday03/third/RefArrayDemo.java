package homework.ooday03.third;

/**
 * @Description
 * @ClassName RefArrayDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 21:31
 * @Version 1.0
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("小金", "金色", 6);
        dogs[1] = new Dog("小百", "白色", 19);
        dogs[0].name = "金子";
        dogs[1].age = 16;
        for (Dog dog : dogs) {
            dog.lookHome();
            dog.eat();
            System.out.println(dog.color + ", " + dog.name);
        }
    }
}
