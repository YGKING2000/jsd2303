package homework.string.third;

/**
 * @Description StringBuilder类的对象创建以及常用方法的练习
 * @ClassName StringBuilderExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 21:22
 * @Version 1.0
 */
public class StringBuilderExercise {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        StringBuilder s1 = new StringBuilder("CD");
        System.out.println(s);//
        System.out.println(s1);// CD
        
        String s2 = "abc";
        // String和StringBuilder类型的转换
        StringBuilder s3 = new StringBuilder(s2);
        System.out.println(s3);// abc
        String s4 = s3.toString();
        System.out.println(s4);// abc
        
        StringBuilder stringBuilder = new StringBuilder("好好学习，天天向上!");
        System.out.println(stringBuilder);// 好好学习，天天向上!
        stringBuilder.append("哈哈");
        System.out.println(stringBuilder);// 好好学习，天天向上!哈哈
    
        stringBuilder.replace(10, stringBuilder.length(), "");
        System.out.println(stringBuilder);// 好好学习，天天向上!
        
        stringBuilder.insert(5, "生死在天，富贵由命，如今社会就是看谁钱多看谁♂硬，你的寒王，没毛病。");
        System.out.println(stringBuilder);// 好好学习，生死在天，富贵由命，如今社会就是看谁钱多看谁♂硬，你的寒王，没毛病。天天向上!
        
        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);// 生死在天，富贵由命，如今社会就是看谁钱多看谁♂硬，你的寒王，没毛病。天天向上!
    }
}
