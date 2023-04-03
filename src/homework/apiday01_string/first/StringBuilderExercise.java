package homework.apiday01_string.first;

/**
 * @Description StringBuilder类的对象创建以及常用方法的练习
 * @ClassName StringBuilderExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:02
 * @Version 1.0
 */
public class StringBuilderExercise {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("123");
        System.out.println(str);// 123
        
        String str1 = "abc";
        StringBuilder str2 = new StringBuilder(str1);
        System.out.println(str2);// abc
        String str3 = str2.toString();
        System.out.println(str3);// abc
        
        StringBuilder stringBuilder = new StringBuilder("好好学习，天天向上!");
        System.out.println(stringBuilder);// 好好学习，天天向上!
        stringBuilder.append("加油，奥力给!");
        System.out.println(stringBuilder);// 好好学习，天天向上!加油，奥力给!
        
        stringBuilder.replace(10, 17, "为了工作！");
        System.out.println(stringBuilder);// 好好学习，天天向上!为了工作！
        
        stringBuilder.replace(5, 10, "");
        System.out.println(stringBuilder);// 好好学习，为了工作！
        
        stringBuilder.insert(5, "踏马关公身上纹，掌声送给社会人。");
        System.out.println(stringBuilder);// 好好学习，踏马关公身上纹，掌声送给社会人。为了工作！
        
        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);// 踏马关公身上纹，掌声送给社会人。为了工作！
    }
}
