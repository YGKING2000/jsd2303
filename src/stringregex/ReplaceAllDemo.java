package stringregex;

/**
 * @Description replaceAll()方法的演示
 * @ClassName ReplaceAllDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 11:04
 * @Version 1.0
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "sfc5gf1541s5df4s54g1wd5fs4";
        line = line.replaceAll("[0-9]+", "数字");
        System.out.println(line);// sfc数字gf数字s数字df数字s数字g数字wd数字fs数字
        String line2 = "sfc5gf1541s5df4s54g1wd5fs4";
        line2 = line2.replaceAll("[0-9]", "_");
        System.out.println(line2);
    }
}
