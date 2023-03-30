package homework.ooday03.second;

/**
 * @Description 引用数据类型的赋值、遍历和调用
 * @ClassName RefArrayDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 21:12
 * @Version 1.0
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[4];
        dogs[0] = new Dog("小绿", "绿色", 3);
        dogs[1] = new Dog("小金", "金色", 7);
        dogs[2] = new Dog("小橙", "橙色", 9);
        dogs[3] = new Dog("小兰", "蓝色", 12);
        dogs[0].name = "哈哈哈";
        dogs[1].age = 16;
        dogs[2].color = "红褐色";
        dogs[3].lookHome();
        for (Dog dog : dogs) {
            dog.drink();
            dog.eat();
            System.out.println(dog.name + ", " + dog.age);
        }
    }
}
