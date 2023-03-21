package homework.day05.standard;

/**
 * @ClassName ArrayExercises
 * @Description 数组代码练习：声明、初始化、访问、遍历
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/21 17:56
 * @Version 1.0
 */
public class ArrayExercises {
    public static void main(String[] args) {
        // 1.声明
        int[] arr;
        byte[] bytes;
        short[] shorts;
        char[] chars;
        boolean[] booleans;
        long[] longs;
        float[] floats;
        double[] doubles;
        
        // 2.初始化
        arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        bytes = new byte[]{1, 0, -128, 127};
        shorts = new short[]{56, 45, 96, 32, 21, 74, 84};
        chars = new char[]{97, '4', 'c', 45, '\\', 65, '\'', 100};
        booleans = new boolean[]{true, false, true, true, false, false, false, true};
        longs = new long[]{1, 485L, 852, 465L, 85218, 76315L, 15L};
        floats = new float[]{43, 5.5F, 0.9F, 954F, 0, -89.9F};
        doubles = new double[]{2.5, 0.0, 0, 2601540.154, 15.123652, 3.1415926};
        
        // 3.访问
        arr[0] = 6;
        arr[arr.length - 1] = 0;
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
        System.out.println(bytes[2]);
        System.out.println(shorts[shorts.length - 1]);
        System.out.println(booleans.length);
        System.out.println(longs[3]);
        System.out.println(floats[floats.length - 1]);
        System.out.println(doubles[0]);
        
        // 只有类型为char的数组在直接打印时，会将数组中的元素打印出来
        System.out.println(chars);// a4c-\A'd
        // 其它类型的数组打印时都只会打印类型和地址值
        System.out.println(doubles);// [D@14ae5a5
        System.out.println(floats);// [F@7f31245a
        System.out.println(booleans);// [Z@6d6f6e28
        System.out.println(arr);// [I@135fbaa4
        
        // 4.遍历
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
        
        // 1.声明
        byte[] bytes1;
        short[] shorts1;
        int[] arr1;
        long[] longs1;
        float[] floats1;
        double[] doubles1;
        char[] chars1;
        boolean[] booleans1;
        
        // 2.初始化
        bytes1 = new byte[]{1, 0, -128, 127};
        shorts1 = new short[]{11, 52, 22, 32, 25, 21, 47};
        arr1 = new int[]{21, 13, 6, 94, 11, 26, 50, 11};
        longs1 = new long[]{1, 485L, 852, 465L, 85218, 76315L, 15L};
        floats1 = new float[]{351, 6.6F, 888.888F, 4F, 0.0006F, -89.312F};
        doubles1 = new double[]{2.51236, 0.000004, 10000000, 1152.84, 2.3652, 132.59955};
        chars1 = new char[]{39, 'Y', 'B', 65535, '/', 65, '"', 132};
        booleans1 = new boolean[]{true, true, false, true, true, false, true, true};
        
        // 3.访问
        arr1[0] = 888;
        arr1[arr1.length - 1] = 666;
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);
        System.out.println(doubles1[0]);
        System.out.println(shorts1[shorts1.length - 2]);
        System.out.println(bytes1[2]);
        System.out.println(longs1[5]);
        System.out.println(floats1[floats1.length - 3]);
        System.out.println(booleans1.length);
        
        // 4.遍历
        for (char item : chars1) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int i = chars1.length - 1; i >= 0; i--) {
            System.out.print(chars1[i] + " ");
        }
    }
}
