package ooday01;

/**
 * @ClassName CarTest
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 16:13
 * @Version 1.0
 */
public class CarTest {
    public static void main(String[] args) {
        Car tsl = new Car("特斯拉", "灰色", 299999);
        System.out.println(tsl.toString());
        tsl.start();
        tsl.run();
        tsl.stop();
        System.out.println();
        
        Car fll = new Car("法拉利", "红色", 3999999);
        System.out.println(fll.toString());
        fll.start();
        fll.run();
        fll.stop();
        System.out.println();
        
        Car lbjn = new Car("兰博基尼", "紫金色", 7999999);
        System.out.println(lbjn.toString());
        lbjn.start();
        lbjn.run();
        lbjn.stop();
        System.out.println();
        
        Car bjd = new Car("布加迪", "银色", 5999999);
        System.out.println(bjd.toString());
        bjd.start();
        bjd.run();
        bjd.stop();
    }
}
