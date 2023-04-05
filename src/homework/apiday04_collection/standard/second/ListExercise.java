package homework.apiday04_collection.standard.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 集合List常用方法的练习
 * @ClassName ListExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 14:30
 * @Version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 3; i < 13; i++) {
            list.add(i * i + 9);
        }
        System.out.println(list);// [18, 25, 34, 45, 58, 73, 90, 109, 130, 153]

        // 1.for循环遍历List集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        // 18 25 34 45 58 73 90 109 130 153
        System.out.println();
        // 2.增强for循环遍历List集合
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        // 18 25 34 45 58 73 90 109 130 153
        System.out.println();
        // 3.迭代器遍历List集合
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // 18 25 34 45 58 73 90 109 130 153
        System.out.println();

        System.out.println(list);// [18, 25, 34, 45, 58, 73, 90, 109, 130, 153]
        list.add(3, 9527);
        System.out.println(list);// [18, 25, 34, 9527, 45, 58, 73, 90, 109, 130, 153]

        list.remove(8);
        list.remove(5);
        System.out.println(list);// [18, 25, 34, 9527, 45, 73, 90, 130, 153]
    }
}
