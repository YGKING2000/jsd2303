package homework.ooday01.extensional;

/**
 * @ClassName DogTest
 * @Description 狗的测试类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 18:38
 * @Version 1.0
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("小白", "金色", "阿拉斯加犬");
        dog1.bark();
        dog1.eat();
        System.out.println();
        
        Dog dog2 = new Dog("二哈", "黑白色", "哈士奇");
        dog2.bark();
        dog2.eat();
        System.out.println();
        
        Dog dog3 = new Dog("小艾", "金黄色", "柯基");
        dog3.bark();
        dog3.eat();
    }
}
