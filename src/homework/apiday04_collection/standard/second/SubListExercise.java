package homework.apiday04_collection.standard.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description subList方法的练习
 * @ClassName SubListExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 20:01
 * @Version 1.0
 */
public class SubListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 3; i < 13; i++) {
            list.add(i * i + i);
        }
        System.out.println(list);// [12, 20, 30, 42, 56, 72, 90, 110, 132, 156]

        List<Integer> subList = list.subList(3, 8);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 56, 72, 90, 110, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 56, 72, 90, 110]

        subList.set(2, 1000);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 56, 1000, 90, 110, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 56, 1000, 90, 110]

        subList.add(10086);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 56, 1000, 90, 110, 10086, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 56, 1000, 90, 110, 10086]

        list.set(6, 9527);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 56, 1000, 9527, 110, 10086, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 56, 1000, 9527, 110, 10086]

        list.add(8848);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 56, 1000, 9527, 110, 10086, 132, 156, 8848]
        // 编译失败，报并发修改异常ConcurrentModificationException
        // System.out.println("subList: " + subList);// subList: [42, 56, 1000, 9527, 110, 10086]
    }
}
