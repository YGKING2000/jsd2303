package homework.apiday03_collection.second;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 集合Collection操作集合的方法
 * @ClassName CollectionAdvancedMethod
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 21:35
 * @Version 1.0
 */
public class CollectionAdvancedMethod {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("java");
        collection.add("android");
        collection.add("python");
        System.out.println(collection);// [java, android, python]
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("c++");
        collection1.add("php");
        collection1.add("c#");
        System.out.println(collection1);// [c++, php, c#]

        // 1.addAll()方法的练习
        collection.addAll(collection1);
        System.out.println(collection);// [java, android, python, c++, php, c#]

        // 2.containsAll()方法的练习
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("java");
        collection2.add("go");
        System.out.println(collection.containsAll(collection1));// true
        System.out.println(collection.containsAll(collection2));// false

        // 3.removeAll()方法的练习
        System.out.println(collection);// [java, android, python, c++, php, c#]
        collection.removeAll(collection2);
        System.out.println(collection);// [android, python, c++, php, c#]

        // 4.retainAll()方法的练习
        collection.removeAll(collection1);
        System.out.println(collection);// [android, python]
    }
}
