package homework.apiday02.extension;

import java.util.Arrays;

/**
 * @Description 定义字符串String path = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
 * @ClassName GetParams
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 21:24
 * @Version 1.0
 */
public class GetParams {
    public static void main(String[] args) {
        // 定义字符串String path = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
        // 要求得到并输出：参数名:name  参数值：zhangsan
        // 参数名:pwd    参数值: 123456
        // 参数名:nick   参数值: san
        // 参数名:age    参数值: 16
        
        String url = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
        String[] data = url.split("\\?");
        System.out.println(Arrays.toString(data));
        String[] data1 = data[1].split("&");
        System.out.println(Arrays.toString(data1));
        String[] keys = new String[data1.length];
        String[] values = new String[data1.length];
        for (int i = 0; i < data1.length; i++) {
            String[] data2 = data1[i].split("=");
            keys[i] = data2[0];
            values[i] = data2[1];
        }
        for (int i = 0; i < keys.length; i++) {
            System.out.println("参数名：" + keys[i] + "\t\t参数值：" + values[i]);
        }
    }
}
