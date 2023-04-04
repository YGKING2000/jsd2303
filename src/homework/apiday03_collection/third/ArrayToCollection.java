package homework.apiday03_collection.third;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description 数组转换集合
 * @ClassName ArrayToCollection
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:28
 * @Version 1.0
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        String[] strings = {"one", "three", "seven", "five", "four", "nine", "two", "ten", "six", "eight"};
        System.out.println(Arrays.toString(strings));// [one, three, seven, five, four, nine, two, ten, six, eight]
        Collection<String> collection = Arrays.asList(strings);
        System.out.println(collection);// [one, three, seven, five, four, nine, two, ten, six, eight]

        strings[3] += " hundred";
        System.out.println(Arrays.toString(strings));// [one, three, seven, five hundred, four, nine, two, ten, six, eight]
        System.out.println(collection);// [one, three, seven, five hundred, four, nine, two, ten, six, eight]

        // collection.add("eleven");
        // collection.remove("six");
        // collection.removeAll(collection);
    }
}
