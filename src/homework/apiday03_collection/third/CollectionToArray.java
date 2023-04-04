package homework.apiday03_collection.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Description 集合转换数组
 * @ClassName CollectionToArray
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:25
 * @Version 1.0
 */
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add((int) (Math.random() * 100) + 1);
        }
        System.out.println(collection);// [80, 64, 63, 7, 48, 6, 73, 21, 28, 43]

        Integer[] integers = collection.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));// [80, 64, 63, 7, 48, 6, 73, 21, 28, 43]
    }
}
