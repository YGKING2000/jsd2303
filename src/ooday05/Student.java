package ooday05;

/**
 * @Description
 * @ClassName Student
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 14:41
 * @Version 1.0
 */
public class Student {
    String name;
    String stuId;
    int age;
    static String className;
    
    static {
        className = "jsd2303";
    }
    
    public Student(String name, String stuId, int age) {
        this.name = name;
        this.stuId = stuId;
        this.age = age;
    }
}
