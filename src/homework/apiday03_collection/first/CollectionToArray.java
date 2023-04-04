package homework.apiday03_collection.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Description 集合转换数组
 * @ClassName CollectionToArray
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 21:02
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
        System.out.println(collection);// [one, two, three, four, five]

        String[] data = collection.toArray(new String[0]);
        for (String s : data) {
            System.out.print(s + " ");// one two three four five
        }
        System.out.println("\n" + collection);// [one, two, three, four, five]

        data[0] = "six";
        System.out.println(Arrays.toString(data));// [six, two, three, four, five]
        System.out.println(collection);// [one, two, three, four, five]
    }
}
