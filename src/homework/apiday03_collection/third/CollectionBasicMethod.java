package homework.apiday03_collection.third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @Description 集合操作元素的方法的练习
 * @ClassName CollectionBasicMethod
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:35
 * @Version 1.0
 */
public class CollectionBasicMethod {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            collection.add(random.nextInt(100));
        }
        System.out.println(collection);// [1, 24, 46, 28, 44, 84, 35, 48, 52, 47, 59]

        System.out.println(collection.isEmpty());// false
        System.out.println(collection.size());// 11
        collection.add(3333);
        collection.add(7777);
        System.out.println(collection.size());// 12
        System.out.println(collection);// [1, 24, 46, 28, 44, 84, 35, 48, 52, 47, 59, 3333, 7777]

        System.out.println(collection.contains(99));

        collection.remove(3333);
        System.out.println(collection);// [1, 24, 46, 28, 44, 84, 35, 48, 52, 47, 59, 7777]

        collection.clear();
        System.out.println(collection.size());// 0
        System.out.println(collection.isEmpty());// false
    }
}
