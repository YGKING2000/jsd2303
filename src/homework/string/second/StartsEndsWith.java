package homework.string.second;

/**
 * @Description startsWith()和endsWith()方法的练习
 * @ClassName StartsEndsWith
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/31 20:20
 * @Version 1.0
 */
public class StartsEndsWith {
    public static void main(String[] args) {
        String str = "You don't tell me what direction what you think I should take!";
        System.out.println(str.startsWith("You"));// true
        System.out.println(str.startsWith("Yo"));// true
        System.out.println(str.startsWith("you"));// false
        System.out.println(str.endsWith("!"));// true
        System.out.println(str.endsWith("ke!"));// true
        System.out.println(str.endsWith("ek!"));// false
    }
}
