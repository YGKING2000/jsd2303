package string;

/**
 * @Description 截取指定起始位置和结束位置之间的字符串
 * @ClassName SubstringDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 15:49
 * @Version 1.0
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String url = "www.baidu.cn";
        System.out.println(url.substring(url.indexOf(".") + 1, url.lastIndexOf(".")));
    }
    
    public static String aaa(String url, int start, int end) {
        return url.substring(start, end);
    }
}
