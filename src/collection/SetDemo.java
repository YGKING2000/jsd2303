package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description Set集合的演示
 * @ClassName SetDemo
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 16:59
 * @Version 1.0
 */
public class SetDemo {
    public static void main(String[] args) {
        /*HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        System.out.println(set);// [four, one, two, three, five]
        set.add("three");
        System.out.println(set);// [four, one, two, three, five]*/

        // 集合去重
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("three");
        list.add("two");
        list.add("four");
        list.add("five");
        list.add("two");
        list.add("four");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);// [four, one, three, two, five]
    }
}
