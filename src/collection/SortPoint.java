package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @ClassName SortPoint
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 15:34
 * @Version 1.0
 */
public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(29, 17));
        list.add(new Point(55, 73));
        list.add(new Point(43, 86));
        list.add(new Point(99, 54));
        list.add(new Point(64, 52));
        list.add(new Point(36, 15));
        list.add(new Point(13, 6));

        System.out.println(list);// [(29, 17), (55, 73), (43, 86), (99, 54), (64, 52), (36, 15), (13, 6)]

        /*list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.getX() - o2.getX();
            }
        });*/
        list.sort((o1, o2) -> {
            int length1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
            int length2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
            return length1 - length2;
        });
        /*Collections.sort(list, new Comparator<Point>() {
             // compare()方法用于定义o1和o2比较大小的规则，它的返回值表达大小关系
             // 结论:
             //  (1)前面的-后面的------------升序
             //  (2)后面的-前面的------------降序
            @Override
            public int compare(Point o1, Point o2) {
                // 按照x的大小升序排列
                // return o1.getX() - o2.getX();

                // 按照各个点与原点的距离升序排列
                int length1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
                int length2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
                return length1 - length2;
            }
        });*/

        System.out.println(list);// [(13, 6), (29, 17), (36, 15), (43, 86), (55, 73), (64, 52), (99, 54)]
        // System.out.println(list);// [(13, 6), (29, 17), (36, 15), (64, 52), (55, 73), (43, 86), (99, 54)]

    }
}
