package ooday01;

/**
 * @ClassName StudentTest
 * @Description 学生测试类
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/24 10:32
 * @Version 1.0
 */
class StudentTest {
    public static void main(String[] args) {
        /*Student hg = new Student();
        hg.name = "胡歌";
        hg.age = 18;
        hg.stuId = "1001";
        hg.classRoom = "jsd2303";*/
        Student hg = new Student("胡歌", 18, "1001", "jsd2303");
        hg.study();
        hg.sayHi();
        hg.playWith("刘亦菲");
        System.out.println();
        
        /*Student lyf = new Student();
        lyf.name = "刘亦菲";
        lyf.age = 17;
        lyf.classRoom = "jsd2303";
        lyf.stuId = "1002";*/
        Student lyf = new Student("刘亦菲", 17, "1002", "jsd2303");
        lyf.study();
        lyf.sayHi();
        lyf.playWith(hg.name);
        System.out.println();
        
        /*Student lxy = new Student();
        lxy.name = "李逍遥";
        lxy.age = 16;
        lxy.stuId = "1003";
        lxy.classRoom = "jsd2303";*/
        Student lxy = new Student("李逍遥", 16, "1003", "jsd2303");
        lxy.study();
        lxy.sayHi();
        lxy.playWith("赵灵儿");
        System.out.println();
    
        /*Student zle = new Student();
        zle.name = "赵灵儿";
        zle.age = 15;
        zle.stuId = "1004";
        zle.classRoom = "jsd2303";*/
        Student zle = new Student("赵灵儿", 15, "1004", "jsd2303");
        zle.study();
        zle.sayHi();
        zle.playWith(lxy.name);
        System.out.println();
        
        Student mcs = new Student();
        mcs.study();
        mcs.sayHi();
        mcs.playWith("赵盼儿");
        System.out.println();
        
        Student zpe = new Student();
        zpe.study();
        zpe.sayHi();
        zpe.playWith("梅长苏");
    }
}
