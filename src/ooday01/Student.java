package ooday01;

/**
 * @ClassName Student
 * @Description 学生类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 10:30
 * @Version 1.0
 */
/*public class Student {
    String name;
    int age;
    String classRoom;
    String stuId;
    
    void study() {
        System.out.println(this.name + "正在学习！");
    }
    
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁了！所在班级是" + classRoom + "，学号为" + stuId);
    }
    
    void playWith(String anotherName) {
        System.out.println(name + "正在和" + anotherName + "一起玩耍！");
    }
}*/

public class Student {
    // 成员属性/成员变量
    String name;
    int age;
    String stuId;
    String classRoom;
    
    // 无参构造方法
    public Student() {
    }
    
    public Student(String name, int age, String stuId) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
    }
    
    // 有参构造方法: 给新创建的对象的成员属性初始化赋值
    public Student(String name, int age, String stuId, String classRoom) {
        this(name, age, stuId);
        this.classRoom = classRoom;
    }
    
    // 成员方法
    void study() {
        System.out.println(name + "正在学习ing......");
    }
    
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁了，所在班级是" + classRoom + "，学号为" + stuId);
    }
    
    void playWith(String anotherName) {
        System.out.println(name + "正在和" + anotherName + "一起玩耍！");
    }
}
