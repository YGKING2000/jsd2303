package homework.apiday03_collection.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description 遍历Collection集合的两种方式
 * @ClassName IteratorExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 20:46
 * @Version 1.0
 */
public class IteratorExercise {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("#");
        collection.add("two");
        collection.add("#");
        collection.add("three");
        collection.add("#");
        collection.add("four");
        collection.add("#");
        collection.add("five");

        // 1.迭代器遍历集合
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // one # two # three # four # five
        System.out.println();
        // 2.增强for循环遍历集合
        for (String item : collection) {
            System.out.print(item + " ");
        }
        // one # two # three # four # five
    }
}
