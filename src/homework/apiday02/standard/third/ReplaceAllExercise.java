package homework.apiday02.standard.third;

/**
 * @Description replaceAll()方法的练习
 * @ClassName ReplaceAllExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 21:16
 * @Version 1.0
 */
public class ReplaceAllExercise {
    public static void main(String[] args) {
        String code = "sdf4959sfs834555ddw8w8CFdaHG765rFX";
        System.out.println(code.replaceAll("[0-9]+", "|"));// sdf|sfs|ddw|w|CFdaHG|rFX
        System.out.println(code.replaceAll("[a-z]+", "_"));// _4959_834555_8_8CF_HG765_FX
        System.out.println(code.replaceAll("[a-z]", "-"));// ---4959---834555---8-8CF--HG765-FX
        System.out.println(code.replaceAll("[0-9]", "_"));// sdf____sfs______ddw_w_CFdaHG___rFX
    }
}
