package homework.ooday01.extensional;

/**
 * @ClassName FishTest
 * @Description 鱼的测试类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 18:54
 * @Version 1.0
 */
public class FishTest {
    public static void main(String[] args) {
        Fish fish1 = new Fish("鲫鱼", 2.6, 33, 9.9);
        fish1.eat();
        fish1.getInfo();
        System.out.println();
        
        Fish fish2 = new Fish("鳜鱼", 3.9, 44, 19.9);
        fish2.eat();
        fish2.getInfo();
        System.out.println();
        
        Fish fish3 = new Fish("青鱼", 12.3, 101, 15.6);
        fish3.eat();
        fish3.getInfo();
        System.out.println();
        
        Fish fish4 = new Fish("草鱼", 5.4, 75, 18.7);
        fish4.eat();
        fish4.getInfo();
    }
}
