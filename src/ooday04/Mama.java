package ooday04;

/**
 * @Description 外部类的演示
 * @ClassName Mama
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 14:31
 * @Version 1.0
 */
public class Mama {
    String name;
    Baby create() {
        // 内部类只能在最近的外部类中可见和使用
        // Baby baby = new Baby();
        // return baby;
        return new Baby();
        
        // 编译失败，Aoo类在Mama类中不可见，不能使用
        // Aoo aoo = new Aoo();
    }
    class Baby {
        class Aoo {
        
        }
        void show() {
            System.out.println(name);// 简便写法
            System.out.println(Mama.this.name);// 完整写法
            // System.out.println(Mama.name);// 编译失败，写法错误
            // System.out.println(this.name);// 编译失败，当前内部类没有name属性
        }
    }
}
