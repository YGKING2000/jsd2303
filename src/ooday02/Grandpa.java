package ooday02;

/**
 * @Description 祖父类
 * @ClassName Grandpa
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 17:18
 * @Version 1.0
 */
public class Grandpa {
    public Father eat() {
        // return new Grandpa();// 编译失败，Grandpa类的对象类型大于Father类的对象
        // return new Father();// 编译成功
        return new Son();// 编译成功
    }
}

/**
 * @Description 超类
 * @ClassName Father
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 17:18
 * @Version 1.0
 */
class Father extends Grandpa {}

/**
 * @Description 派生类
 * @ClassName Son
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/27 17:18
 * @Version 1.0
 */
class Son extends Father {}
