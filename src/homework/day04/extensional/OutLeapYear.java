package homework.day04.extensional;

/**
 * @ClassName OutLeapYear
 * @Description 输出1900到2023年之间所有的闰年(每够10个年份，换一行)
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/20 19:22
 * @Version 1.0
 */
public class OutLeapYear {
    public static void main(String[] args) {
        // 输出1900到2023年之间所有的闰年(每够10个年份，换一行)
        int count = 0;
        for (int i = 1900; i <= 2023; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                count++;
                if (count != 10) {
                    System.out.print(i + " ");
                } else {
                    System.out.println(i);
                    count = 0;
                }
            }
        }
    }
}
