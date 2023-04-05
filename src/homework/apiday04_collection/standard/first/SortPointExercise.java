package homework.apiday04_collection.standard.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 对象类集合排序
 * @ClassName SortPointExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 14:01
 * @Version 1.0
 */
public class SortPointExercise {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(56, 93));
        list.add(new Point(86, 23));
        list.add(new Point(9, 61));
        list.add(new Point(15, 36));
        list.add(new Point(92, 78));
        System.out.println(list);// [(x=56, y=93), (x=86, y=23), (x=9, y=61), (x=15, y=36), (x=92, y=78)]

        Collections.sort(list, (o1, o2) -> o1.getX() - o2.getX());
        System.out.println(list);// [(x=9, y=61), (x=15, y=36), (x=56, y=93), (x=86, y=23), (x=92, y=78)]

        Collections.sort(list, (o1, o2) -> o2.getY() - o1.getY());
        System.out.println(list);// [(x=56, y=93), (x=92, y=78), (x=9, y=61), (x=15, y=36), (x=86, y=23)]

        Collections.sort(list, (o1, o2) -> {
            int length1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
            int length2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
            return length1 - length2;
        });
        System.out.println(list);// [(x=15, y=36), (x=9, y=61), (x=86, y=23), (x=56, y=93), (x=92, y=78)]
    }
}
