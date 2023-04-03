package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description 泛型的演示
 * @ClassName GenericDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 15:57
 * @Version 1.0
 */
public class GenericDemo {
    public static void main(String[] args) {
        /*Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        String[] data = collection.toArray(new String[0]);
        String[] data1 = collection.toArray(new String[collection.size()]);
        String[] data2 = collection.toArray(new String[collection.size() + 3]);
        System.out.println(Arrays.toString(data));// [one, two, three, four, five]
        System.out.println(Arrays.toString(data1));// [one, two, three, four, five]
        System.out.println(Arrays.toString(data2));// [one, two, three, four, five, null, null, null]
        // collection.add(123);// 编译失败，参数类型和集合泛型不同
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // one two three four five
        System.out.println();
        
        for (String str : collection) {
            System.out.print(str + " ");
        }
        // one two three four five*/
        
        Collection<Point> collection = new ArrayList<>();
        collection.add(new Point(1, 2));
        collection.add(new Point(3, 4));
        collection.add(new Point(5, 6));
        collection.add(new Point(7, 8));
        collection.add(new Point(9, 10));
        Iterator<Point> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // (1, 2) (3, 4) (5, 6) (7, 8) (9, 10)
        System.out.println();
        for (Point point : collection) {
            System.out.print(point + " ");
        }
        // (1, 2) (3, 4) (5, 6) (7, 8) (9, 10)
    }
}
