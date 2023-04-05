package homework.apiday04_collection.standard.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 字符串集合排序
 * @ClassName SortStringExercise
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 13:43
 * @Version 1.0
 */
public class SortStringExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kobe");
        list.add("curry");
        list.add("Simons");
        list.add("James");
        list.add("");
        list.add("harden");
        list.add("jordan");
        System.out.println(list);// [Kobe, curry, Simons, James, , harden, jordan]

        // 字符串默认按照首字符Unicode值大小升序排列，若值相同则依次下一个字符
        Collections.sort(list);
        System.out.println(list);// [, James, Kobe, Simons, curry, harden, jordan]
        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
        System.out.println(list);// [Simons, harden, jordan, James, curry, Kobe, ]

        List<String> strings = new ArrayList<>();
        strings.add("上海");
        strings.add("成都");
        strings.add("北京");
        strings.add("佳木斯");
        strings.add("广州");
        strings.add("石家庄");
        strings.add("深圳");
        System.out.println(strings);// [上海, 成都, 北京, 佳木斯, 广州, 石家庄, 深圳]
        Collections.sort(strings);
        System.out.println(strings);// [上海, 佳木斯, 北京, 广州, 成都, 深圳, 石家庄]

        Collections.sort(strings, (o1, o2) -> o1.length() - o2.length());
        System.out.println(strings);// [上海, 北京, 广州, 成都, 深圳, 佳木斯, 石家庄]
    }
}
