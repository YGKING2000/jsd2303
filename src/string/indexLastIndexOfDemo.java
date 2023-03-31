package string;

/**
 * @Description 查找指定字符串在当前字符串中首次或者最后一次出现的索引，没有找到的话将-1作为返回值返回
 * @ClassName indexLastIndexOfDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 15:20
 * @Version 1.0
 */
public class indexLastIndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in Java";
        System.out.println(str.indexOf("in"));// in
        System.out.println(str.indexOf("in", 2));// 2
        System.out.println(str.indexOf("in", 3));// 5
        System.out.println(str.indexOf("in", 6));// 9
        System.out.println("--------------");
        System.out.println(str.lastIndexOf("in"));// 9
        System.out.println(str.lastIndexOf("in", 0));// -1
        System.out.println(str.lastIndexOf("in", 1));// -1
        System.out.println(str.lastIndexOf("in", 2));// 2
        System.out.println(str.lastIndexOf("in", 3));// 2
        System.out.println(str.lastIndexOf("in", 5));// 5
        System.out.println(str.lastIndexOf("in", 15));// 9
    }
}
