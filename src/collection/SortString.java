package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description 字符串集合排序
 * @ClassName SortString
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/04 14:05
 * @Version 1.0
 */
public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lebron");
        list.add("Kobe");
        list.add("curry");
        list.add("Jordan");
        list.add("simons");
        list.add("John");
        list.add("harden");

        // 对字符串(包括中文和英文)排序按照首字母的Unicode值升序排列，首字母的Unicode值相同则依次比较下去
        System.out.println("排序前：" + list);// 排序前：[Lebron, Kobe, curry, Jordan, simons, John, harden]
        Collections.sort(list);
        System.out.println("排序后：" + list);// 排序后：[John, Jordan, Kobe, Lebron, curry, harden, simons]

        List<String> list1 = new ArrayList<>();
        list1.add("西蒙斯");
        list1.add("哈登");
        list1.add("乔丹");
        list1.add("库里");
        list1.add("杜兰特");
        list1.add("科比");
        list1.add("勒布朗");
        System.out.println("排序前：" + list1);// 排序前：[哈登, 乔丹, 库里, 杜兰特, 科比, 勒布朗]
        // Collections.sort(list1);
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // return o1.length() - o2.length();// 升序
                return o2.length() - o1.length();// 降序
            }
        });
        System.out.println("排序后：" + list1);// 排序后：[乔丹, 勒布朗, 哈登, 库里, 杜兰特, 科比]


    }
}
