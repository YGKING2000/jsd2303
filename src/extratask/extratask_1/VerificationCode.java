package extratask.extratask_1;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName VerificationCOde
 * @Description 随机生成N位验证码————练习数组、循环和方法
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/25 09:18
 * @Version 1.0
 */
public class VerificationCode {
    /*public static void main(String[] args) {
        String code = generateVeriCode(6);
        System.out.println("验证码是：" + code);
    }
    
    // 生成指定长度验证码的方法
    public static String generateVeriCode(int length) {
        String code = "";
        Random random = new Random();
        char[]  chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chs.length);
            code += chs[index];
        }
        return code;
    }*/
    
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你想要生成的验证码位数：");
        int length = scanner.nextInt();

        String code = generateVeriCode(length);
        System.out.println("验证码是：" + code);
    }

    public static String generateVeriCode(int length) {
        String code = "";
        Random random = new Random();
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chs.length);
            code += chs[index];
        }
        return code;
    }*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你想生成的验证码长度：");
        int length = scanner.nextInt();
        String code = generateVeriCode(length);
    
        System.out.println(code);
        System.out.print("请输入验证码：");
        String result = scanner.next();
        while (!(result.equals(code))) {
            System.out.println("验证码输入错误，请重新输入！");
            result = scanner.next();
        }
        System.out.println("恭喜你，验证码通过！");
    }
    
    public static String generateVeriCode(int length) {
        String code = "";
        Random random = new Random();
        String codes = "abcdefghijklmnopqrstuvwxyzABCDEDGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(codes.length());
            code += codes.charAt(index);
        }
        return code;
    }
}
