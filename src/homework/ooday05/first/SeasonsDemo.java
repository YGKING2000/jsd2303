package homework.ooday05.first;

/**
 * @Description 季节枚举类的测试类
 * @ClassName SeasonsDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:03
 * @Version 1.0
 */
public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons) {
            System.out.print(season + ": ");
            System.out.println(season.getSeasonName() + season.getSeasonDesc());
        }
        // SPRING: 春天暖和
        // SUMMER: 夏天炎热
        // AUTUMN: 秋天凉爽
        // WINTER: 冬天寒冷
    }
}
