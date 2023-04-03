package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description 迭代器的演示
 * @ClassName IteratorDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 14:20
 * @Version 1.0
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);// [one, #, two, #, three, #, four, #, five]
        // 获取集合c的迭代器
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if ("#".equals(s)) {
                // c.remove(s);
                iterator.remove();
            }
        }
        System.out.println(c);// [one, two, three, four, five]
    }
}
