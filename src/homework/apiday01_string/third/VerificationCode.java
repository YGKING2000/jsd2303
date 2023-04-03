package homework.apiday01_string.third;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description
 * @ClassName VerificationCode
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/01 08:48
 * @Version 1.0
 */
public class VerificationCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = generateCode(4);
        System.out.println("验证码是：" + code);
        String answer;
        System.out.print("请输入验证码：");
        do {
            answer = scanner.nextLine();
            // if (answer.equalsIgnoreCase(code)) {
            if (answer.toUpperCase().equals(code.toUpperCase())) {
                System.out.println("恭喜你，验证码正确！");
                break;
            }
            System.out.print("验证码错误，请重新输入：");
        } while (true);
    }
    
    public static String generateCode(int length) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        String codes = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(codes.length());
            code.append(codes.charAt(index));
        }
        return code.toString();
    }
}
