package homework.apiday03_collection.second;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description 数组转换集合
 * @ClassName ArrayToCollection
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:09
 * @Version 1.0
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        String[] data = {"one", "three", "six", "four", "five", "two"};
        Collection<String> collection = Arrays.asList(data);
        System.out.println(collection);// [one, three, six, four, five, two]

        data[3] = "1000";
        System.out.println(Arrays.toString(data));// [one, three, six, 1000, five, two]
        System.out.println(collection);// [one, three, six, 1000, five, two]

        // collection.add("ten");
        // collection.remove("one");
    }
}
