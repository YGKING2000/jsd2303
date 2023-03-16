package day02;

import java.util.Arrays;

/**
 * @ClassName VarDemo
 * @Description  变量的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/16 09:20
 * @Version 1.0
 */
public class VarDemo {
    public static void main(String[] args) {
        /* 变量的的声明 */
        // 声明了一个变量：a
        int a;
        // 声明了三个变量：b、c、d
        int b, c, d;
        
        /* 变量的初始化 */
        // 声明初始化同时进行
        int e = 250;
        // 先声明再初始化
        int f;
        f = 250;
        // 修改变量f的值
        f = 360;
        // 同时声明初始化多个变量
        int g = 3, h = 7, i = 9;
        
        /* 变量的使用 */
        int j = 10;
        int k = j + 5;
        System.out.println("k = " + k);// 15
        System.out.println("k");// k
        k = k + 10;
        System.out.println("k = " + k);
        
        /* 一、变量的命名规则 */
        // 1.以26个英文字母大小写、0~9、_和$组成
        // 2.严格区分大小写
        // 3.不能以数字开头
        // 4.不能是关键字和保留字，但可以包含关键字和保留字
        // 5.不能包含有空格
        /* 二、变量的命名规范 */
        // 1.包名：全小写
        // 2.变量和方法：小驼峰
        // 3.类和接口：大驼峰
        // 4.常量：全大写
        // 5.见名知意，不建议中文作为标识符
        
        /* 打印杨辉三角 */
        /*int[][] data= new int[10][];
        for (int l = 0; l < data.length; l++) {
            data[l] = new int[l + 1];
            data[l][0] = data[l][l] = 1;
            for (int m = 1; m < data[l].length - 1; m++) {
                data[l][m] = data[l - 1][m] + data[l - 1][m - 1];
            }
        }
        for (int[] item : data) {
            for (int item1 : item) {
                if (item1 < 10) {
                    System.out.print(item1 + "  ");
                } else {
                    System.out.print(item1 + " ");
                }
            }
            System.out.println();
        }*/
        
        /* 打印九九乘法表 */
        /*for (int l = 1; l < 10; l++) {
            for (int m = 1; m <= l; m++) {
                if (m == l) {
                    System.out.println(m + "*" + l + "=" + l * m);
                } else {
                    if (m == 2 && (l == 3 || l == 4)) {
                        System.out.print(m + "*" + l + "=" + l * m + "  ");
                    } else {
                        System.out.print(m + "*" + l + "=" + l * m + " ");
                    }
                }
            }
        }*/
    }
}
