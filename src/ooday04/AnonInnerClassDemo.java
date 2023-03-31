package ooday04;

import java.util.Scanner;

/**
 * @Description 匿名内部类的演示
 * @ClassName AnonInnerClassDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 15:25
 * @Version 1.0
 */
public class AnonInnerClassDemo {
    public static void main(String[] args) {
        /*
         * new Aoo() {}相当于干了下面两件事
         * 1.为Aoo类创建了一个匿名的派生类
         * 2.为这个派生类创建了一个名为o的对象，并向上造型为Aoo类型
         * 注意事项：大括号需要重写Aoo类中的抽象方法
         */
        // o与o1所引用的对象不是一个类型
        Aoo o1 = new Aoo() {};
        Aoo o2 = new Aoo() {};
        System.out.println(o1 instanceof Aoo);// ture
        System.out.println(o2 instanceof Aoo);// ture
        
        Aoo boo = new Boo();// 相当于第2件事
        
        int num = 379;
        Coo o3 = new Coo() {
            @Override
            void show() {
                System.out.println(num);
                // num++;//
                System.out.println("show");
            }
        };
        o3.show();// show
    }
}

abstract class Aoo {

}

class Boo extends Aoo {}// 相当于第1件事

abstract class Coo {
    abstract void show();
}
