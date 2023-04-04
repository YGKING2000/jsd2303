package homework.apiday03_collection.second;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 集合Collection操作元素的方法
 * @ClassName CollectionBasicMethod
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 21:22
 * @Version 1.0
 */
public class CollectionBasicMethod {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);// []
        // 1.size()方法的练习
        System.out.println(collection.size());// 0
        // 2.add()方法的练习
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        System.out.println(collection.size());// 5
        System.out.println(collection);// [one, two, three, four, five]
        // 3.isEmpty()方法的练习
        System.out.println(collection.isEmpty());
        // 4.contains()方法的练习
        System.out.println(collection.contains("six"));// false
        System.out.println(collection.contains("one"));// true
        // 5.remove()方法的练习
        System.out.println(collection.remove("six"));// false
        System.out.println(collection.remove("three"));// true
        System.out.println(collection.size());// 4
        System.out.println(collection);// [one, two, four, five]
        // 6.clear()方法的练习
        collection.clear();
        System.out.println(collection);// []
        System.out.println(collection.isEmpty());// true
        System.out.println(collection.size());// 0
    }
}
