package ooday04;

/**
 * @Description 内部类的演示
 * @ClassName InnerClassDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 14:51
 * @Version 1.0
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Mama mama = new Mama();
        // 内部类只能在最近的外部类中可见和使用，在其它类中不可见
        // Baby baby = new Baby();
    }
}
