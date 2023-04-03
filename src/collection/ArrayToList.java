package collection;

import java.util.Arrays;
import java.util.List;

/**
 *                  转换
 * @Description 数组====>集合
 * @ClassName ArrayToList
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 17:12
 * @Version 1.0
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] data = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(data));// [one, two, three, four, five]
    
        // asList()方法返回的List集合中的元素存储的是对象引用地址
        List<String> list = Arrays.asList(data);
        System.out.println(list);// [one, two, three, four, five]
        
        // 对数组中的元素修改之后，集合中的数据也会被修改
        data[0] = "six";// [six, two, three, four, five]
        System.out.println(Arrays.toString(data));
        System.out.println(list);// [six, two, three, four, five]
    
        // 对集合中的元素修改之后，数组中的数据也会被修改
        list.set(3, "seven");
        System.out.println(Arrays.toString(data));// [six, two, three, seven, five]
        System.out.println(list);// [six, two, three, seven, five]
        
        // 给集合添加或删除元素相当于给数组添加或删除元素
        // 而数组的长度固定，不会自动扩容、缩容的，因此发生不支持操作异常
        // list.add("!!!");// 编译失败，报不支持操作异常(UnsupportedOperationException)
    }
}
