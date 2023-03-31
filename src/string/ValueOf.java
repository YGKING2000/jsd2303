package string;

/**
 * @Description 将其他数据类型转换成字符串型
 * @ClassName ValueOf
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 16:21
 * @Version 1.0
 */
public class ValueOf {
    public static void main(String[] args) {
        double b = 3.1415926;
        String str = String.valueOf(b);// 推荐使用
        String str1 = b + "";// 不推荐使用，效率低
    }
}
