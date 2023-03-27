package homework.ooday02.standard;

/**
 * @Description 医生类
 * @ClassName Doctor
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 18:48
 * @Version 1.0
 */
public class Doctor extends Person {
    String title;
    
    Doctor(String name, int age, String address, String title) {
        super(name, age, address);
        this.title = title;
    }
    
    void cut() {
        System.out.println(name + "正在做手术...");
    }
}
