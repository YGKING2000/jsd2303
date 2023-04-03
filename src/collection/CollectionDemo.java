package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 集合collection的演示
 * @ClassName CollectionDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 09:19
 * @Version 1.0
 */
public class CollectionDemo {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        // 下面的int数据类型被自动装箱成包装类Integer类型
        collection.add(1);
        System.out.println(collection);// [one, two, three, four, five, 1]
    
        System.out.println(collection.size());// 6
        System.out.println(collection.isEmpty());// false
        collection.clear();
        System.out.println(collection.size());// 0
        System.out.println(collection.isEmpty());// true*/
        
        Collection collection = new ArrayList();
        collection.add(new Point(1, 2));
        collection.add(new Point(3, 4));
        collection.add(new Point(5, 6));
        collection.add(new Point(7, 8));
        collection.add(new Point(9, 10));
        collection.add(new Point(1, 2));
        System.out.println(collection);// [(1, 2), (3, 4), (5, 6), (7, 8), (9, 10)]
        
        Point point = new Point(1, 2);
        Point point2 = new Point(1, 3);
        boolean flag = collection.contains(point);
        boolean flag2 = collection.contains(point2);
        System.out.println(flag);// true
        System.out.println(flag2);// false
    
        System.out.println(collection);// [(1, 2), (3, 4), (5, 6), (7, 8), (9, 10), (1, 2)]
        boolean flag3 = collection.remove(point);
        boolean flag4 = collection.remove(point2);
        System.out.println(flag3);// true
        System.out.println(flag4);// false
        System.out.println(collection);// [(3, 4), (5, 6), (7, 8), (9, 10), (1, 2)]
        
        Collection collection1 = new ArrayList();
        Point point1 = new Point(1, 2);
        collection1.add(point1);
        System.out.println("point1: " + point1);// (1, 2)
        System.out.println("collection1: " + collection1);// [(1, 2)]
    
        point1.setX(100);
        System.out.println("point1: " + point1);// (100, 2)
        System.out.println("collection1: " + collection1);// [(100, 2)]
    }
}
