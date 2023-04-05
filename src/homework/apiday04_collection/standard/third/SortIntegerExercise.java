package homework.apiday04_collection.standard.third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Description 数值型集合的排序
 * @ClassName SortIntegerExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 22:11
 * @Version 1.0
 */
public class SortIntegerExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(10000));
        }
        System.out.println(list);// [2126, 162, 6059, 614, 3534, 5998, 7673, 943, 6530, 4721]

        Collections.sort(list);
        System.out.println(list);// [162, 614, 943, 2126, 3534, 4721, 5998, 6059, 6530, 7673]

        list.sort((o1, o2) -> o2 - o1);
        System.out.println(list);// [7673, 6530, 6059, 5998, 4721, 3534, 2126, 943, 614, 162]
    }
}
