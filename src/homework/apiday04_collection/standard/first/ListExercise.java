package homework.apiday04_collection.standard.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description List常见方法的练习
 * @ClassName ListExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 13:12
 * @Version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        // 1.增强for循环遍历List集合
        for (String s : list) {
            System.out.print(s + " ");
        }
        // one two three four five
        System.out.println();

        // 2.for循环遍历List集合
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        // five four three two one
        System.out.println();

        // 3.迭代器遍历List集合
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // one two three four five
        System.out.println();

        System.out.println(list);// [one, two, three, four, five]
        list.set(4, "eight");
        System.out.println(list);// [one, two, three, four, eight]
        list.set(1, "100");
        System.out.println(list);// [one, 100, three, four, eight]

        list.add(1, "9527");
        System.out.println(list);// [one, 9527, 100, three, four, eight]
        list.remove(4);
        System.out.println(list);// [one, 9527, 100, three, eight]

        list.remove("three");
        System.out.println(list);// [one, 9527, 100, eight]
    }
}
