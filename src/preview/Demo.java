package preview;

/**
 * @Description
 * @ClassName Demo4
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/29 14:13
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        // double a = 3.333;
        // int b = (int) a;
        // System.out.println(a + ", " + b);// 3.333, 3
        // System.out.println("--------------------------------------------");
    
        // static int c = 3;// Modifier(修饰语) 'static' not allowed here
        // System.out.println("--------------------------------------------");
        
        Father father = new Father();
        Son son = new Son();
        System.out.println(father instanceof Father);//true
        System.out.println(father instanceof Son);// false
        System.out.println(son instanceof Father);// true
        System.out.println(son instanceof Son);// true
        System.out.println("--------------------------------------------");
    
        
        int a = 5;
        double b = 1.0;
        a += b;
        // a = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------------------------------------");
        
        
        // 0111 1111
        // 0111 1111
        // 0111 1111
        // 1000 0000
        // -127
        // 1111 1111
        // 1000 0000
        // 1000 0001
        // 128
        // 1000 0000
        byte b1 = 127;
        // 00000001 00000000
        //          00000000
        int i = 256;
        b1 += i;
        System.out.println(b1);
        
        //
    }
}

class Father {}

class Son extends Father {}
