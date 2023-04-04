package homework.apiday03_collection.third;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 集合操作集合的方法的练习
 * @ClassName CollectionAdvancedMethod
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:41
 * @Version 1.0
 */
public class CollectionAdvancedMethod {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        collection.add("six");
        collection.add("seven");
        System.out.println(collection);// [one, two, three, four, five, six, seven]
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("one");
        collection1.add("six");
        collection1.add("eight");
        collection1.add("nine");
        collection1.add("eleven");
        collection1.add("ten");
        System.out.println(collection1);// [one, six, eight, nine, eleven, ten]

        System.out.println(collection.containsAll(collection1));// false

        collection.addAll(collection1);
        System.out.println(collection);// [one, two, three, four, five, six, seven, one, six, eight, nine, eleven, ten]

        System.out.println(collection.containsAll(collection1));// true

        collection.retainAll(collection1);
        System.out.println("collection:" + collection);// collection:[one, six, one, six, eight, nine, eleven, ten]
        System.out.println("collection1:" + collection1);// collection1:[one, six, eight, nine, eleven, ten]

        collection.removeAll(collection1);
        System.out.println(collection);// []
    }
}
