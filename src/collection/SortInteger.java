package collection;

import java.util.*;

/**
 * @Description 包装类集合排序
 * @ClassName SortInteger
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 11:44
 * @Version 1.0
 */
public class SortInteger {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("list排序前：" + list);

        // Collections.sort(): 集合排序
        Collections.sort(list);
        System.out.println("list排序后：" + list);

        // Collection.reverse(): 集合反转
        Collections.reverse(list);
        System.out.println("list反转后：" + list);
    }
}
