package homework.apiday02.standard.second;

/**
 * @Description replaceAll方法的练习
 * @ClassName ReplaceAllExercise
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/04/03 20:37
 * @Version 1.0
 */
public class ReplaceAllExercise {
    public static void main(String[] args) {
        String code = "asf45ddf4SdDFd85sdf8aBDF5";
        String code1 = code.replaceAll("[0-9]", "_");
        String code2 = code.replaceAll("[0-9]+", "_");
        String code3 = code.replaceAll("[a-z]", "_");
        String code4 = code.replaceAll("[a-z]+", "_");
        System.out.println(code1);// asf__ddf_SdDFd__sdf_aBDF_
        System.out.println(code2);// asf_ddf_SdDFd_sdf_aBDF_
        System.out.println(code3);// ___45___4S_DF_85___8_BDF5
        System.out.println(code4);// _45_4S_DF_85_8_BDF5
    }
}
