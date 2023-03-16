package preview;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @ClassName Demo02
 * @Description 随机生成椭圆的位置
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 19:28
 * @Version 1.0
 */
public class Demo02 extends App {
    // 随机生成圆的直径
    int d = (int) (Math.random() * 80) + 20;
    // 随机生成圆的x坐标
    int y = (int) (Math.random() * (600 - d));
    // 随机生成圆的y坐标
    int x = (int) (Math.random() * (800 - d));
    // 随机生成圆的rgb值
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    Color color = new Color(r, g, b);
    
    public void painting(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y, d, d);
    }
    public static void main(String[] args) {
        // Demo02[] arr = new Demo02[20];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = new Demo02();
        //     arr[i].start();
        // }
        Demo02 demo02 = new Demo02();
        demo02.start();
    }
}
