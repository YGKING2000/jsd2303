package homework.ooday02.standard;

/**
 * @Description 学生类
 * @ClassName Student2
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:14
 * @Version 1.0
 */
public class Student2 extends Person2 {
    String className;
    String stuId;
    
    public Student2(String name, String address, int age, String className, String stuId) {
        super(name, address, age);
        this.className = className;
        this.stuId = stuId;
    }
    
    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁了，家住" + address + "，所在班级是" + className + "，学号是" + stuId);
    }
    
    void study() {
        System.out.println(name + "正在学习...");
    }
}
