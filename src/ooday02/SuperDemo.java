package ooday02;

/**
 * @Description
 * @ClassName SuperDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 11:57
 * @Version 1.0
 */
public class SuperDemo {
    public static void main(String[] args) {
        Boo b = new Boo();
    }
}

class Aoo {
    Aoo() {
        System.out.println("正在执行超类无参构造方法...");
    }
}

class Boo extends Aoo {
    Boo() {
        System.out.println("正在执行派生类无参构造方法...");
    }
}

class Coo {
    Coo(int a) {
        System.out.println("正在执行超类无参构造方法...");
    }
}

class Doo extends Coo {
    
    Doo() {
        super(379);
        System.out.println("正在执行派生类无参构造方法...");
    }
    
}