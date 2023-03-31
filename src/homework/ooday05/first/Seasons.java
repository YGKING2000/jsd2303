package homework.ooday05.first;

/**
 * @Description 季节枚举类
 * @EnumName Seasons
 * @Author YGKING  E-mail:hrd18960706057@163.com
 * @Date 2023/03/30 20:01
 * @Version 1.0
 */
public enum Seasons {
    SPRING("春天", "暖和"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");
    String seasonName;
    String seasonDesc;
    
    Seasons(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    
    public String getSeasonName() {
        return seasonName;
    }
    
    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }
    
    public String getSeasonDesc() {
        return seasonDesc;
    }
    
    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }
}
