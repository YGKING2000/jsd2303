package homework.apiday04_collection.standard.third;

import java.util.*;

/**
 * @Description 集合Set的练习
 * @ClassName SetExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 21:58
 * @Version 1.0
 */
public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(10));
        }
        System.out.println(set);// [0, 1, 2, 3, 4, 5, 8, 9]

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);// [6, 5, 6, 4, 9, 5, 8, 7, 1, 1]

        Set<Integer> integers = new HashSet<>();
        integers.addAll(list);
        System.out.println(integers);// [1, 4, 5, 6, 7, 8, 9]
    }
}
