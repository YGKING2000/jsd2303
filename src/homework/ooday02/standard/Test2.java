package homework.ooday02.standard;

/**
 * @Description 测试类
 * @ClassName Test2
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 20:21
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Student2 htt = new Student2("胡图图", "翻斗大街翻斗花园2号楼1001室", 3, "jsd2303", "1001");
        htt.eat();
        htt.sleep();
        htt.sayHi();
        htt.study();
        System.out.println();
        
        Teacher2 hg = new Teacher2("胡歌", "上海", 39, 20458);
        hg.eat();
        hg.sleep();
        hg.sayHi();
        hg.teach();
        System.out.println();
        
        Doctor2 lyf = new Doctor2("刘亦菲", "上海", 35, "主任医师");
        lyf.eat();
        lyf.sleep();
        lyf.sayHi();
        lyf.cut();
    }
}
