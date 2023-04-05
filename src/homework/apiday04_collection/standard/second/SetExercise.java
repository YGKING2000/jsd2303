package homework.apiday04_collection.standard.second;

import java.util.*;

/**
 * @Description Set集合的练习
 * @ClassName SetExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 20:57
 * @Version 1.0
 */
public class SetExercise {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(10));
        }
        System.out.println(set);// [0, 1, 3, 4, 5, 6, 7]

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);// [6, 8, 6, 5, 4, 7, 6, 0, 4, 9]

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list);
        System.out.println(set1);// [0, 4, 5, 6, 7, 8, 9]
    }
}
