package homework.ooday05.second;

/**
 * @Description 季节枚举类的练习
 * @ClassName SeasonsDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 16:39
 * @Version 1.0
 */
public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons) {
            System.out.print(season + ": ");
            System.out.print(season.getSeasonName());
            System.out.println(season.getSeasonDesc());
        }
        // SPRING: 春天暖和
        // SUMMER: 夏天炎热
        // AUTUMN: 秋天凉爽
        // WINTER: 冬天寒冷
    }
}
