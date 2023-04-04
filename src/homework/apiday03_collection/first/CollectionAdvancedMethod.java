package homework.apiday03_collection.first;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 集合与集合之间的操作方法
 * @ClassName CollectionAdvancedMethod
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 08:52
 * @Version 1.0
 */
public class CollectionAdvancedMethod {
    public static void main(String[] args) {
        // addAll()方法的练习：可重复添加
        Collection<String> collection = new ArrayList<>();
        collection.add("java");
        collection.add("c#");
        collection.add("python");
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("android");
        collection1.add("c++");
        collection1.add("java");
        
        // addAll():添加所有元素
        collection.addAll(collection1);
        System.out.println(collection);// [java, c#, python, android, c++, java]
        System.out.println(collection1);// [android, c++, java]
    
        // containsALl():是否包含全部的元素
        System.out.println(collection.containsAll(collection1));// true
        collection.remove("c++");
        System.out.println(collection.containsAll(collection1));// false
    
        // retainAll():取交集
        System.out.println(collection);// [java, c#, python, android, java]
        System.out.println(collection1);// [android, c++, java]
        collection.retainAll(collection1);
        System.out.println(collection);// [java, android, java]
        // removeAll():去除交集
        collection.removeAll(collection1);
        System.out.println(collection);// []
    }
}
