package homework.apiday04_collection.standard.third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Description 字符串集合的排序
 * @ClassName SortString
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 22:03
 * @Version 1.0
 */
public class SortString {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(random.nextInt(100)));
        }
        System.out.println(list);// [4, 47, 22, 89, 39, 67, 63, 81, 25, 2]

        Collections.sort(list);
        System.out.println(list);// [2, 22, 25, 39, 4, 47, 63, 67, 81, 89]

        List<String> strings = new ArrayList<>();
        strings.add("佳木斯");
        strings.add("似懂非懂");
        strings.add("皇贵妃");
        strings.add("韩国的烤豆腐");
        strings.add("预算单");
        strings.add("一定会产生");
        System.out.println(strings);// [佳木斯, 似懂非懂, 皇贵妃, 韩国的烤豆腐, 预算单, 一定会产生]

        Collections.sort(strings);
        System.out.println(strings);// [一定会产生, 似懂非懂, 佳木斯, 皇贵妃, 韩国的烤豆腐, 预算单]

        Collections.sort(strings, (o1, o2) -> o2.length() - o1.length());
        System.out.println(strings);// [韩国的烤豆腐, 一定会产生, 似懂非懂, 佳木斯, 皇贵妃, 预算单]
    }
}
