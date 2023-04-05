package homework.apiday04_collection.standard.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 数值型集合排序
 * @ClassName SortIntegerExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 13:53
 * @Version 1.0
 */
public class SortIntegerExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 1001));
        }
        System.out.println(list);// [378, 256, 466, 285, 166, 171, 756, 379, 365, 130]

        Collections.sort(list, (o1, o2) -> o1 - o2);
        System.out.println(list);// [130, 166, 171, 256, 285, 365, 378, 379, 466, 756]
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);// [756, 466, 379, 378, 365, 285, 256, 171, 166, 130]
    }
}
