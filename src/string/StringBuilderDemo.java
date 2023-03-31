package string;

/**
 * @Description
 * @ClassName StringBuilderDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 16:57
 * @Version 1.0
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder的创建方式
        StringBuilder stringBuilder = new StringBuilder();// 空字符串
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        // StringBuilder stringBuilder2 = "abc";// 编译失败，类型不匹配
        
        // String和StringBuilder类型的转换
        String str = "abc";
        // 1.String ==> StringBuilder
        StringBuilder stringBuilder2 = new StringBuilder(str);
        // 2.StringBuilder ==> String
        String str1 = stringBuilder2.toString();
        
        StringBuilder stringBuilder3 = new StringBuilder("好好学习Java");
        System.out.println(stringBuilder3);// 好好学习Java
        stringBuilder3.append("，为了找到好工作");
        System.out.println(stringBuilder3);// 好好学习Java，为了找到好工作
        
        stringBuilder3.replace(8, 17, "，为了改变世界");
        System.out.println(stringBuilder3);// 好好学习Java，为了改变世界
        stringBuilder3.replace(0, 2, "");
        System.out.println(stringBuilder3);// 学习Java，为了改变世界
        
        stringBuilder3.delete(0, 7);
        System.out.println(stringBuilder3);// 为了改变世界
        
        stringBuilder3.insert(0, "活着就是");
        System.out.println(stringBuilder3);// 活着就是为了改变世界
    }
}
