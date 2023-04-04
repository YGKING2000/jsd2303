package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Lambda表达式的演示
 * @ClassName LambdaDemo
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 16:07
 * @Version 1.0
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(29, 17));
        list.add(new Point(55, 73));
        list.add(new Point(43, 86));
        list.add(new Point(99, 54));
        list.add(new Point(64, 52));
        list.add(new Point(36, 15));
        list.add(new Point(13, 6));
        System.out.println("排序前：" + list);// 排序前：[(29, 17), (55, 73), (43, 86), (99, 54), (64, 52), (36, 15), (13, 6)]
        list.sort(((o1, o2) -> o1.getX() - o2.getX()));
        System.out.println("排序后：" + list);// 排序后：[(13, 6), (29, 17), (36, 15), (43, 86), (55, 73), (64, 52), (99, 54)]


    }
}
