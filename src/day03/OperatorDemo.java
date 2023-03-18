package day03;

/**
 * @ClassName OperatorDemo
 * @Description 算术运算符的演示
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/17 09:17
 * @Version 1.0
 */
public class OperatorDemo {
    public static void main(String[] args) {
        /* 一、算数运算符: +  -  *  /  %  ++  -- */
        // 1.取余运算符%: 取模/取余，余数为0即为整除
        System.out.println(5 % 2);// 1
        System.out.println(8 % 2);// 0
        System.out.println(2 % 5);// 2
        
        // 2.自增/自减运算符++/--: 自增1/自减1，可以在变量前，也可在变量后
        // (1)单独使用时，在前在后都一样
        int a = 7, b = 7;
        a++;
        ++b;
        System.out.println(a);// 8
        System.out.println(b);// 8
        int c = 9, d = 9;
        c--;
        --d;
        System.out.println(c);// 8
        System.out.println(d);// 8
        
        // (2)被使用时，在前在后不一样
        // 在前面时，先自身运算再被使用
        // 在后面时，先被使用再自身运算
        int e = 3, f = 3;
        int g = ++e;
        int h = f++;
        System.out.println(e);// 4
        System.out.println(f);// 4
        System.out.println(g);// 4
        System.out.println(h);// 3
        
        int i = 9, j = 9;
        int k = --i;
        int l = j--;
        System.out.println(i);// 8
        System.out.println(j);// 8
        System.out.println(k);// 8
        System.out.println(l);// 9
        
        /* 二、关系运算符: >  <  >=  <=  ==  != */
        // 关系运算的结果是boolean类型，关系成立则为true，关系不成立则为false
        int m = 5, n = 10, o = 5;
        boolean b1 = m > n;
        System.out.println(b1);// false
        System.out.println(o < n);// true
        System.out.println(m >= o);// true
        System.out.println(m <= n);// true
        System.out.println(m == o);// true
        System.out.println(m != o);// false
        System.out.println();
        System.out.println(m % 2 == 0);// false
        System.out.println(m + o > n);// false
        System.out.println(m++ > o);// false
        System.out.println(m++ > o);// true
        System.out.println();
        
        /* 三、逻辑运算符: &  |  && ||  ! */
        // &&: 短路与(并且)，两边都为真则为真，见false则false
        // ||: 短路或(或者)，有真则为真，见true则true
        // &: 逻辑与(并且)，两边都为真则为真，见false则false
        // |: 逻辑或(或者)，有真则为真，见true则true
        // !: 逻辑非(取反)，非真则假，非假则真
        // &&与&、||与|的差别:
        // ||如果第一个条件为true，则不会再判断后面的条件，直接返回表达式的值；|不论什么情况都会判断完所有的条件后再返回表示式的值
        System.out.println(true && true);// true
        System.out.println(true && false);// false
        System.out.println(false && true);// false
        System.out.println(false && false);// false
        System.out.println(false || false);// false
        System.out.println(false || true);// true
        System.out.println(true || false);// true
        System.out.println(true || true);// true
        System.out.println();
        
        // 判断年龄是否在[18, 60]之间
        int age = 18;
        System.out.println(age >= 18 && age <= 60);// true
        // 判断成绩是否在[0, 100]之间
        int score = 86;
        System.out.println(score >= 0 && score <= 100);// true
        System.out.println();
        
        boolean b2 = !(age > score);
        System.out.println(b2);// true
        boolean b3 = !(age < score);
        System.out.println(b3);// false
        System.out.println();
        
        int num = 3, num1 = 7, num2 = 9;
        boolean b4 = num > num1 && num2++ > 10;
        System.out.println(b4);// false
        System.out.println(num2);// 9
        boolean b5 = num < num1 || ++num2 > 10;
        System.out.println(b5);// true
        System.out.println(num2);// 9
        System.out.println();
        
        /* 四、赋值运算符: =  +=   -=  *=  /=  %= */
        // 1.简单赋值运算符: =
        // 2.扩展赋值运算符: +=   -=  *=  /=  %=
        // 注意事项: 扩展运算符自带强制类型转作用，会将结果转换成需要的数据类型
        int x = 5;
        x += 10;
        System.out.println(x);// 15
        x *= 2;
        System.out.println(x);// 30
        x /= 6;
        System.out.println(x);// 5
        
        /* 面试题 */
        short s = 5;
        // s = s + 5;// 编译失败，s + 5的结果是int型，s是short型，类型不匹配
        s += 5;// 扩展运算符自带强制类型转作用，会将结果转换成需要的数据类型
        System.out.println();
        
        /* 五、字符串连接运算符: + */
        // 1.若加号两边都是数值，则做加法运算
        // 2.若加号两边至少有一个是字符串，则做连接运算
        int age1 = 23;
        System.out.println("age1 = ");// age1 =
        System.out.println(age1);// 23
        System.out.println("age1 = " + age1);// age1 = 23
        System.out.println("我今年" + age1 + "岁了");// 我今年23岁了
    
        String name = "黄仁东";
        System.out.println("大家好，我叫" + name);// 大家好，我叫黄仁东
        System.out.println("大家好，我叫" + name + "，今年" + age1 + "岁了");// 大家好，我叫黄仁东，今年23岁了
        System.out.println();
        
        // 3.任何数据类型和字符串做连接运算后，结果都是字符串
        System.out.println(10 + 20 + "" + 30);// 3030
        System.out.println("" + 10 + 20 + 30);// 102030
        System.out.println(10 + 20 + 30 + "");// 60
        System.out.println('*' + "\t" + '*');// *   *
        System.out.println("*\t*");// *   *
        System.out.println('*' + '\t' + '*');// 93
        System.out.println('*' + '\t' + "*");// 51*
        System.out.println();
        
        /* 六、条件运算符: 条件表达式 ? 表达式1 : 表达式2; */
        // 若条件表达式成立值为true，整个式子的值为表达式1，否则整个式子的值为表达式2
        int number = 3;
        int flag = number > 0 ? 7 : 9;
        System.out.println(flag);// 7
        
        int number1 = 7, number2 = 9;
        int max = number1 > number2 ? number1 : number2;
        // max = Math.max(number1, number2);
        System.out.println(max);// 9
    }
}
