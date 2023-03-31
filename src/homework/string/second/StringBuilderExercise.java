package homework.string.second;

/**
 * @Description StringBuilder类的创建以及常用方法的练习
 * @ClassName StringBuilderExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:44
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
        
        stringBuilder.replace(10, stringBuilder.length(), "");
        System.out.println(stringBuilder);// 好好学习，天天向上!
        
        stringBuilder.insert(10, "你走你的路，他提他的裤，你有你的背景，我有我的故事，不是很硬，但你别碰！");
        System.out.println(stringBuilder);// 好好学习，天天向上!你走你的路，他提他的裤，你有你的背景，我有我的故事，不是很硬，但你别碰！
        
        stringBuilder.delete(10, stringBuilder.length());
        System.out.println(stringBuilder);// 好好学习，天天向上!
    }
}
