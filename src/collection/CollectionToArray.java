package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *                  转换
 * @Description 集合====>数组
 * @ClassName CollectionToArray
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 16:53
 * @Version 1.0
 */
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        System.out.println(collection);
        
        String[] data = collection.toArray(new String[0]);
        String[] data1 = collection.toArray(new String[collection.size()]);
        String[] data2 = collection.toArray(new String[collection.size() + 3]);
        System.out.println(Arrays.toString(data));// [one, two, three, four, five]
        System.out.println(Arrays.toString(data1));// [one, two, three, four, five]
        System.out.println(Arrays.toString(data2));// [one, two, three, four, five, null, null, null]
    }
}
