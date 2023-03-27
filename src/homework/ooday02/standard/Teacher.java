package homework.ooday02.standard;

/**
 * @Description 教师类
 * @ClassName Teacher
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 17:58
 * @Version 1.0
 */
public class Teacher extends Person {
    double salary;
    
    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }
    
    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了，家住" + address + "，工资是" + salary);
    }
    
    void teach() {
        System.out.println(name + "正在讲课...");
    }
}
