package homework.apiday04_collection.standard.first;

import java.util.*;

/**
 * @Description Set集合以及集合去重的练习
 * @ClassName SetExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 14:08
 * @Version 1.0
 */
public class SetExercise {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        System.out.println(set);// [four, one, two, three, five]
        set.add("one");
        System.out.println(set);// [four, one, two, three, five]

        // 利用for循环和random随机函数给Set集合赋值时，控制台打印输出的集合是有序且是升序的
        Set<Integer> set1 = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            set1.add(random.nextInt(10) + 1);
        }
        System.out.println(set1);// [1, 5, 6, 7, 8, 10]

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(7) + 1);
        }
        System.out.println(list);// [5, 3, 1, 3, 3, 4, 7, 1, 2, 4]
        Set<Integer> integers = new HashSet<>();
        integers.addAll(list);
        System.out.println(integers);// [1, 2, 3, 4, 5, 7]
    }
}
