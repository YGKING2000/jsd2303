package ooday02;

/**
 * @Description 教师类
 * @ClassName Teacher
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 09:31
 * @Version 1.0
 */
public class Teacher extends Person {
   /* double salary;
    
    Teacher(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
    
    void teach() {
        System.out.println(name + "正在讲课...");
    }*/
    
    double salary;
    
    public Teacher(String name, int age, String address, double salary) {
        /*super.name = name;
        super.age = age;
        super.address = address;*/
        super(name, age, address);
        
        this.salary = salary;
    }
    
    void teach() {
        System.out.println(super.name + "正在讲课...");
    }
    
    void sayHi() {
        System.out.println("大家好，我是" + name + "，我今年" + age +"岁了，住在" + address + "，每月工资是" + salary + "元");
    }
}
