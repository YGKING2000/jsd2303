package homework.ooday02.standard;

/**
 * @Description
 * @ClassName Test1
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 19:39
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Student1 htt = new Student1("胡图图", "翻斗大街翻斗花园2号楼1001室", 3, "jsd2303", "1001");
        htt.eat();
        htt.sleep();
        htt.sayHi();
        htt.study();
        System.out.println();
        
        Teacher1 hg = new Teacher1("胡歌", "上海", 39, 9527);
        hg.eat();
        hg.sleep();
        hg.sayHi();
        hg.teach();
        System.out.println();
        
        Doctor1 lyf = new Doctor1("刘亦菲", "上海", 35, "副主任医师");
        lyf.eat();
        lyf.sleep();
        lyf.sayHi();
        lyf.cut();
    }
}
