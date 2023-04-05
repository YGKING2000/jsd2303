package homework.apiday04_collection.standard.third;

import homework.apiday04_collection.standard.second.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 点的集合排序
 * @ClassName SortPointExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 22:14
 * @Version 1.0
 */
public class SortPointExercise {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(53, 64));
        list.add(new Point(46, 12));
        list.add(new Point(49, 83));
        list.add(new Point(36, 14));
        list.add(new Point(21, 79));
        System.out.println(list);// [(53, 64), (46, 12), (49, 83), (36, 14), (21, 79)]

        list.sort((o1, o2) -> o1.getY() - o2.getY());
        System.out.println(list);// [(46, 12), (36, 14), (53, 64), (21, 79), (49, 83)]

        list.sort((o1, o2) -> o2.getX() - o1.getX());
        System.out.println(list);// [(53, 64), (49, 83), (46, 12), (36, 14), (21, 79)]

        list.sort((o1, o2) -> {
            int length1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
            int length2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
            return length1 - length2;
        });
        System.out.println(list);// [(36, 14), (46, 12), (21, 79), (53, 64), (49, 83)]
    }
}
