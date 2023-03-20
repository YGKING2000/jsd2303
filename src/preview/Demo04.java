package preview;

/**
 * @ClassName TransferTest2
 * @Description
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/18 14:12
 * @Version 1.0
 */
class DataSwap {
    public int a;
    public int b;
}
public class Demo04 {
    public static void swap(DataSwap ds) {
        int temp = ds.a;
        ds.a = ds.b;
        ds.b = temp;
        System.out.println("swap方法里，a Field的值是" + ds.a + ";b Field的值是" + ds.b);
    }
    public static void main(String[] args) {
        DataSwap ds = new DataSwap();
        ds.a = 5;
        ds.b = 10;
        swap(ds);
        System.out.println("交换结束后，a Field的值是" + ds.a + ";b Field的值是" + ds.b);
    }
}
