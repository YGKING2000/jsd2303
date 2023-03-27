package ooday02;

/**
 * @Description 学生类
 * @ClassName Student
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 09:31
 * @Version 1.0
 */
public class Student extends Person {
    /*String className;
    String stuId;
    
    Student(String name, int age, String address, String className, String stuId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
        this.stuId = stuId;
    }
    
    void study() {
        System.out.println(name + "正在学习...");
    }*/
    
    String className;
    String stuId;
    
    // super指代当前类的超类Person，this指代当前类Student
    public Student(String name, int age, String address, String className, String stuId) {
        /*super.name = name;
        super.age = age;
        super.address = address;*/
        super(name, age, address);
        
        this.className = className;
        this.stuId = stuId;
    }
    
    void study() {
        System.out.println(name + "正在学习...");
    }
    
    void sayHi() {
        System.out.println("大家好，我叫" + name + "我今年" + age + "岁了，家住" + address + "，班级名称是" + className + "，学号是" + stuId);
    }
}