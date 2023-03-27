package homework.ooday02.standard;

/**
 * @Description 医生类
 * @ClassName Doctor1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:38
 * @Version 1.0
 */
public class Doctor1 extends Person1 {
    String title;
    
    public Doctor1(String name, String address, int age, String title) {
        super(name, address, age);
        this.title = title;
    }
    
    void cut() {
        System.out.println(name + "正在做手术...");
    }
}
