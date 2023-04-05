package homework.apiday04_collection.standard.third;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Description 集合List常用方法的练习
 * @ClassName ListExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 21:09
 * @Version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000));
        }
        System.out.println(list);// [301, 597, 23, 129, 488, 982, 609, 659, 808, 196]

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();// 301 597 23 129 488 982 609 659 808 196

        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();// 301 597 23 129 488 982 609 659 808 196

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();// 301 597 23 129 488 982 609 659 808 196

        list.set(7, 9527);
        System.out.println(list);// [301, 597, 23, 129, 488, 982, 609, 9527, 808, 196]

        list.add(2, 10086);
        System.out.println(list);// [301, 597, 10086, 23, 129, 488, 982, 609, 9527, 808, 196]

        list.remove(3);
        list.remove(9);
        System.out.println(list);// [301, 597, 10086, 129, 488, 982, 609, 9527, 808]
    }
}
