package homework.apiday04_collection.standard.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 字符串集合排列
 * @ClassName SortString
 * @Author YGKING e-mail:hrd18960706057@163.com
 * @Date 2023/04/05 20:09
 * @Version 1.0
 */
public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("James");
        list.add("Harden");
        list.add("");
        list.add("String");
        list.add("Durant");
        list.add("john");
        list.add("curry");
        System.out.println(list);// [James, Harden, , String, Durant, john, curry]

        Collections.sort(list);
        System.out.println(list);// [, Durant, Harden, James, String, curry, john]

        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());
        System.out.println(list);// [, john, James, curry, Harden, String, Durant]

        List<String> cities = new ArrayList<>();
        cities.add("成都");
        cities.add("深圳");
        cities.add("北京");
        cities.add("南京");
        cities.add("上海");
        cities.add("重庆");
        cities.add("广州");
        System.out.println(cities);// [成都, 深圳, 北京, 南京, 上海, 重庆, 广州]

        Collections.sort(cities);
        System.out.println(cities);// [上海, 北京, 南京, 广州, 成都, 深圳, 重庆]
    }
}
