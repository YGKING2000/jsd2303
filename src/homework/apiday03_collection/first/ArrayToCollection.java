package homework.apiday03_collection.first;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description 数组转换集合
 * @ClassName ArrayToCollection
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 21:08
 * @Version 1.0
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        /* 注意事项：
         * 数组转换后的集合不能增加/删除元素的操作
         */
        String[] data = {"one", "two", "three", "four", "five"};
        Collection<String> collection = Arrays.asList(data);
        System.out.println("collection:" + collection);// collection:[one, two, three, four, five]
        System.out.println("data:" + Arrays.toString(data));// data:[one, two, three, four, five]
        data[0] = "seven";
        System.out.println("collection:" + collection);// collection:[seven, two, three, four, five]
        System.out.println("data:" + Arrays.toString(data));// data:[seven, two, three, four, five]
        // collection.add("six");// 编译失败，报不支持操作异常UnsupportedOperatorException
        // collection.remove("one");// 编译失败，报不支持操作异常UnsupportedOperatorException
        // collection.clear();// 编译失败，报不支持操作异常UnsupportedOperatorException
    }
}
