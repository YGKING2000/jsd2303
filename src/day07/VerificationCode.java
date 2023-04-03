package day07;

import object.Point;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName VerificationCode
 * @Description 生成N位验证码
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 09:51
 * @Version 1.0
 */
public class VerificationCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("你想生成的验证码位数：");
        int length = scanner.nextInt();
        // String code = getVeriCode(length);
        String code = getVerificationCode(length);
        System.out.println(code);
        System.out.print("请输入验证码：");
        while (true) {
            String userCode = scanner.next();
            if (userCode.equalsIgnoreCase(code)) {
                System.out.println("验证码输入正确！");
                break;
            }
            System.out.print("验证码错误，请重新输入：");
        }
    }
    
    // 1.生成指定位数的验证码的方法————直接生成char型字符
    public static String getVeriCode(int length) {
        Random random = new Random();
        // 返回值的初始字符串
        StringBuilder code = new StringBuilder();
        // 控制生成数字、大写字母或者小写字母
        int index;
        // 控制生成具体的某个字符
        int num;
        for (int i = 0; i < length; i++) {
            index = random.nextInt(3);
            if (index == 0) {
                num = random.nextInt(10) + 48;
            } else if (index == 1) {
                num = random.nextInt(26) + 65;
            } else {
                num = random.nextInt(26) + 97;
            }
            code.append((char) num);
        }
        return code.toString();
    }
    
    // 2.生成指定位数的验证码的方法————生成数组下标
    public static String getVerificationCode(int length) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        /*char[] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(data.length);
            code.append(data[index]);
        }*/
        String codes = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(codes.length());
            code.append(codes.charAt(index));
        }
        return code.toString();
    }
}
