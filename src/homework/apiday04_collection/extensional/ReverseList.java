package homework.apiday04_collection.extensional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description
 * @ClassName ReverseList
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 21:03
 * @Version 1.0
 */
public class ReverseList {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000));
        }
        System.out.println(list);// [652, 404, 791, 356, 151, 442, 839, 886, 969, 693]

        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        System.out.println(list);// [693, 969, 886, 839, 442, 151, 356, 791, 404, 652]
    }
}
