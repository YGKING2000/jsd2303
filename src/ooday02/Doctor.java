package ooday02;

/**
 * @Description 医生类
 * @ClassName Doctor
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 09:32
 * @Version 1.0
 */
public class Doctor extends Person {
    /*String title;
    
    Doctor(String name, int age, String address, String title) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.title = title;
    }
    
    void cut() {
        System.out.println(name + "正在做手术...");
    }*/
    
    String title;
    
    public Doctor(String name, int age, String address, String title) {
        /*super.name = name;
        super.age = age;
        super.address = address;*/
        super(name, age, address);
        
        this.title = title;
    }
    
    void cut() {
        System.out.println(super.name + "正在做手术...");
    }
}
