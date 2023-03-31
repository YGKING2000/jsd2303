package ooday05;

/**
 * @Description 枚举测试类
 * @ClassName EnumTest
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 17:31
 * @Version 1.0
 */
public class EnumTest {
    public static void main(String[] args) {
        /*Seasons s = Seasons.AUTUMN;
        System.out.println(s);// AUTUMN
        switch (s) {
            case SPRING:
                System.out.println("春天到了...");
                break;
            case SUMMER:
                System.out.println("夏天到了...");
                break;
            case AUTUMN:
                System.out.println("秋天到了...");// 打印输出: 秋天到了...
                break;
            case WINTER:
                System.out.println("冬天到了...");
                break;
        }
        System.out.println("----------");
        
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons) {
            System.out.println(season);
        }*/
        
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons) {
            System.out.println(season);
            System.out.print(season.getSeasonName());
            System.out.println(season.getSeasonDesc());
        }
    }
}
