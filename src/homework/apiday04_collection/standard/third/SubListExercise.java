package homework.apiday04_collection.standard.third;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description subList()方法的练习
 * @ClassName SubListExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 21:16
 * @Version 1.0
 */
public class SubListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 3; i < 13; i++) {
            list.add(i * i + 1);
        }
        System.out.println(list);// [10, 17, 26, 37, 50, 65, 82, 101, 122, 145]

        List<Integer> subList = list.subList(3, 7);
        System.out.println("list:" + list);// list:[10, 17, 26, 37, 50, 65, 82, 101, 122, 145]
        System.out.println("subList:" + subList);// subList:[37, 50, 65, 82]

        subList.add(9527);
        subList.set(3, 10086);
        System.out.println("list:" + list);// list:[10, 17, 26, 37, 50, 65, 10086, 9527, 101, 122, 145]
        System.out.println("subList:" + subList);// subList:[37, 50, 65, 10086, 9527]

        list.set(5, 20458);
        System.out.println("list:" + list);// list:[10, 17, 26, 37, 50, 20458, 10086, 9527, 101, 122, 145]
        System.out.println("subList:" + subList);// subList:[37, 50, 20458, 10086, 9527]

        list.remove(1);
        list.add(8848);
        System.out.println("list:" + list);// list:[10, 26, 37, 50, 20458, 10086, 9527, 101, 122, 145, 8848]
        // System.out.println("subList:" + subList);// 编译失败
    }
}
