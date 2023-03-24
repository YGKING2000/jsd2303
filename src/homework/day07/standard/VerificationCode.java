package homework.day07.standard;

import java.util.Random;

/**
 * @ClassName VerificationCode
 * @Description 生成N位验证码
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/23 18:57
 * @Version 1.0
 */
public class VerificationCode {
    public static void main(String[] args) {
        // String code = generateVericode(6);
        String code = generateVerificationCode(6);
        // String code = generateCode(6);
        System.out.println(code);
    }
    
    // 1.生成指定长度的验证码
    /*public static String generateVericode(int length) {
        Random random = new Random();
        String code = "";
        char[] codes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(codes.length);
            code += codes[index];
        }
        return code;
    }*/
    
    /*public static String generateVericode(int length) {
        Random random = new Random();
        String code = "";
        char[] codes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(codes.length);
            code += codes[index];
        }
        return code;
    }*/
    
    public static String generateVericode(int length) {
        String code = "";
        Random random = new Random();
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(62);
            code += chs[index];
        }
        return code;
    }
    
    // 2.生成指定长度的验证码
    /*public static String generateVerificationCode(int length) {
        Random random = new Random();
        String codes = "";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(3);
            int num;
            if (index == 0) {
                num = random.nextInt(10) + 48;
            } else if (index == 1){
                num = random.nextInt(26) + 65;
            } else {
                num = random.nextInt(26) + 97;
            }
            codes += (char) num;
        }
        return codes;
    }*/
    
    public static String generateVerificationCode(int length) {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(3);
            int num;
            if (index == 0) {
                num = random.nextInt(10) + 48;
            } else if (index == 1) {
                num = random.nextInt(26) + 65;
            } else {
                num = random.nextInt(26) + 97;
            }
            code += (char) num;
        }
        return code;
    }
    
    // 3.生成指定长度的验证码
    public static String generateCode(int length) {
        Random random = new Random();
        String code = "";
        String codes = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(62);
            char c = codes.charAt(index);
            code += c;
        }
        return code;
    }
}
