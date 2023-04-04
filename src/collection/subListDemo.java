package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description subList()方法的演示
 * @ClassName subListDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 10:45
 * @Version 1.0
 */
public class subListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10 + 9);
        }
        System.out.println(list);// [9, 19, 29, 39, 49, 59, 69, 79, 89, 99]
        List<Integer> subList = list.subList(3, 8);
        System.out.println(subList);// [39, 49, 59, 69, 79]

        // 对子集进行任何操作都会对原集合造成相同的影响
        // 将子集中的数据扩大10倍
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(subList);// [390, 490, 590, 690, 790]
        System.out.println(list);// [9, 19, 29, 390, 490, 590, 690, 790, 89, 99]

        // 当对原集合中的原集合与子集的交集的元素进行操作时，也会对子集有相同的影响
        // 将原集合下标为3的元素修改为1000
        list.set(3, 1000);
        System.out.println(subList);// [1000, 490, 590, 690, 790]
        System.out.println(list);// [9, 19, 29, 1000, 490, 590, 690, 790, 89, 99]

        // 原集合长度修改之后，子集将不能再进行任何操作，操作则发生异常，但是可以重新获取子集
        list.remove(0);
        // list.add(0, 0);
        System.out.println(list);// [19, 29, 1000, 490, 590, 690, 790, 89, 99]
        // System.out.println(subList);// 编译失败，报并发修改异常ConcurrentModificationException
    }
}
