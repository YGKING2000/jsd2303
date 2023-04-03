package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description 增强for循环
 * @ClassName NewForDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 15:29
 * @Version 1.0
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] data = {"one", "two", "three", "four", "five"};
        for (String str : data) {
            System.out.print(str + " ");
        }
        
        System.out.println();
        
        Collection collection = new ArrayList();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        for (Object obj : collection) {
            String str = (String) obj;
            System.out.print(str + " ");
        }
    }
    
}
