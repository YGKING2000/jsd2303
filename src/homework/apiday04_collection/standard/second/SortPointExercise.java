package homework.apiday04_collection.standard.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 点的集合排序
 * @ClassName SortPointExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 20:49
 * @Version 1.0
 */
public class SortPointExercise {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(6, 8));
        list.add(new Point(2, 0));
        list.add(new Point(7, 3));
        list.add(new Point(9, 4));
        list.add(new Point(1, 5));
        System.out.println(list);// [(6, 8), (2, 0), (7, 3), (9, 4), (1, 5)]

        list.sort((o1, o2) -> o2.getX() - o1.getX());
        System.out.println(list);// [(9, 4), (7, 3), (6, 8), (2, 0), (1, 5)]

        list.sort((o1, o2) -> o1.getY() - o2.getY());
        System.out.println(list);// [(2, 0), (7, 3), (9, 4), (1, 5), (6, 8)]

        list.sort((o1, o2) -> {
            int length1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
            int length2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
            return length2 - length1;
        });
        System.out.println(list);// [(6, 8), (9, 4), (7, 3), (1, 5), (2, 0)]
    }
}
