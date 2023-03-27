package homework.ooday02.standard;

/**
 * @Description 教师类
 * @ClassName Teacher1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:34
 * @Version 1.0
 */
public class Teacher1 extends Person1 {
    double salary;
    
    public Teacher1(String name, String address, int age, double salary) {
        super(name, address, age);
        this.salary = salary;
    }
    
    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁了，家住" + address + "，工资是" + salary);
    }
    
    void teach() {
        System.out.println(name + "正在讲课...");
    }
}
