package homework.apiday04_collection.standard.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description 数值型集合的排序
 * @ClassName SortIntegerExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 20:43
 * @Version 1.0
 */
public class SortIntegerExercise {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);// [7, 58, 59, 23, 3, 21, 8, 60, 69, 82]

        list.sort((o1, o2) -> o1 - o2);
        System.out.println(list);// [3, 7, 8, 21, 23, 58, 59, 60, 69, 82]

        list.sort((o1, o2) -> o2 - o1);
        System.out.println(list);// [82, 69, 60, 59, 58, 23, 21, 8, 7, 3]
    }
}
