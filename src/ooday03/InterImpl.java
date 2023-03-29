package ooday03;

/**
 * @Description 接口实现类
 * @ClassName InterImpl
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 11:03
 * @Version 1.0
 */
public class InterImpl implements Inter, Inter2 {
    
    @Override
    public void show() {

    }
    
    @Override
    public void test() {
    
    }
    
    @Override
    public void eat() {
        Inter.super.eat();
    }
    
    // @Override
    // public void eat() {
    //     Inter.super.eat();
    // }
    
    @Override
    public void sleep() {
    
    }
}

interface Inter1 {
    void eat();
}

interface Inter2 extends Inter1 {
    void sleep();
}