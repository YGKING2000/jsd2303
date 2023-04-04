package homework.apiday03_collection.second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @Description 遍历Collection集合的两种方式的练习
 * @ClassName NewForExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:03
 * @Version 1.0
 */
public class NewForExercise {
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(random.nextInt(100));
        }
        System.out.println(collection);// [37, 79, 13, 75, 90, 5, 44, 42, 72, 29]

        for (Integer item : collection) {
            System.out.print(item * 2 + " ");
        }
        // 74 158 26 150 180 10 88 84 144 58
        System.out.println();
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // 37 79 13 75 90 5 44 42 72 29
    }
}
