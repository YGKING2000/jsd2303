package homework.apiday03_collection.first;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 集合对元素操作的方法
 * @ClassName CollectionBasicMethod
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 08:31
 * @Version 1.0
 */
public class CollectionBasicMethod {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        // add()方法的练习
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        // size()方法的练习
        System.out.println(collection.size());// 5
        System.out.println(collection);// [one, two, three, four, five]
    
        collection.add("six");
        // size()方法的练习
        System.out.println(collection.size());// 6
        System.out.println(collection);// [one, two, three, four, five, six]
        collection.add("seven");
        System.out.println(collection);// [one, two, three, four, five, six, seven]
    
        // isEmpty()方法的练习
        System.out.println(collection.isEmpty());// false
        System.out.println(collection.size());// 7
    
        // contains()方法的练习
        System.out.println(collection.contains("eight"));// false
        System.out.println(collection.contains("nine"));// false
        System.out.println(collection.contains("five"));// true
    
        // remove()方法的练习
        System.out.println(collection);// [one, two, three, four, five, six, seven]
        System.out.println(collection.remove("byte"));;// false
        System.out.println(collection.remove("one"));// true
        System.out.println(collection);// [two, three, four, five, six, seven]
    
        // clear()方法的练习
        System.out.println(collection.isEmpty());// false
        collection.clear();// clear方法无返回值，无法直接打印
        System.out.println(collection.isEmpty());// true
    }
}
