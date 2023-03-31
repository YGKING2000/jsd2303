package string;

/**
 * @Description String和StringBuilder的区别
 * @ClassName StringStringBuilder
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 16:37
 * @Version 1.0
 */
public class StringStringBuilderDemo {
    public static void main(String[] args) {
        // 字符串拼接效率太低，因为每次都需要在堆里新创建新的字符串对象
        // 所以String不适合频繁修改
        /*String str = "";
        for (int i = 0; i < 10000000; i++) {
            str += i;
        }
        System.out.println("循环已执行完毕...");*/
    
        // StringBuilder适合频繁修改
        StringBuilder stringBuilder = new StringBuilder("a");
        for (int i = 0; i < 10000000; i++) {
            stringBuilder.append(i);
        }
        System.out.println("循环执行结束...");
    }
}
