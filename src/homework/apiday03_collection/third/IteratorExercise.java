package homework.apiday03_collection.third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @Description 遍历集合Collection的两种方法的练习
 * @ClassName IteratorExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 22:18
 * @Version 1.0
 */
public class IteratorExercise {
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
        }
        System.out.println(integers);// [695, 294, 104, 814, 132, 178, 960, 760, 559, 882]
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // 695 294 104 814 132 178 960 760 559 882
        System.out.println();
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        // 695 294 104 814 132 178 960 760 559 882
    }
}
