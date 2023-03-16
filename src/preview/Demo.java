package preview;

import cn.tedu.util.App;

import java.awt.Graphics2D;
import java.awt.Color;

/**
 * @ClassName Demo
 * @Description 自定义绘图
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 16:17
 * @Version 1.0
 */
public class Demo extends App {
    public static void main(String[] args) {
        Demo demo = new Demo();
        // 启动GUI界面程序
        demo.start();
    }
    
    public void painting(Graphics2D g) {
        // 设置画笔的颜色
        g.setColor(new Color(0, 255, 255));
        // g：代表当前界面程序的画笔
        // 在GUI界面程序中添加一个字符串，'x'和'y'是其在界面中的坐标
        g.drawString("Hello, World!", 90, 20);
        // 在GUI界面程序中添加黑色的椭圆，'x'和'y'是其在界面中的坐标，'width'和'height'是椭圆的宽和高
        g.fillOval(30, 80, 360, 360);
    }
}
