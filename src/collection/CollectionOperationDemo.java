package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Description 集合操作的演示
 * @ClassName CollectionOperationDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 11:32
 * @Version 1.0
 */
public class CollectionOperationDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("java");
        collection.add("c++");
        collection.add("python");
        Collection collection1 = new ArrayList();
        collection1.add("c#");
        collection1.add("java");
        collection1.add("php");
    
        System.out.println("collection: " + collection);// collection: [java, c++, python]
        System.out.println("collection1: " + collection1);// collection1: [c#, java, php]
        collection.addAll(collection1);
        System.out.println("collection: " + collection);// collection: [java, c++, python, c#, java, php]
        System.out.println("collection1: " + collection1);// collection1: [c#, java, php]
        
        Collection collection2 = new ArrayList();
        collection2.add("java");
        collection2.add("c++");
        collection2.add(".net");
        boolean flag = collection.containsAll(collection2);
        System.out.println(flag);// false
    
        System.out.println(collection);// [java, c++, python, c#, java, php]
        collection.retainAll(collection2);
        System.out.println("collection: " + collection);// collection: [java, c++, java]
        System.out.println("collection2: " + collection2);// collection2: [c#, java, .net]
    
        System.out.println(collection);// [java, c++, java]
        collection.removeAll(collection2);
        System.out.println("collection: " + collection);// [java, c++, java]
        System.out.println("collection2: " + collection2);// // collection2: [c#, java, .net]
    }
}
