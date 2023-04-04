package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Description List集合的演示
 * @ClassName ListDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 09:13
 * @Version 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collection<String> collection = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");
        System.out.println("list: " + list);// list: [one, two, three, four, five, one]
    
        System.out.println(list.set(5, "six"));// one
        System.out.println("list: " + list);// list: [one, two, three, four, five, six]
    
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        // one, two, three, four, five, six
        System.out.println();
        for (String item : list) {
            System.out.print(item + " ");
        }
        // one, two, three, four, five, six
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // one, two, three, four, five, six
    }
}
