package homework.apiday04_collection.standard.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description subList()方法的练习
 * @ClassName SubListExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 13:25
 * @Version 1.0
 */
public class SubListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 3; i < 13; i++) {
            list.add(i * i + i);
        }

        // subList(int start, int end)方法截取的子集含头不含尾
        List<Integer> subList = list.subList(3, 7);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 56, 72, 90, 110, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 56, 72, 90]

        // 可以对子集元素进行修改操作
        subList.set(1, 1000);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 1000, 72, 90, 110, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 1000, 72, 90]

        // 可以对原集合元素进行修改操作
        list.set(6, 9527);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 1000, 72, 9527, 110, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 1000, 72, 9527]

        // 可以对子集元素进行添加和删除操作
        subList.add(666);
        subList.remove(2);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 1000, 9527, 666, 110, 132, 156]
        System.out.println("subList: " + subList);// subList: [42, 1000, 9527, 666]

        // 对原集合进行删除和添加操作后，不能对子集进行任何操作，打印输出也不行
        // list.remove(0);
        // System.out.println("list: " + list);// list: [20, 30, 42, 1000, 9527, 666, 110, 132, 156]
        list.add(4, 20458);
        System.out.println("list: " + list);// list: [12, 20, 30, 42, 20458, 1000, 9527, 666, 110, 132, 156]
        // 编译失败，对原集合进行增加或者删除操作后，子集不能进行任何操作，打印输出也不行
        // System.out.println("subList: " + subList);
    }
}
